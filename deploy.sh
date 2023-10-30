#!bin/bash 

set -e

APP_NAMESPACE=''
APP_HOST='avnue.co'
APP_HOST_PREFIX='www'
APP_NAME='SteVe'
ENV_NAME="${APP_NAME}-dev"
#AWS_CDN_IDS=('EMBP8MNRKYBID' 'E1T615VMVADQ5U' 'E3PLVG0G4L3KXX') # 0: prd, 1: stg, 2: dev
AWS_PROFILE='avnue'
AWS_REGION='us-east-2'
AWS_ACCOUNT='173477957341'
VERSION_LABEL=$ENV_NAME
BUNDLE_KEY="steve-${VERSION_LABEL}.zip"
VERSION_BUILD=0

checkBuildNumber () {
    query=($(aws elasticbeanstalk describe-application-versions --application-name ${APP_NAME} --version-label "${VERSION_LABEL}-${VERSION_BUILD}" --output text --profile ${AWS_PROFILE}))
    if  [ ${#query} -ge 1 ];
    then
        VERSION_BUILD=$((VERSION_BUILD + 1))
        checkBuildNumber
    fi
}
checkBuildNumber
VERSION_LABEL="${VERSION_LABEL}-${VERSION_BUILD}"

zipCreated=$(zip -r -q "artifact.zip" ./)

STACK_BUCKET="elasticbeanstalk-${AWS_REGION}-${AWS_ACCOUNT}"

QUIET=$(aws s3 cp artifact.zip s3://${STACK_BUCKET}/${BUNDLE_KEY} --profile ${AWS_PROFILE})

QUIET=$(aws elasticbeanstalk create-application-version --application-name "${APP_NAME}" --version-label "${VERSION_LABEL}" --description "${VERSION_DESCRIPTION}" --source-bundle S3Bucket=${STACK_BUCKET},S3Key=${BUNDLE_KEY} --profile ${AWS_PROFILE} --region ${AWS_REGION} --process);

QUIET=$(aws elasticbeanstalk update-environment --environment-name "${ENV_NAME}" --version-label ${VERSION_LABEL} --profile ${AWS_PROFILE} --region ${AWS_REGION});

rm artifact.zip
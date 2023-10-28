/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables.records;


import jooq.steve.db.enums.TransactionStopEventActor;
import jooq.steve.db.tables.Transaction;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransactionRecord extends TableRecordImpl<TransactionRecord> implements Record11<Integer, Integer, String, DateTime, DateTime, String, TransactionStopEventActor, DateTime, DateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>stevedb.transaction.transaction_pk</code>.
     */
    public TransactionRecord setTransactionPk(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.transaction_pk</code>.
     */
    public Integer getTransactionPk() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>stevedb.transaction.connector_pk</code>.
     */
    public TransactionRecord setConnectorPk(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.connector_pk</code>.
     */
    public Integer getConnectorPk() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>stevedb.transaction.id_tag</code>.
     */
    public TransactionRecord setIdTag(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.id_tag</code>.
     */
    public String getIdTag() {
        return (String) get(2);
    }

    /**
     * Setter for <code>stevedb.transaction.start_event_timestamp</code>.
     */
    public TransactionRecord setStartEventTimestamp(DateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.start_event_timestamp</code>.
     */
    public DateTime getStartEventTimestamp() {
        return (DateTime) get(3);
    }

    /**
     * Setter for <code>stevedb.transaction.start_timestamp</code>.
     */
    public TransactionRecord setStartTimestamp(DateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.start_timestamp</code>.
     */
    public DateTime getStartTimestamp() {
        return (DateTime) get(4);
    }

    /**
     * Setter for <code>stevedb.transaction.start_value</code>.
     */
    public TransactionRecord setStartValue(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.start_value</code>.
     */
    public String getStartValue() {
        return (String) get(5);
    }

    /**
     * Setter for <code>stevedb.transaction.stop_event_actor</code>.
     */
    public TransactionRecord setStopEventActor(TransactionStopEventActor value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.stop_event_actor</code>.
     */
    public TransactionStopEventActor getStopEventActor() {
        return (TransactionStopEventActor) get(6);
    }

    /**
     * Setter for <code>stevedb.transaction.stop_event_timestamp</code>.
     */
    public TransactionRecord setStopEventTimestamp(DateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.stop_event_timestamp</code>.
     */
    public DateTime getStopEventTimestamp() {
        return (DateTime) get(7);
    }

    /**
     * Setter for <code>stevedb.transaction.stop_timestamp</code>.
     */
    public TransactionRecord setStopTimestamp(DateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.stop_timestamp</code>.
     */
    public DateTime getStopTimestamp() {
        return (DateTime) get(8);
    }

    /**
     * Setter for <code>stevedb.transaction.stop_value</code>.
     */
    public TransactionRecord setStopValue(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.stop_value</code>.
     */
    public String getStopValue() {
        return (String) get(9);
    }

    /**
     * Setter for <code>stevedb.transaction.stop_reason</code>.
     */
    public TransactionRecord setStopReason(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction.stop_reason</code>.
     */
    public String getStopReason() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, String, DateTime, DateTime, String, TransactionStopEventActor, DateTime, DateTime, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, Integer, String, DateTime, DateTime, String, TransactionStopEventActor, DateTime, DateTime, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Transaction.TRANSACTION.TRANSACTION_PK;
    }

    @Override
    public Field<Integer> field2() {
        return Transaction.TRANSACTION.CONNECTOR_PK;
    }

    @Override
    public Field<String> field3() {
        return Transaction.TRANSACTION.ID_TAG;
    }

    @Override
    public Field<DateTime> field4() {
        return Transaction.TRANSACTION.START_EVENT_TIMESTAMP;
    }

    @Override
    public Field<DateTime> field5() {
        return Transaction.TRANSACTION.START_TIMESTAMP;
    }

    @Override
    public Field<String> field6() {
        return Transaction.TRANSACTION.START_VALUE;
    }

    @Override
    public Field<TransactionStopEventActor> field7() {
        return Transaction.TRANSACTION.STOP_EVENT_ACTOR;
    }

    @Override
    public Field<DateTime> field8() {
        return Transaction.TRANSACTION.STOP_EVENT_TIMESTAMP;
    }

    @Override
    public Field<DateTime> field9() {
        return Transaction.TRANSACTION.STOP_TIMESTAMP;
    }

    @Override
    public Field<String> field10() {
        return Transaction.TRANSACTION.STOP_VALUE;
    }

    @Override
    public Field<String> field11() {
        return Transaction.TRANSACTION.STOP_REASON;
    }

    @Override
    public Integer component1() {
        return getTransactionPk();
    }

    @Override
    public Integer component2() {
        return getConnectorPk();
    }

    @Override
    public String component3() {
        return getIdTag();
    }

    @Override
    public DateTime component4() {
        return getStartEventTimestamp();
    }

    @Override
    public DateTime component5() {
        return getStartTimestamp();
    }

    @Override
    public String component6() {
        return getStartValue();
    }

    @Override
    public TransactionStopEventActor component7() {
        return getStopEventActor();
    }

    @Override
    public DateTime component8() {
        return getStopEventTimestamp();
    }

    @Override
    public DateTime component9() {
        return getStopTimestamp();
    }

    @Override
    public String component10() {
        return getStopValue();
    }

    @Override
    public String component11() {
        return getStopReason();
    }

    @Override
    public Integer value1() {
        return getTransactionPk();
    }

    @Override
    public Integer value2() {
        return getConnectorPk();
    }

    @Override
    public String value3() {
        return getIdTag();
    }

    @Override
    public DateTime value4() {
        return getStartEventTimestamp();
    }

    @Override
    public DateTime value5() {
        return getStartTimestamp();
    }

    @Override
    public String value6() {
        return getStartValue();
    }

    @Override
    public TransactionStopEventActor value7() {
        return getStopEventActor();
    }

    @Override
    public DateTime value8() {
        return getStopEventTimestamp();
    }

    @Override
    public DateTime value9() {
        return getStopTimestamp();
    }

    @Override
    public String value10() {
        return getStopValue();
    }

    @Override
    public String value11() {
        return getStopReason();
    }

    @Override
    public TransactionRecord value1(Integer value) {
        setTransactionPk(value);
        return this;
    }

    @Override
    public TransactionRecord value2(Integer value) {
        setConnectorPk(value);
        return this;
    }

    @Override
    public TransactionRecord value3(String value) {
        setIdTag(value);
        return this;
    }

    @Override
    public TransactionRecord value4(DateTime value) {
        setStartEventTimestamp(value);
        return this;
    }

    @Override
    public TransactionRecord value5(DateTime value) {
        setStartTimestamp(value);
        return this;
    }

    @Override
    public TransactionRecord value6(String value) {
        setStartValue(value);
        return this;
    }

    @Override
    public TransactionRecord value7(TransactionStopEventActor value) {
        setStopEventActor(value);
        return this;
    }

    @Override
    public TransactionRecord value8(DateTime value) {
        setStopEventTimestamp(value);
        return this;
    }

    @Override
    public TransactionRecord value9(DateTime value) {
        setStopTimestamp(value);
        return this;
    }

    @Override
    public TransactionRecord value10(String value) {
        setStopValue(value);
        return this;
    }

    @Override
    public TransactionRecord value11(String value) {
        setStopReason(value);
        return this;
    }

    @Override
    public TransactionRecord values(Integer value1, Integer value2, String value3, DateTime value4, DateTime value5, String value6, TransactionStopEventActor value7, DateTime value8, DateTime value9, String value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionRecord
     */
    public TransactionRecord() {
        super(Transaction.TRANSACTION);
    }

    /**
     * Create a detached, initialised TransactionRecord
     */
    public TransactionRecord(Integer transactionPk, Integer connectorPk, String idTag, DateTime startEventTimestamp, DateTime startTimestamp, String startValue, TransactionStopEventActor stopEventActor, DateTime stopEventTimestamp, DateTime stopTimestamp, String stopValue, String stopReason) {
        super(Transaction.TRANSACTION);

        setTransactionPk(transactionPk);
        setConnectorPk(connectorPk);
        setIdTag(idTag);
        setStartEventTimestamp(startEventTimestamp);
        setStartTimestamp(startTimestamp);
        setStartValue(startValue);
        setStopEventActor(stopEventActor);
        setStopEventTimestamp(stopEventTimestamp);
        setStopTimestamp(stopTimestamp);
        setStopValue(stopValue);
        setStopReason(stopReason);
    }
}

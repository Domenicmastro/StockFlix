package model;

// a singleton class for logging
public class TransactionLog {
    public static TransactionLog transactionLog = new TransactionLog();

    private TransactionLog() {}

    public static TransactionLog getInstance() {
        return transactionLog;
    }

    private void addEvent(Event e) {

    }


}

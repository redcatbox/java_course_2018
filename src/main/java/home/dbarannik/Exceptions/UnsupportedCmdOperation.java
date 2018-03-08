package home.dbarannik.Exceptions;

public class UnsupportedCmdOperation extends Exception {
    private String operation;

    public UnsupportedCmdOperation(String operation) { this.operation = operation; }

    public String getOperation() { return operation; }
}

package exceptions;

public class InvalidEmployeeDataException extends Exception {

    public InvalidEmployeeDataException() {
        super("Employee data not served in correct form.");
    }
}

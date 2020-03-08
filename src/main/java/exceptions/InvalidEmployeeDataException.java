package exceptions;

public class InvalidEmployeeDataException extends Throwable {

    public InvalidEmployeeDataException() {
        super("Employee data not served in correct form.");
    }
}

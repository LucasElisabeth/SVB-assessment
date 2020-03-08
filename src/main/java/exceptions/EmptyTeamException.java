package exceptions;

public class EmptyTeamException extends Exception {

    public EmptyTeamException() {
        super("Team does not contain employees.");
    }
}

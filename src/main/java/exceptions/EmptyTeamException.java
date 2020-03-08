package exceptions;

public class EmptyTeamException extends Throwable {

    public EmptyTeamException() {
        super("Team does not contain employees.");
    }
}

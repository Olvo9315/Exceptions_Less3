package My_Exceptions;

public class InvalidNameFormatException extends MyAppException {
    public InvalidNameFormatException() {
        super("Неверный формат имени, фамилии или отчества");
    }
}

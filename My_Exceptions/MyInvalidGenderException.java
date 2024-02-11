package My_Exceptions;

public class MyInvalidGenderException extends MyAppException {
    public MyInvalidGenderException() {
        super("Неверный формат номера телефона");
    }
}

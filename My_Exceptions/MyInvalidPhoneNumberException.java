package My_Exceptions;

public class MyInvalidPhoneNumberException extends MyAppException {
    public MyInvalidPhoneNumberException() {
        super("Неверный формат номера телефона");
    }
}

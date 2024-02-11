package My_Exceptions;

public class MyDateFormatException extends MyAppException {
    public MyDateFormatException() {
            super("Неверный формат даты рождения");
        }
}

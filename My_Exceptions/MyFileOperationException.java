package My_Exceptions;

public class MyFileOperationException extends MyAppException {
    public MyFileOperationException() {
        super("Ошибка ввода-вывода при работе с файлом");
    }
}
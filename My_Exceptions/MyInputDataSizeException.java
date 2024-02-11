package My_Exceptions;

class MyInputDataSizeException extends MyAppException {
    public MyInputDataSizeException() {
        super("Неверное количество данных");
    }
}
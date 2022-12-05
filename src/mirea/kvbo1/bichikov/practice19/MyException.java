package mirea.kvbo1.bichikov.practice19;

public class MyException extends Exception {
    public MyException(String errorMessage) {
        super(errorMessage);
    }

    public MyException() {
        super("Неизвестная ошибка");
    }
}

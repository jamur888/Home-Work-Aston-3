package Rantai;

public class Main {
    public static void main(String[] args) {
        Handler logger = new LogHandler();
        Handler auth = new AuthHandler();

        // Сборка цепочки
        logger.setNext(auth);

        logger.handle("AUTH"); // Передастся в AuthHandler
        logger.handle("LOG");  // Обработается в LogHandler
    }
}
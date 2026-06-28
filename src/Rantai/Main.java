package Rantai;

public class Main {
    public static void main(String[] args) {
        Handler logger = new LogHandler();
        Handler auth = new AuthHandler();

        logger.setNext(auth);

        logger.handle("AUTH");
        logger.handle("LOG");
    }
}
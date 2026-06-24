package Rantai;

abstract class Handler {
    protected Handler nextHandler;

    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(String request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
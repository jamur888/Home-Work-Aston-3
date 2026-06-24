package Rantai;

class LogHandler extends Handler {
    @Override
    public void handle(String request) {
        if ("LOG".equals(request)) {
            System.out.println("LogHandler: Запрос залогирован.");
        } else {
            super.handle(request);
        }
    }
}
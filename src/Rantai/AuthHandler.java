package Rantai;

class AuthHandler extends Handler {
    @Override
    public void handle(String request) {
        if ("AUTH".equals(request)) {
            System.out.println("AuthHandler: Аутентификация успешна.");
        } else {
            super.handle(request);
        }
    }
}


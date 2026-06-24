package Proxy;

class ProxySubject implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            System.out.println("Proxy: Ленивая инициализация реального объекта...");
            realSubject = new RealSubject();
        }
        System.out.println("Proxy: Проверка прав доступа перед вызовом.");
        realSubject.request();
        System.out.println("Proxy: Логирование вызова завершено.");
    }
}
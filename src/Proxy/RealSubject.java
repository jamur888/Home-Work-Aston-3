package Proxy;

class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Выполнение бизнес-логики.");
    }
}
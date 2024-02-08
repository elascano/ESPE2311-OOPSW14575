package ec.edu.espe.q3851.model;

public class A {
    private A a;

    public A() {
        System.out.println("An 'A' class has been instantiated");
    }

    public A(A a) {
        this.a = a;
        System.out.println("An 'A' class with 'a' parameter has been instantiated");
    }

    @Override
    public String toString() {
        return "A [a=" + a + "]";
    }
}

abstract class abstractClass {
    abstract void abstractMethod();
    void concreteMethod() {
        System.out.println("This is a concrete method");
    }
}
interface X {
    // Abstract classes with only abstract methods
    // should be defined as interfaces.
}
abstract class abstractClass2 implements X {
    // implements all but one method of Y
}

class XX extends abstractClass2 {
    // implements the remaining method in Y
}

class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod");
    }
}
class C extends abstractClass {
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod");
    }
}
public class abstractClasses {
    public static void main(String[] args) {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();
        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}
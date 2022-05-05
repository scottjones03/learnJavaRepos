public class interfaces {
    // Note these two important points about interfaces:

    // If a class implements an interface, 
    // all of the interface's methods must appear in the class.
    // The implements keyword is used when creating a class 
    // that is modeled after an interface.
    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        Dog d = new Dog();
        System.out.println(d.feed(true));
        System.out.println(g.feed(true));
    }
}
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
class Dog implements Animal {
    // Implements all methods in Animal interface
    public boolean feed(boolean timeToEat) {
        return true;
    }
    public void groom() {}
    public void pet() {}
}
class Gorilla implements Animal {
    public boolean feed(boolean timeToEat) {
        return false;
    }
    public void groom() {}
    public void pet() {}
}
class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Student2 {
    private String firstName;
    private String secondName;
    public Student2(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public void printFullName(){
        System.out.println(firstName + " " + secondName);
    }

}
public class functions {
    
    public static void foo() {}
    public static void bar(int num1, int num2) {}
    public void bar2(Student s1, Student s2) {}
    public static void main(String[] args) {
        int i1 =3;
        int i2 =5;
        bar(i1, i2);

        Student s = new Student();
        s.setName("Joe");
        String name = s.getName();

        System.out.println(name);
        
        Student2[] students = new Student2[] {
            new Student2("Morgan", "Freeman"),
            new Student2("Brad", "Pitt"),
            new Student2("Kevin", "Spacey"),
        };
        for (Student2 s2 : students) {
            s2.printFullName();
        }

    }
}
public class conditionals {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        boolean result;
        result = a < b; // true
        result = a > b; // false
        result = a <= 4; // a smaller or equal to 4 - true
        result = b >= 6; // b bigger or equal to 6 - false
        result = a == b; // a equal to b - false
        result = a != b; // a is not equal to b - true
        result = a > b || a < b; // Logical or - true
        result = 3 < a && a < 6; // Logical and - true
        result = !result; // Logical not - false

        boolean b1 = a == 4;

        if (b1) {
            System.out.println("It's true!");
        }
        else {
            System.out.println("It's false!");
        }

        String s1 = new String("Wow");
        String s2 = new String("Wow");
        String sameS1 = s1;

        boolean r1 = s1 == s2;      
        if (r1) {
            System.out.println("Error!");
        }
        else {
            System.out.println("This is false, since s1 and s2 are not the same object");
        }
        boolean r2 = s1.equals(s2); 
        if (r2) {
            System.out.println("This is true, since a and b are logically equals");
        }
        boolean r3 = s1 == sameS1;  
        if (r3) {
            System.out.println("This is true, since a and sameA are really the same object");
        }
    }
}

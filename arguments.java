// Compite and run by: 
// javac arguments.java
// java arguments "Hello" "World" 
public class arguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
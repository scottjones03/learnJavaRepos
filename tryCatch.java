public class tryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            System.out.println(arr[9001]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }
}

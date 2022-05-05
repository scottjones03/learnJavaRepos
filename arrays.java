public class arrays {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        if (arr1.length == 10)
        {
            System.out.println("Length of arr1 is 10");
        }
        arr1[0] = 1;
        arr1[1] = arr1[0];
        // for (int i = 2; i < arr1.length; i++) {
        //     arr1[i] = arr1[i-1] + arr1[i-2];
        // }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        
        
        int[] arr2 ={1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

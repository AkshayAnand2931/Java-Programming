import java.util.Arrays;

public class ArrayDemo {
    
    public static void main(String[] args) {
        
        int arr[] = {10,6,30};
        int arr1[] = {10,6,31};
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr);
        int key = 30;
        System.out.println(Arrays.binarySearch(arr, key));

        key = 30;
        System.out.println(Arrays.binarySearch(arr, key));

        System.out.println(Arrays.equals(arr, arr1));
        System.out.println(Arrays.mismatch(arr, arr1));

        Arrays.sort(arr1);
        System.out.println(Arrays.equals(arr, arr1));

        int copy[] = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(copy));
    }
}

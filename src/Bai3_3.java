import java.util.Arrays;
public class Bai3_3 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7,8,6};
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
        System.out.println("Mang sau khi dao: " + Arrays.toString(arr));
    }
}

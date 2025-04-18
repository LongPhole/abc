import java.util.ArrayList;
public class Bai3_1 {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,7,8,9,10};
        int dem=0;
        int tong=0;
        for(int i : arr){
            if(i%2==0) {
                tong += i;
                dem++;
            }
        }
        int tbc = tong/dem;
        System.out.println("Trung binh cong so chan trong mang la: " + tbc);
    }
}

import java.util.Scanner;
public class Bai2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen to n: ");
        int n = sc.nextInt();
        for(int i = 2 ; i < n ; i++){
            if(n % i != 0){
                System.out.println("Long dep trai");
            }
        }
    }
}

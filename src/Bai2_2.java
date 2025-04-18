import java.util.Scanner;
public class Bai2_2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap vao so n: ");
       int n = sc.nextInt();
       int tong=0;
       for (int i = 0 ; i <= n ; i++){
           if(i%2 == 1){
               tong +=i;
           }
       }
       System.out.println("Tong cac so le tu 1 den n la: "+tong);
    }
}

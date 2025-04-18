import java.util.Arrays;
import java.util.Scanner;
public class Bai4_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n va m");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] x = new int[n][m];
        System.out.println("Nhap vao cac phan tu cua mang:");
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                x[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

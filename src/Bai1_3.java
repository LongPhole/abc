import java.util.Scanner;

public class Bai1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap vao 3 so a b c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max;
        if(a>=b && a>=c){
            max = a;
        }
        else if(b>=c){
            max = b;
        }
        else{
            max = c;
        }
        System.out.println(max);
    }
}

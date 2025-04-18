import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao so tuoi cua ban: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        if(tuoi>=18){
            System.out.println("Ban da du tuoi di bau");
        }
        else{
            System.out.println("Ban chua du tuoi");
        }
    }
}

import java.util.Scanner;
public class Bai1_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int weight, height ;
        System.out.println("Nhap vao can nang");
        weight = sc.nextInt();
        System.out.println("Nhap vao chieu cao");
        height = sc.nextInt();
        double BMI =  (weight / (height * height));
        if(BMI <=1.8){
            System.out.println("Ban dang gay");

        } else if (BMI <= 2.7 && BMI >1.8) {
            System.out.println("Ban binh thuong");
        }
        else{
            System.out.println("Ban beo vl");
        }
    }
}

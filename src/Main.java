import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a :");
        a = scanner.nextInt();
        System.out.println("Nhập b :");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("Không có bội số chung lớn nhất");
        }
        while ( a!= b){
            if (a > b){
                a = a-b;
                System.out.println("a =" + a);
            }else {
                b = b-a;
                System.out.println("b =" + b);
            }
        }
        System.out.println("Bội số chung lớn nhất" + a);
    }
}

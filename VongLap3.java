import java.util.Scanner;
public class VongLap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao N: ");
        int n = sc.nextInt();
        double t = 0;
        long p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i;
            t = t + (double)1/p;
        }
        System.out.println("Tong la: "+t);
    }
}
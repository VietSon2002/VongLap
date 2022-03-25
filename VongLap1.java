import java.util.Scanner;
public class VongLap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao N: ");
        int n = sc.nextInt();
        int t = 0;
        for (int i = 1; i <= n; i++ ) {
            t = t +2 * i;
        }
        System.out.println("Tong la: "+t);
    }
}

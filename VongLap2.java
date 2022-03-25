import java.util.Scanner;
public class VongLap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao N: ");
        int n = sc.nextInt();
        int t = 0;
        for (int i = 1; i <=n; i++) {
            if (i % 2 !=0) {
                t = t + i;
            }
        }
        System.out.println("Tong la: "+t);
    }
}
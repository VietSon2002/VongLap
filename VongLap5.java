import java.util.Scanner;
public class VongLap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao N: ");
        int n = sc.nextInt();
        int s = 1;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                s= s*i;
            }
        }
        System.out.println("Tich la: " +s);
    }
}

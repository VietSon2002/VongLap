import java.util.Scanner;
public class VongLap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao N: ");
        int n = sc.nextInt();
        int s = 1;
        for (int i = 0; i < n; i++) {
            s= s*((i+1)*2);
        }
        System.out.println("Tich la: " +s);
    }
}

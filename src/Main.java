import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        n = scanner.nextInt();
        int array[] = new int[n];
        for (int i=0;i<n;i++) {
            System.out.println("nhap gia tri phan tu : " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("gia tri sau khi dao nguoc");
        for (int i=n-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
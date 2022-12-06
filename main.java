import java.util.Scanner;
public class KombinasyonHesaplama{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r,f1 = 1, f2 = 1, f3 = 1, fark;;
        System.out.print("N Değeri : ");
        n = input.nextInt();
        System.out.print("R Değeri : ");
        r = input.nextInt();
        fark = n - r;
        if (n < r) {
            System.out.print("N değeri, R değerinden yüksek olmalıdır! ");
            n = input.nextInt();
        }

        for (int a = 1; a < n; a++) {
            f1 = f1 * a;
        }
        System.out.print("N sayısının faktöriyeli : " + f1);
        for (int b = 1; b < r; b++) {
            f2 = f2 * b;
        }
        System.out.print("R sayısının faktöriyeli :  " + f2);
        for (int c = 1; c <= fark; c++) {
            f3 = f3 * c;
        }
        System.out.print("(N-R)'nin faktöriyeli :" + f3);
        int sonuc = f2*f3;
        int kombinasyon = f1/sonuc;
        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayı alınır
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        // Sayıların kopyaları alınır
        int n1 = sayi1;
        int n2 = sayi2;

        // EBOB hesaplama
        while (sayi1 != sayi2) {
            if (sayi1 > sayi2)
                sayi1 -= sayi2;
            else
                sayi2 -= sayi1;
        }
        int ebob = sayi1; // veya sayi2

        // EKOK hesaplama
        int ekok = (n1 * n2) / ebob;

        // Sonuçları ekrana yazdır
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
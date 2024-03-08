import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("küçük olan sayıyı giriniz.");
        int n1 = input.nextInt();                                 // birinci sayıyı belirle ve kaydet

        System.out.print("Büyük olan sayıyı giriniz : ");         // ikinci sayıyı belirle ve kaydet
        int n2 = input.nextInt();

        int ebob = 1;

        //n1 ve n2 yi böleni 0'dan birer arttırarak böl ve kalansız bölünenleri yazdır
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
        }
        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println(ebob);
                break;
            }
        }
        int ekok = (n1 * n2) / ebob;            //ebobu bulup ekok formülüne işle
        System.out.println("Sayıların EKOK'u : " + ekok + "\nEbobu : " + ebob); }}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */

        //Degiskenler tanimlandi.
        int girilenSayi, toplam = 0, sayac = 0;
        double ortalama;

        //Kullanicidan veri alindi ve girilen veri islenip ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz : ");
        girilenSayi = scan.nextInt();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Girdiginiz Sayiya Kadar Ucun Ve Dordun Kati Olan Sayilar : ");
        for (int i = 0; i <= girilenSayi; i++)
        {
            if (i % 3 == 0 && i % 4 == 0)
            {
                toplam += i;
                ++sayac;
                System.out.println(i);
            }
        }

        ortalama = toplam / sayac;
        System.out.println("-----------------------------------------------------------");
        System.out.println("Ucun Ve Dordun Kati Olan Sayilarin Toplamlarinin Ortalamasi : " + ortalama);
    }
}

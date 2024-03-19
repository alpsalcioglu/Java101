import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            double mesafe;
            double fiyat;
            int acilis = 10;
            double kmFiyati = 2.20;
            System.out.println("Hesaplamak istediğiniz km değerini yazınız: ");
            mesafe = input.nextInt();
            fiyat = acilis + (kmFiyati * mesafe);
            fiyat = (fiyat<20) ? 20 : fiyat; // yada yorumdaki gibi yapılabilir!
            /*if (fiyat <= 20) {
                fiyat = 20;
            } else {
                fiyat = fiyat;

            }*/
            System.out.println("Ödemeniz gereken tutar: " + fiyat);
            System.out.println("Başa dönüp bir hesap daha yapamk için 1 yazınız. ");
            int devam = input.nextInt();
            if(devam!=1){
                break;
            }

        } while(true);

    }
}
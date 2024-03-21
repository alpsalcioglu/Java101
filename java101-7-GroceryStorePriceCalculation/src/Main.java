import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            double armut, armutKg = 2.14, armutF;
            double elma, elmaKg = 3.67, elmaF;
            double domates, domatesKg = 1.11, domatesF;
            double muz, muzKg = 0.95, muzF;
            double patlican, patlicanKg = 5, patlicanF;
            double toplam;
            System.out.println("Armut Kaç Kilo? Giriniz: ");
            armut = input.nextDouble();
            System.out.println("Elma Kaç Kilo? Giriniz: ");
            elma = input.nextDouble();
            System.out.println("Domates Kaç Kilo? Giriniz: ");
            domates = input.nextDouble();
            System.out.println("Muz Kaç Kilo? Giriniz: ");
            muz = input.nextDouble();
            System.out.println("Patlıcan Kaç Kilo? Giriniz: ");
            patlican = input.nextDouble();
            armutF = armutKg * armut;
            elmaF = elmaKg * elma;
            domatesF = domatesKg * domates;
            muzF = muzKg * muz;
            patlicanF = patlicanKg * patlican;
            toplam = armutF + elmaF + domatesF + muzF + patlicanF;
            System.out.println("Toplam Tutar: " + toplam + " TL");
            System.out.println("Başa dönüp tekrar hesaplama yapmak için 1' e basınız...");
            int devam = input.nextInt();
            if (devam !=1) {
                break;
            }
        } while(true);
    }
}
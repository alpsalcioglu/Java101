import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       do {
           double a, b, c;
           int veri;
           double alan;
           double alanCarpiAlan;
           double cevre;
           double cevreBoluIki;
           double hipotenus;


           System.out.println("Üçgen alan hesabı yapmak istiyorsanız '1' yazın, Dik üçgenin hipotenüsünü bulmak istiyorsanız '2' yazın. ");
           veri = input.nextInt();


           if (veri == 1) {
               System.out.println("Üçgenin a kenarının uzunluğunu yazınız: ");
               a = input.nextDouble();
               System.out.println("Üçgenin b kenarının uzunluğunu yazınız: ");
               b = input.nextDouble();
               System.out.println("Üçgenin c kenarının uzunluğunu yazınız: ");
               c = input.nextDouble();
               cevreBoluIki = (a + b + c) / 2;
               cevre = 2 * cevreBoluIki;
               alanCarpiAlan = cevreBoluIki * (cevreBoluIki - a) * (cevreBoluIki - b) * (cevreBoluIki - c);
               alan = Math.sqrt(alanCarpiAlan);
               System.out.println("Üçgeninizin çevresi: " + cevre);
               System.out.println("Üçgeninizin alanı: " + alan);
           } else if (veri == 2) {
               System.out.println("Dik kenarlardan birini yazınız: ");
               a = input.nextDouble();
               System.out.println("Dik kenarlardan diğerini yazınız: ");
               b = input.nextDouble();
               double ckare = (a * a) + (b * b);
               c = Math.sqrt(ckare);
               System.out.println("Üçgeninizin hipotenüs uzunluğu: " + c);


           } else {
               System.out.println("1 veya 2 haricinde bir sayı girdiniz. Lütfen tekrar deneyiniz... ");

           }
           System.out.println("Başa dönüp başka bir hesaplama yapmak için 1'e basınız...");
           int devam = input.nextInt();
           if(devam!=1){
               break;
       }

       }
        while(true);
       }






    }


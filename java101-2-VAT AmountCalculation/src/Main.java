import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fiyat;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün fiyatını giriniz: ");
        fiyat = input.nextDouble();

        double kdvOran ;
        if(fiyat<=1000 && fiyat>0){
            kdvOran = 18;
        }
        else{
            kdvOran = 8;
        }
        double kdvTutari = ((fiyat * kdvOran)/100);
        double kdvliFiyat = fiyat + kdvTutari;
        System.out.println("Ürünün kdv dahil olmadan fiyatı: " + fiyat);
        System.out.println("Ürünün kdv tutarı: " + kdvTutari);
        System.out.println("Ürünün kdv dahil fiyatı: " + kdvliFiyat);

    }
}
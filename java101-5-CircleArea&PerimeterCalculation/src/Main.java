import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            double rYaricap;
            double aMerkezAci;
            float piSayisi = 3.14F;
            double alan;
            double dilimAlan;
            double cevre;
            System.out.println("Alan hesabı yapmak istediğiniz daire diliminin yarıçapını (r) yazınız: ");
            rYaricap = input.nextDouble();
            System.out.println("Alan hesabı yapmak istediğiniz daire diliminin açısını (a) yazınız: ");
            aMerkezAci = input.nextDouble();
            alan = piSayisi * rYaricap * rYaricap;
            cevre = 2 * piSayisi * rYaricap;
            dilimAlan = ((piSayisi * (rYaricap * rYaricap) * aMerkezAci)) / 360;
            System.out.println("Hesaplamak istediğiniz daire diliminin alanı: " + dilimAlan);
            System.out.println("--------------");
            System.out.println("Dairenizin tüm alanı: " + alan);
            System.out.println("Dairenizin tüm çevresi " + cevre);
            System.out.println("Başa dönüp yeniden bir hesaplama yapmak istiyorsanız 1 yazınız...");
            int devam = input.nextInt();
            if(devam != 1){
                break;
            }
        } while(true);





    }
}
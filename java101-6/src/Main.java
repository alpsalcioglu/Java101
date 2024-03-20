import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double boy;
       double kilo;
       double kitleEndeksi;
       do {
           System.out.println("Vücut Kitle Endeksi Hesaplamak için önce boyunuzu (metre cinsinden) giriniz: ");
           boy = input.nextDouble();
           System.out.println("Vücut Kitle Endeksi Hesaplamak için önce kilonuzu (kg cinsinden) giriniz: ");
           kilo = input.nextDouble();
           kitleEndeksi = kilo / ( boy * boy );
           System.out.println("Vücut kitle endeksiniz: "+ kitleEndeksi);

           System.out.println("Hesaplamayı bir kez daha yapmak için 1'e basınız...");
           int devam = input.nextInt();
           if(devam!=1){
               break;
           }
       } while(true);
    }
}
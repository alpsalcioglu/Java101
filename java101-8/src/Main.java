import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double n1;
       double n2;
       double sonuc;
       int secim;
        do {
            System.out.println(
                    "Toplama yapmak için 1'e\n" +
                            "Çıkarma yapmak için 2'ye\n" +
                            "Bölme yapmak için 3'e\n" +
                            "Çarpma yapmak için 4'e basınız.");
            secim = input.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Toplama İşlemi Yapmaktasınız.(n1+n2)...");
                    System.out.println("İlk sayıyı giriniz: ");
                    n1 = input.nextDouble();
                    System.out.println("İkinci sayıyı giriniz: ");
                    n2 = input.nextDouble();
                    sonuc = n1 + n2;
                    System.out.println("İşleminizin sonucu: " + sonuc);
                    break;
                case 2:
                    System.out.println("Çıkarma İşlemi Yapmaktasınız.(n1-n2)...");
                    System.out.println("İlk(n1) sayıyı giriniz: ");
                    n1 = input.nextDouble();
                    System.out.println("İkinci(n2) sayıyı giriniz: ");
                    n2 = input.nextDouble();
                    sonuc = n1 - n2;
                    System.out.println("İşleminizin sonucu: " + sonuc);
                    break;
                case 3:
                    System.out.println("Bölme İşlemi Yapmaktasınız.(n1/n2)...");
                    System.out.println("Bölünen'i (n1)giriniz: ");
                    n1 = input.nextDouble();
                    System.out.println("Bölüm'ü(n2) giriniz: ");
                    n2 = input.nextDouble();
                    if(n1!=0 && n2!=0) {

                        sonuc = n1 / n2;
                        System.out.println("İşleminizin sonucu: " + sonuc);
                        break;
                    }
                    else{
                        System.out.println("Lütfen 0'dan başka bir sayı giriniz." +
                                "\nÇünkü 0/0 Belirsizdir\n" +
                                "Sayı / 0 yada 0 / Sayı ise Tanımsızdır.");
                        break;
                    }
                case 4:
                    System.out.println("Çarpma İşlemi Yapmaktasınız.(n1 x n2)...");
                    System.out.println("İlk(n1) sayıyı giriniz: ");
                    n1 = input.nextDouble();
                    System.out.println("İkinci(n2) sayıyı giriniz: ");
                    n2 = input.nextDouble();
                    sonuc = n1 * n2;
                    System.out.println("İşleminizin sonucu: " + sonuc);
                    break;
                default:
                    System.out.println("1,2,3 veya 4'ten başka bir değer girdiniz.\nLütfen geçerli bir sayı giriniz...");
            }
            System.out.println("Başa dönmek için 0'a basınız...");
            int devam=input.nextInt();
            if(devam!=0){
                break;
            }
        }while(true);







    }
}

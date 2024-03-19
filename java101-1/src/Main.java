import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya , turkce, tarih , muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        float ortalama = (matematik + fizik + kimya + turkce + tarih + muzik)/6 ;
        System.out.println("Not ortalamanız: " + ortalama);
        if (ortalama >= 60){
            System.out.println("Sınıfı Geçti. ");
        }
        else{
            System.out.println("Sınıfta Kaldı.");
        }

    }
}
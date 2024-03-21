import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String userName,password = "patika123",passwordNew;
do {
    System.out.print("Lütfen kullanıcı adınızı giriş yapınız: ");
    userName = input.next();
    System.out.print("Lütfen şifrenizi giriş yapınız: ");
    String password1 = input.next();
    if (userName.equals("patika") && password1.equals(password)) {
        System.out.println("Başarılı giriş...");
    } else {
        System.out.println("Hatalı Kullanıcı Adı yada Şifre Girdiniz!");
        System.out.println("Tekrar denemek için 1'e basınız!\n" +
                "Şifrenizi sıfırlamak için 2'a basınız!");
        int basaDon = input.nextInt();
        switch (basaDon) {
            case 1:
                break;
            case 2:
                System.out.print("Şifrenizi belirlemek için önce kullanıcı adınızı yazınız: ");
               String userName1 = input.next();

                if (userName1.equals("patika")) {
                    boolean check = true;
                    while (check) {
                        System.out.println("Yeni şifrenizi girin: ");
                        passwordNew = input.next();
                        if (!password.equals(passwordNew)) {
                            System.out.println("Şifreniz değiştirildi");
                            password = passwordNew;
                            check = false;
                        } else {
                            System.out.println("Eski şifre ile aynı şifreyi yazdınız.Lütfen tekrar deneyiniz!");

                        }
                    }
                }break;
            default: break;
        }
    }
    System.out.println("Başa dönüp tekrar giriş yapmak için 3'e basınız!");
    int devam = input.nextInt();
    if (devam != 3) {
        break;
    }


}while(true);
    }
}
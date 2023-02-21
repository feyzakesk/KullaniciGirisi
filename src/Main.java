import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String userName,password ;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız :");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız !");
        }else{
            System.out.println("Bilgileriniz Yanlış . Yeni Şifre oluşturmak ister misiniz? \n 1-evet \n 2-hayır\n");
            int select;
            select=input.nextInt();
        String newPassword;
        Scanner inp = new Scanner(System.in);
        switch (select){
            case 1:
                System.out.println("Yeni şifrenizi girin : ");
                newPassword = input.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("Yeni şifre eskisiyle aynı olamaz !");
                }else {
                    System.out.println("Şifre başarıyla oluşturuldu..");
                }
                break;
            case 2:
                System.out.println("İşlem iptal edildi.");
                break;
            default:
                System.out.println("Geçersiz işlem girildi.");
        }

        }
    }
}

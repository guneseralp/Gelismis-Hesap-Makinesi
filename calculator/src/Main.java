import java.util.Scanner;

public class Main {

    static int sum (int a, int b){
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }
    static int multi(int a, int b){
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }
    static int divide(int a, int b){
        int result = a / b;

        System.out.println("Bölme: " + result);
        return result;
    }
    static int power (int a, int b){
        int result = 1;
        for(int i = 1; i <= b ;i++){
            result *=  a;
        }
        return result;
    }
    static int mode(int a, int b){

        return a % b;
    }
    static void dk(int a ,int b){

        System.out.println("Çevre: " + (2*(a+b)));
        System.out.println("Alan: " + a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int select;

        String menu = "1- Toplama\n"
                + "2- Çıkarma \n"
                + "3- Çarpma\n"
                + "4- Bölme\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan Hesabı\n"
                + "0- Çıkış Yap\n";
        while(true){
            System.out.println("==================");
            System.out.print(menu);
            System.out.print("Hangi işlemi Yapmak İstersiniz: ");
            select = sc.nextInt();

            if(select == 0){
                break;
            }

            System.out.print("İlk Sayı: ");
            int a = sc.nextInt();
            System.out.print("İkinci Sayı: ");
            int b = sc.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    multi(a,b);
                    break;
                case 4:
                   divide(a,b);
                   break;
                case 5:
                    System.out.println("Üslü Sayı: " + power(a,b));
                    break;
                case 6:
                    System.out.println("Üslü Sayı: " + mode(a,b));
                    break;
                case 7:
                    dk(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz.");
            }
        }
        System.out.print("Güle Güle!");
    }
}
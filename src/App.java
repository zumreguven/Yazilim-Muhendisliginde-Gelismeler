import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("***********");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen ilk sayiyi giriniz  ");
        int sayi1 = scanner.nextInt();  // İlk sayıyı alıyoruz
        
        System.out.println("Lütfen ikinci sayiyi giriniz ");
        int sayi2 = scanner.nextInt();  // İkinci sayıyı alıyoruz
        
        // getSum metodunu çağırarak sonucu yazdırıyoruz
        System.out.println("The sum of " + sayi1 + " and " + sayi2 + " is: " + getSum(sayi1, sayi2));
        
        
        
    }

    public static String getSum(int num1,int num2) {
        int sum=num1+num2;
        return "2.commit işelmi olarak iki sayının toplamı : Toplama : " + sum;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        getSum();
    }

    public String getSum() {
        // Sabit olarak 2 sayısını topluyoruz
        int number1 = 2;
        int number2 = 2;
        int sum = number1 + number2;

        // Sonucu döndürüyoruz
        return "The sum of 2 and 2 is: " + sum;
    }
}
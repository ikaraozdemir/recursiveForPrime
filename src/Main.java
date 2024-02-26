
import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);

    static boolean isPrime(int number, int mod) {

        while (mod < number) {
            int remainer = number % mod;
            if (number != 2 && remainer == 0) {
                return false;
            }
            return isPrime(number, mod + 1); // Girilen sayıdan küçük tüm sayılarla bölümden kalanı kontrol eder.
        }
        return true;
    }

    // Kullanıcıdan sayı alıp işlem sonucuna göre kullanıcıyı bilgilendirilir.
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        int number = inp.nextInt();
        int mod = 2;
        if (isPrime(number, mod)) { //Girilen sayıdan küçük tüm sayıları kullanabilmek için metoda ikinci bir değer girilir.
            System.out.print(number + " asal sayıdır.");
        } else {
            System.out.print(number + " asal sayı değildir.");
        }

    }
}
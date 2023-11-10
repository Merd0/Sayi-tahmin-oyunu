import java.util.Scanner; // Klavyeden giriş almak için
import java.util.Random; // Rastgele sayı üretmek için

public class Main {

    public static void main(String[] args) {
        // Değişkenleri tanımlayalım
        int attempt = 0; // Tahmin sayısını tutan değişken
        int userGuessNumber = 0; // Kullanıcının girdiği sayıyı tutan değişken
        int secretNumber; // Bilgisayarın seçtiği sayıyı tutan değişken

        // Rastgele sayı üreten nesneyi oluşturalım
        Random random = new Random();

        // 1 ile 50 arasında rastgele bir sayı seçelim
        secretNumber = random.nextInt(100) + 1;

        // Scanner nesnesi oluşturalım
        Scanner scanner = new Scanner(System.in);

        // Oyun başlasın
        System.out.println("1 ile 100 arasında bir sayı tahmin etmeye çalışın. 10 hakkınız var.");

        // 10 kere tahmin etme hakkı verelim
        while (attempt < 10) {
            // Kullanıcıdan bir sayı girmesini isteyelim
            System.out.print("Tahmininiz: ");
            userGuessNumber = scanner.nextInt();

            // Tahmin sayısını bir arttıralım
            attempt++;

            // Kullanıcının girdiği sayıyı kontrol edelim
            if (userGuessNumber == secretNumber) {
                // Eğer doğru tahmin ettiyse, oyunu bitirelim ve tebrik edelim
                System.out.println("Tebrikler! " + attempt + ". denemede doğru tahmin ettiniz.");
                break;
            } else if (userGuessNumber > secretNumber) {
                // Eğer çok yüksek tahmin ettiyse, uyaralım
                System.out.println("Çok yüksek, tekrar dene.");
            } else if (userGuessNumber < secretNumber) {
                // Eğer çok düşük tahmin ettiyse, uyaralım
                System.out.println("Çok düşük, tekrar dene.");
            }
        }

        // Eğer 10 kere yanlış tahmin ettiyse, oyunu bitirelim ve doğru sayıyı söyleyelim
        if (attempt == 10) {
            System.out.println("Üzgünüm, 10 kere yanlış tahmin ettiniz. Doğru sayı " + secretNumber + " idi.");
        }

        // Scanner nesnesini kapatalım
        scanner.close();

        //0-100 arası rastgele bir sayıyı tahmin etme oyunu ama dikkatli ol 10 hakkın var :)
    }
}


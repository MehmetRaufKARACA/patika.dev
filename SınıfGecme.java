import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // Değişkenleri tanımla
        double mat, fizik, turkce, kimya, muzik,dersSayisi=0;
        double toplam = 0;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullaıcıdan sınav notlarını al
        System.out.print("Matematik sınavı notunuzu giriniz : ");
        mat = inp.nextDouble();
        if(mat >= 0 && mat <= 100){
            toplam += mat;
            dersSayisi ++;
        }
        System.out.print("Fizik sınavı notunuzu giriniz : ");
        fizik = inp.nextDouble();
        if(fizik >= 0 && fizik <= 100){
            toplam += fizik;
            dersSayisi ++;
        }
        System.out.print("Türkçe sınavı notunuzu giriniz : ");
        turkce = inp.nextDouble();
        if(turkce >= 0 && turkce <= 100){
            toplam += turkce;
            dersSayisi ++;
        }
        System.out.print("Kimya sınavı notunuzu giriniz : ");
        kimya = inp.nextDouble();
        if(kimya >= 0 && kimya <= 100){
            toplam += kimya;
            dersSayisi ++;
        }
        System.out.print("Müzik sınavı notunuzu giriniz : ");
        muzik = inp.nextDouble();
        if(muzik >= 0 && muzik <= 100){
            toplam += muzik;
            dersSayisi ++;
        }

        // Ortalama al
        double ortalama = toplam / dersSayisi; 
        
        if(ortalama <= 55){
            System.out.println("Kaldınız.");
        }else{
            System.out.println("Geçtiniz.");
        }
        System.out.println("Ortalamanız : " + ortalama);
        
    }
}
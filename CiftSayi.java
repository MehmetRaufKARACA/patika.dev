import java.util.Scanner;
public class CiftSayi{
    public static void main(String[] args){
       int k, toplam = 0;
       double ortalama;
       int adet = 0;
       
       
       Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        k = inp.nextInt();

        for(int i = 1; i <= k; i++){
            if(i % 3 == 0 && i % 4 == 0){
                toplam += i;
                adet++;
            }
        }

        ortalama = toplam / adet;
        System.out.println("Sayıların ortalaması = " + ortalama);

       
      
    }
}
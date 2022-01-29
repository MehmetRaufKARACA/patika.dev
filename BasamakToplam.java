import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        int sayi, toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();
        while(sayi!=0){
            int rakam = sayi % 10;
            toplam += rakam;
            sayi /=10;
        }
        System.out.println(toplam);
    }
}
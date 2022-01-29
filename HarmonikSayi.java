import java.util.Scanner;
public class HarmonikSayi{
    public static void main(String[] args){
        int n;
        double toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz :");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            toplam += (1.0/i);
        }
        System.out.println(toplam);

        
    }
}
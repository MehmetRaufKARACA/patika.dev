import java.util.Scanner;
public class MukemmelSayi{
    public static void main(String[] args){
        
        int sayi;
        int toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = input.nextInt();

        if(sayi == 1){
            System.out.println(sayi + " mükemmel sayı değildir.");
        }else{
            for(int i = 1; i < sayi; i++){
                if(sayi%i == 0){
                    toplam += i;
                }
            }
    
            if(toplam == sayi){
                System.out.println(sayi + " mükemmel sayıdır.");
            }else{
                System.out.println(sayi +" mükemmel sayı değildir.");
            }
        }

       

        
    }
}
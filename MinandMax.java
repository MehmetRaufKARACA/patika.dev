import java.util.Scanner;
public class MinandMax{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int adet;
        int EnBuyuk = 1;
        int EnKucuk = 0;
        int sayi;
        int temp;

        System.out.print("Kaç adet sayı girilecek : ");
        adet = input.nextInt();

        for(int i = 1; i <= adet; i++){
            System.out.print(i + ". sayıyı giriniz :");
            sayi = input.nextInt();
           
            if (i==1){
                EnBuyuk = sayi;
                EnKucuk = sayi; 
            }    

            if(sayi < EnKucuk){
                EnKucuk = sayi;
            }
            if(sayi > EnBuyuk){
                EnBuyuk = sayi;
            }

        }
        System.out.println("En büyük sayi : " + EnBuyuk);
        System.out.println("En küçük sayı : " + EnKucuk);
        
    }
}
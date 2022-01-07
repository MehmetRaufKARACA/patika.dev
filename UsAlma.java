import java.util.Scanner;
public class UsAlma{
    public static void main(String[] args){
        int n,k;
        int sonuc = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz :");
        n = input.nextInt();
        System.out.print("Üssü giriniz : ");
        k = input.nextInt();
        
        for(int i = 1; i <= k; i++){
            sonuc *= n;
        }

        System.out.println("Sonuc = " + sonuc);


        
        
    }
}
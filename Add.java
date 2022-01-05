import java.util.Scanner;
public class Add{
    public static void main(String[] args){
        int k;
        double toplam = 0;

        Scanner inp = new Scanner(System.in);

        

        do{
            System.out.print("Lütfen sayı giriniz :");
            k = inp.nextInt();
            if(k % 2 == 0 || k % 4 == 0){
                 toplam += k ;
            }

        }while(k % 2 == 0);
           
        
        System.out.println("Sayıların toplamı : " + toplam);
    }
}
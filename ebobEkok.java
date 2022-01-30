import java.util.Scanner;
public class ebobEkok{
    public static void main(String[] args){
        int kucuk;
        int ebob = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz :");
        int n2 = input.nextInt();

        if(n1 < n2){
            kucuk = n1;
        }else{
            kucuk = n2;
        }

        int i = kucuk;
        while(i >= 1){
            if(n1%i == 0 && n2%i == 0){
                ebob = i;
                break;
                
            }
            i--;
        }
        System.out.print("n1 ve n2'nin ebobu =" + ebob );

        // ekok bulma işlemi
        /*
        int k = 1;
        while(k <= n1 * n2){
            if(i%n1 == 0 && i%n2 == 0){
                System.out.print(k);
                break;
            }
        }
        */

       
        
        

    

        
        
    }
}
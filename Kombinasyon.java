import java.util.Scanner;
public class Kombinasyon{
    public static void main(String[] args){
        int n, i,r;
        int sonuc = 1;
        int sonuc1 = 1;
        int sonuc2 = 1;

        Scanner inp =  new Scanner(System.in);

        System.out.print("Kümenin eleman sayısını giriniz : ");
        n= inp.nextInt();
        System.out.print("Kaç elemanlı gruplar oluşturulacak :");
        r = inp.nextInt();


        for(i = 1; i<= n; i++){
            sonuc *= i;
        }
        for(i = 1; i <= r; i++){
            sonuc1 *= i;
        }
        for(i = 1; i <= (n-r);i++){
            sonuc2 *= i;
        }

        System.out.println("Sonuç = " + (sonuc /(sonuc1 * sonuc2)));

        
        
    }
}
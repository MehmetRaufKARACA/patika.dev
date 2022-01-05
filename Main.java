import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int number;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sınır değerini giriniz :");
        number = inp.nextInt();

        
        if(number < 0){
            System.out.println("Geçersiz değer girdiniz.");
        }else{
            System.out.print("4'ün kuvvetleri :");
            for(int i = 1; i <= number; i *= 4){
                System.out.print(i + ",");
            }
            System.out.print("\n5'in kuvvetleri : ");
            for(int i = 1; i<=number; i *= 5){
                System.out.print(i + ",");
            }
        }
    }
}
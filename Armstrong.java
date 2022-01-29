import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        
        int number = input.nextInt();
        int basNumber = 0 , tempNumber = number;
        int basValue, basPow ;
        int result = 0;

        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while(tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for(int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if(result == number){
            System.out.println(number + "sayısı bir armstrong sayısıdır. ");    
        }else{
            System.out.println(number + "sayısı bir armstrong sayı değildir.");    
        }
        
        
    }
}
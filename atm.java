import java.util.Scanner;
public class atm{
    public static void main(String[] args){
        String userName, password;
        int balance = 1500;
        int select;
        int right = 3;
        int price;
        Scanner input = new Scanner(System.in);

        while(right > 0){
            System.out.print("Lütfen kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.print("Lütfen parolanızı giriniz : ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                 System.out.println("Hoşgeldiniz.");
                 do{
                    System.out.println("1-) Para yatırma\n" + "2-) Para çekme\n" + "3-) Bakiye sorgulama\n" + "4-) Çıkış yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch(select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2 :
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if(price > balance){
                                System.out.println("Yetersiz bakiye");
                            }else{
                                balance -= price;
                            }
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz : " + balance);
                            break;    
                    }
                 }while(select != 4);
                 System.out.println("İyi günler dileriz.");
                 break;
                 
            }else{
                right--;
                System.out.print("Hatalı giriş yaptınız.");
                if(right == 0){
                    System.out.print("Hesap bloke edildi.");
                }else{
                    System.out.print("Kalan hakkınız : " + right); 
                }
               
            }
        }
        
    }
}
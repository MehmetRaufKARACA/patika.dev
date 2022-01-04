import java.util.Scanner;

public class UcakBiletHesap{
    public static void main(String[] args) {
        int distance, age, type;
        double totalPrice,priceWithDiscount,perKm = 0.1;

        // Kullanıcıdan mesafe, yaş ve uçuş tipi biliglerini al
        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi giriniz : ");
        distance = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();
        System.out.print("Uçuş tipini seçiniz : (Tek Yön/Çift Yön) :");
        type = inp.nextInt();

        if(distance < 0 || age < 0 || (type != 1 && type != 2)){
            System.out.println("Hatalı giriş yaptınız.");
        }else{
            totalPrice = distance * perKm;

            if(age < 12){
                if(type == 2){
                    priceWithDiscount = 2 * (totalPrice - (totalPrice * 0.5)) * 0.8;
                    System.out.println("Toplam tutar : " + priceWithDiscount + "TL");
                }else{
                    priceWithDiscount = totalPrice - (totalPrice * 0.5);
                    System.out.println("Toplam tutar : " + priceWithDiscount + "TL");
                }
            }else if(12 <= age && age <= 24){
                if(type == 2){
                    priceWithDiscount = 2 * (totalPrice - (totalPrice * 0.1)) * 0.8;
                    System.out.println("Toplam tutar : " + priceWithDiscount + "TL");
                }else{
                    priceWithDiscount = totalPrice - (totalPrice * 0.1);
                    System.out.println("Toplam tutar : " + priceWithDiscount + "TL");
                }
            }else if(age > 65){
                if(type == 2){
                    priceWithDiscount = 2 * (totalPrice - (totalPrice * 0.3)) * 0.8;
                    System.out.println("Toplam tutar : " + priceWithDiscount + "TL");
                }else{
                    priceWithDiscount = totalPrice - (totalPrice * 0.3);
                    System.out.println("Toplam tutar : " + priceWithDiscount + "TL");
                }
            }else{
                if(type == 2){
                    priceWithDiscount = totalPrice - (totalPrice * 0.2);
                    System.out.println("Toplam tutar : " + priceWithDiscount + "TL");
                }else{
                    priceWithDiscount = totalPrice;
                    System.out.println("Toplam tutar : " + priceWithDiscount + "TL");
                }
            }

            }
        }

    }

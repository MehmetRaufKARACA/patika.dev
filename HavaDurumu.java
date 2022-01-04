import java.util.Scanner;
public class HavaDurumu{
    public static void main(String[] args){
        int heat;

        // Kullanıcıdan sıcaklık değeri al
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık kaç derece :");
        heat = inp.nextInt();

        if(heat < 5){
            System.out.print("Kayağa gidebilirsiniz.");
        }else if(heat <= 25){
            if(heat <= 15){
                System.out.println("Sinema iyi bir seçenek olabilir.");
            }
            if(heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }

        }else{
            System.out.println("Yüzmek için harika bir hava.");
        }
        
    }
}
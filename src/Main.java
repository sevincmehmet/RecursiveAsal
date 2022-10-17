import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Scanner;

public class Main {

    static boolean recursiveAsal(int x) {
        int sayac = 0;
        if (x == 1) {
            return false;
        }
        else if (x == 2) {
            return true;
        }

        for (int j = 2; j <= x/2; j++) {
            if (x % j == 0) {
                sayac++;
            }
            if (sayac == 1) {
                break;
            }
        }
        if (sayac==1){
            return false;
        }
        else if (sayac == 0) {
            return true;
        }
        else
            return recursiveAsal(x-1) ;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Asallığını kontrol etmek istediğiniz sayıyı giriniz : ");
        int n = inp.nextInt();

        String kontrol = recursiveAsal(n)? "Sayı Asaldır !" : "Sayı Asal Değildir !";
        System.out.println(kontrol);
    }
}

import java.util.Scanner;

public class Artik_Yil {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int yil;
        System.out.print("Bir yil giriniz: ");
        yil=inp.nextInt();

        if (yil % 4 == 0 && yil % 100 != 0 || (yil % 400 == 0)) {
            System.out.println(yil + " bir artik yildir");


        }
        else {
            System.out.println(yil + " bir artik yil degildir!");
        }
    }
}

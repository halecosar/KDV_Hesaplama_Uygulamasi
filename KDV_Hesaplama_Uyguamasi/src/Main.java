import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvTutari, kdvliTutar;
        Scanner inp= new Scanner(System.in);
        System.out.println("Tutar Giriniz");
        tutar = inp.nextDouble();

       double kdvOran = tutar <1000 ? 0.18 : 0.08;
         kdvTutari = tutar * kdvOran;
         kdvliTutar = tutar + kdvTutari;


        System.out.println("KDV'siz Tutar " + tutar);
        System.out.println("KDV Oranı " + kdvOran);
        System.out.println("KDV Tutarı " + kdvTutari);
        System.out.println("KDV'li Tutar " + kdvliTutar);



    }
}
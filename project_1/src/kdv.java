import java.util.Scanner;
public class kdv {
    public static void main(String[] args){

        double tutar, kdvOrani = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOrani;
        double kdvliTutar = tutar * kdvTutar;
        System.out.println("KDVli Fiyat: " + kdvliTutar);
    }
}

import java.util.Scanner;

public class vki {
    public static void main(String[] args){
        double boy, kilo, vki;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
        kilo = inp.nextDouble();

        vki = (kilo / (boy*boy));
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
}

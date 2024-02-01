import java.util.*;
public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;
        double toplamfiyat;

        System.out.print("Kaç kilo armut aldınız? : ");
        armutKilo = input.nextInt();

        System.out.print("Kaç kilo elma aldınız? : ");
        elmaKilo = input.nextInt();

        System.out.print("Kaç kilo domates aldınız? : ");
        domatesKilo = input.nextInt();

        System.out.print("Kaç kilo muz aldınız? : ");
        muzKilo = input.nextInt();

        System.out.print("Kaç kilo patlıcan aldınız? : ");
        patlicanKilo = input.nextInt();

        toplamfiyat = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat) + (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat);
        System.out.println("Toplam Fiyat = " + toplamfiyat);
    }
}
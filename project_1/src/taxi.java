import java.util.Scanner;
public class taxi {
    public static void main(String[] args){
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;
        System.out.println("Total Price: " + total);
    }
}

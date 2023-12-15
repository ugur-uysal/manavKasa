import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKgTutar = 2.14, elmaKgTutar = 3.67, domatesKgTutar = 1.11, muzKgTutar = 0.95, patlicanKgTutar = 5.00, total;
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = inp.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = inp.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = inp.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = inp.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = inp.nextInt();

        total = (armutKg * armutKgTutar) + (elmaKg * elmaKgTutar) + (domatesKg * domatesKgTutar) + (muzKg * muzKgTutar) + (patlicanKg * patlicanKgTutar);

        System.out.print("Toplam Tutar : " + total + " TL");
    }
}
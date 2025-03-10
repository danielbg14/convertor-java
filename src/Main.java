import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // KONVERTOR NA VALUTI
        // BGN -> USD/EUR
        // USD/EUR -> BGN

        System.out.println();

        System.out.println("Zdrasti 6matka");
        System.out.println("Toz chudo e konvertor na valuta");
        System.out.println("");
        System.out.println("Napishi valutata za convertirane:");
        System.out.println("1. BGN -> EUR");
        System.out.println("2. BGN -> USD");
        System.out.println("3. EUR -> BGN");
        System.out.println("4. USD -> BGN");
        System.out.println("Tvoqt izbor e: ");

        int typed = scanner.nextInt();
        System.out.println("Ti izbra " + typed);
        System.out.println("");
        if (typed > 4)
        {
            System.out.println("Shmatka, kazah ti mejdu 1 i 4, tuuuuup!");
            return;
        }
        else if (typed < 1)
        {
            System.out.println("Shmatka, kazah ti mejdu 1 i 4, tuuuuup!");
            return;
        }
        System.out.println("Napishi purvoto chislo: ");
        int number1 = scanner.nextInt();
        System.out.println(" ");

        // SUMA NA VALUTI
        double eurvalue1 = 0.51;
        double eurvalue2 = 1.96;
        double usdvalue1 = 0.55;
        double usdvalue2 = 1.80;

        double bgneur = number1 * eurvalue1;
        double bgnusd = number1 * usdvalue1;
        double eurbgn = number1 * eurvalue2;
        double usdbgn = number1 * usdvalue2;

        if (typed == 1)
        {
            System.out.println(number1 + " leva convertnati kum euro e ravno na "+ bgneur + "euro");
        }
        else if (typed == 2)
        {
            System.out.println(number1 + " leva convertnati kum euro e ravno na "+ bgnusd + "dolara");
        }
        else if (typed == 3)
        {
            System.out.println(number1 + " euro convertnati kum leva e ravno na "+ eurbgn + "leva");
        }
        else if (typed == 4)
        {
            System.out.println(number1 + " dolara convertnati kum leva e ravno na "+ usdbgn + "leva");
        }
    }
}
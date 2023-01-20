public class Main {


    public static void main(String[] args) {
        //task1
        System.out.println("ЗАДАНИЕ1");
        int sobrat = 2_459_000;
        int otlozit = 15_000;
        int total = 0;
        int moth = 1;
        while (total < sobrat) {
            total = total + otlozit;
            System.out.println("месяц" + moth + "сумма накоплений" + total + "рублей");
            moth++;


        }
        System.out.println();
        //task2
        System.out.println("задание2");
        int i = 0;
        int b = 20;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");


        }
        System.out.println();
        //task3
        System.out.println("Задача3");
        int strana = 12_000_000;
        int coofic = 1000;
        int rozdaemost = 17;
        int smertnost = 8;
        int years = 10;
        int proverka = rozdaemost - smertnost;

        int result = rozdaemost - smertnost;
        for (int year = 1; year <= years; year++) {
            strana = strana + strana * proverka / coofic;

            System.out.println("год" + year + "численность составляет" + strana);


        }
        System.out.println();
        //task4
        System.out.println("Задача4");
        int cash = 15000;
        int sobrat1 = 12_000_000;
        int mesyac = 1;
        double procent = 0.07;
        while (cash < sobrat1) {
            cash = cash + (int) +(cash * procent);
            System.out.println("месяц" + mesyac + "сумма накоплений ровна " + cash + "рублей");
            mesyac++;
        }
        //task5
        System.out.println("Задача5");
        int cash1 = 15000;
        int sobrat2 = 12_000_000;
        int mesyac1 = 1;
        double procent1 = 0.07;
        while (cash1 < sobrat2) {
            cash1 = cash1 + (int) +(cash1 * procent1);
            if (mesyac1 % 6 == 0) {
                System.out.println("месяц" + mesyac1 + "сумма накоплений ровна " + cash1 + "рублей");

            }
            mesyac1++;


        }
        //task6
        System.out.println();
        System.out.println("Задача 6");
        int cash3 = 15000;
        double procent3 = 0.07;
        int ears = 9*12;
        for (int mesyac3=1;mesyac3<ears;mesyac3++ ) {
            cash3 = cash3 + (int) +(cash3 * procent3);
            if (mesyac3 % 6 == 0) {
                System.out.println("месяц" + mesyac3 + "сумма накоплений ровна " + cash3 + "рублей");

            }
        }
    }
}






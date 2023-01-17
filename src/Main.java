public class Main {


    public static void main(String[] args) {
        //task1
        System.out.println("ЗАДАНИЕ1");
        int sobrat= 2_459_000;
        int otlozit = 15_000;
        int total = 0;
        int moth=1;
        while (total<sobrat){
total=total+otlozit;
            System.out.println ("месяц"+moth+"умма накоплений"+total+"рублей");
            moth++;


            }
        System.out.println();
        //task2
        System.out.println("задание2");
        int i=0;
        int b=20;
        while (i<10 ){
            i++;
            System.out.print(i+" ");
            }
        System.out.println();
        for (int j = 10; j > 0; j--) {            System.out.print(j+" ");


        }
        System.out.println();
        //task3
        System.out.println("Задача3");
        int strana=12_000_000;
        int coofic=1000;
        int rozdaemost=17;
        int smertnost=8;
        int years=10;

        int result=rozdaemost-smertnost;
        strana=strana+strana*result/coofic;
        for ( int year=1;year<=years; year++) {
            System.out.println("год"+year+"численность составляет"+strana);


        }

        }




        }


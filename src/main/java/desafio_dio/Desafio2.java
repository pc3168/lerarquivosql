package desafio_dio;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        double total;
        double morangosKG = 2.5;
        double macasKg = 1.8;

        if (morangos > 5){
            morangosKG = 2.2;
        }

        if (macas > 5){
            macasKg = 1.5;
        }

        total = (morangosKG * morangos) + (macasKg * macas) ;

        if (total > 25 || (morangos + macas) > 8){
            total = total - (total * 0.1);
        }

        System.out.println(total);
    }
}

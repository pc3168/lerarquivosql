package desafio_dio;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

        if ((A + B) > C && (B + C) > A && (A + C) > B){
            System.out.println("Perimetro = "+(A + B + C));
        }else{
            System.out.println("Area = "+((A + B) * C) / 2);
        }



    }

}

package desafio_dio;

import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double renda = 2001;//leitor.nextDouble();
        double imposto = 0;

        double valorAnterior = 0;

        if(renda > 4500){
            valorAnterior = 4500 - renda;
            System.out.println(valorAnterior);
            System.out.println((valorAnterior * -1) * 0.28);
            imposto += ((valorAnterior * -1) * 0.28) ;

        }

        if (3000 < renda) {
            valorAnterior = (3000 - (renda -= (valorAnterior * -1)));
            System.out.println(valorAnterior);
            System.out.println((valorAnterior * -1) * 0.18);
            imposto += ((valorAnterior * -1) * 0.18) ;

        }

        if (2000 < renda){
            valorAnterior = (2000 - renda) - valorAnterior;
            System.out.println(valorAnterior);
            System.out.println((valorAnterior * -1) * 0.08);
            imposto += ((valorAnterior * -1) * 0.08) ;
        }

        if (imposto == 0 ){
            System.out.println("Isento");
        }else{
            System.out.printf("O imposto é  %2.2f" , imposto);
        }


    }
}

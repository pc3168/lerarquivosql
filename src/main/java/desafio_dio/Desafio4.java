package desafio_dio;

import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {
            for (int j = 0; j < item.length(); j++){
                for (int k = 0; k < arrVogais.length; k++){
                    if (String.valueOf(arrVogais[k]).contains(String.valueOf(item.charAt(j)).toLowerCase())){
                        quantVogais++;
                        break;
                    }
                }
            }
        }

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}

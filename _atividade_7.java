package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int numb1 = sc.nextInt();

        System.out.print("Insira o segundo número: ");
        int numb2 = sc.nextInt();

        System.out.print("Insira o terceiro número: ");
        int numb3 = sc.nextInt();

        int maior = numb1;

        maior = (numb2 > maior) ? numb2 : maior;

        //Ambas dessas duas formas da formula de Ternário estão em amarelo pois estão falando
        //que seria melhor usar o "Math.max()" MAS... Como (eu acho) que o professor não ensinou
        //como é que usa este metódo de cálculo e somos obrigados a usar  Ternário ao invez do Se
        //no Java vou deixar assim mesmo.
        //
        //Ps: O código ainda funciona :).
        //

        maior = (numb3 > maior) ? numb3 : maior;

        System.out.println(maior + " é o maior de todos.");
    }
}

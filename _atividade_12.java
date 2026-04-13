package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numb1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double numb2 = sc.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numb3 = sc.nextDouble();

        double maior = numb1;
        double menor = numb1;

        maior = (numb2 > maior) ? numb2 : maior;
        maior = (numb3 > maior) ? numb3 : maior;

        //Essas quatro formas da formula de Ternário estão também em amarelo (igual a atividde 7)
        //por conta da mesma sugestão para usar este tal de "Math.max()" por que ele é melhor para isso.
        //Então eu vou falar amis uma vez... Como (eu acho) que o professor NÃO ensinou como é que usa
        //este metódo de cálculo e somos obrigados a usar  Ternário ao invez do Se no Java vou deixar
        //assim mesmo.
        //
        //Ps: O código ainda funciona :) (Caso ainda não esteja claro).
        //

        menor = (numb2 < menor) ? numb2 : menor;
        menor = (numb3 < menor) ? numb3 : menor;

        System.out.printf("O maior número é: %.0f%n", maior);
        System.out.printf("O menor número é: %.0f%n", menor);
    }
}

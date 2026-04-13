package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numb;

        System.out.println("Qual é o valor do seu salário?");
        numb = sc.nextDouble();

        String valor = (numb > 2000) ? "Salário alto" : "Salário baixo";

        System.out.println(valor);
    }
}

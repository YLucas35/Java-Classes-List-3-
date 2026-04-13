package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Qual é a sua idade?");
        idade = sc.nextInt();

        while (idade == 0) {
            System.out.println("Idade inválida, digite outra.");
            idade = sc.nextInt();
        }

        String pessoa = (idade >= 16) ? "Você pode votar." : "Você não pode votar.";

        System.out.println(pessoa);
    }
}

package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Qual é a sua idade?");
        idade = sc.nextInt();

        while (idade == 0 || idade > 120) {
            System.out.println("Idade inválida, digite outra.");
            idade = sc.nextInt();
        }

        String humanos = (idade <= 12) ? "Você é uma criança (idade muito infantil)." : (idade <= 17) ? "Você é um adolescente." : (idade <= 64) ? "Você é um adulto." : "Você é um idoso.";

        System.out.println(humanos);
    }
}

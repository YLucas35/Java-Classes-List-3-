ackage Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb, result;

        System.out.println("Insira um número para saber se ele é divisível por 5");
        numb = sc.nextInt();
        result = numb % 5;

        String valor = (result == 0) ? "Este número é divisível por 5" : "Este número não é divisível por 5";

        System.out.println(valor);
    }
}

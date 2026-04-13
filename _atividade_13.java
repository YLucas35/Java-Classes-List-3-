package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        String bisex = ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) ? ano+" é um ano bissexto." : ano+" não é um ano bissexto.";

        System.out.println(bisex);
    }
}

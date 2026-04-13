package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb1, numb2;

        System.out.println("Digite o primeiro número");
        numb1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        numb2 = sc.nextInt();

        String valor = (numb1 == numb2) ? "Os dois números são iguais" : "Os dois números são diferentes";

        System.out.println(valor);
    }
}

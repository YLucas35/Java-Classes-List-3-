package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;

        System.out.println("Digite um número para saber se ele é postivo ou negativo");
        numb = sc.nextInt();
        
        String valor = (numb >= 0) ? "Esse número é positivo" : "Esse número é negativo";

        System.out.println(valor);
    }
}

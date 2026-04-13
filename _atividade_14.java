package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;

        System.out.println("Insira a primeira nota do aluno");
        numb = sc.nextInt();
        
        String valor = (numb >= 7) ? "Ele está aprovado" : "Ele está reprovado";

        System.out.println(valor);
    }
}

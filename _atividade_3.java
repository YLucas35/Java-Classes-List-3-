package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;

        System.out.println("Quantos graus está a temperatura no ambiente?");
        temp = sc.nextInt();

        String graus = (temp > 40) ? "Temperatura extremamente alta" : "Temperatura dentro dos limites normais";

        System.out.println(graus);
    }
}

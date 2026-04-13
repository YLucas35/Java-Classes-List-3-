package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp1;

        System.out.println("Quantos graus está a temperatura no ambiente?");
        temp1 = sc.nextInt();

        String graus = (temp1 > 25) ? "Está quente" : (temp1 < 15) ? "Está frio" : "Está agradável";

        System.out.println(graus);
    }
}

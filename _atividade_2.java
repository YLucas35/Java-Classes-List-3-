package Java_Lista_3_Ternario;

import java.util.Scanner;

public class _atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb;

        System.out.println("Digite o valor do produto para ver se ele tem um desconto");
        numb = sc.nextDouble();

        String valor = (numb > 100) ? "O preço original é: "+numb : "O preço final com desconto é: "+(numb * 0.90);

        System.out.println(valor);
    }
}

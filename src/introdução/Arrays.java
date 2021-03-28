package introdução;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[3];
        int[] valores2 = new int[3];
        int[] valores3 = new int[3];

        for (int i = 0; i <valores.length; i++) {
            System.out.println("Informe 3 valores: ");
            valores[i] = entrada.nextInt();
            }

        for (int i = 0; i <valores.length; i++) {
            System.out.println("Subtração Informe 3 valores: ");
            valores2[i] = entrada.nextInt();
            }

        for (int i = 0; i <valores.length; i++) {
            System.out.println("Informe 3 valores: ");
            valores3[i] = valores[i] - valores2[i];
            }

        for (int j: valores3){
            System.out.println("O resultado é: " + j);
        }

        }
    }


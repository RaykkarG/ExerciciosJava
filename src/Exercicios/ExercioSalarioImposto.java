package Exercicios;
import java.util.Scanner;

public class ExercioSalarioImposto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu Salario, por gentileza: ");
        int salario = input.nextInt();

        double imposto5= 5*salario/100;
        double imposto10= 10*salario/100;
        double imposto15= 15*salario/100;
        double imposto20= 20*salario/100;


        if (salario<1000){
            System.out.println("O seu salario liquido é: " + (salario - imposto5));
        }else if (salario>=1000 && salario<2000 ){
            System.out.println("O seu salario liquido é: " + (salario - imposto10));
        }else if (salario>2000 && salario<4000){
            System.out.println("O seu salario liquido é: " + (salario - imposto15));
        }else {
            System.out.println("O seu salario liquido é: " + (salario - imposto20));
        }
    }

}

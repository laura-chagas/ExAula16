package Java.AulaDebug;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDebug {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("Exemplo do calculo do retangulo com funções");
        System.out.println("=========================================================");
        calcularSomaAreas();


        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de números com funções");
        System.out.println("=========================================================");
        mostrarTodosOsValoresListaNumero();

/*

        System.out.println("=========================================================");
       List<Integer> listaNumerosArray = retornarListaNumeros();
        mostrarTodosOsValoresListaNumero(listaNumerosArray);
*/

        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
        System.out.println("Digite a capacidade: ");
        capacidade = scanner.nextInt();
        mostrarMensagemComQuantidade(capacidade);

        System.out.println("=========================================================");
        System.out.println("Sua lista de nomes é:  " + retornarListaNomes());

    }


    public static double calcularAreaRetanguloComInputUsuario() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double areaRetangulo = base * altura;
        System.out.println("O valor da área é:  " + areaRetangulo);

        return areaRetangulo;
    }

    public static void calcularSomaAreas() {
        //Exemplo de uso do retorno de outra função
        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();
        System.out.println("A area total de construção é de: " + somaAreas);

    }


/*
   public static void calcularAreaRetangulo(double base, double altura) {
        double areaRetangulo = base * altura;
       System.out.println("O valor da área do retangulo é $areaRetangulo");
   }
*/


    public static void mostrarTodosOsValoresListaNumero() {
        System.out.println(retornarListaNumeros());
    }

    public static List<Integer> retornarListaNumeros() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listaNumero = new ArrayList<>();
        int tamnhoLista = 3;

        for (int i = 0; i < tamnhoLista; i++) {
            System.out.println("Informe um número: ");
            listaNumero.add(scanner.nextInt());
        }

        return listaNumero;
    }

    public static void mostrarMensagemComQuantidade(int quantidade) {
        System.out.println("A quantidade de nomes é: " + quantidade);

    }

    public static int capacidade;

    public static List<String> retornarListaNomes() {
        List<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < capacidade; i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(scanner.next());
        }

        return listaNomes;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ViniciuMota
 */

public class main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        parte1();
        parte2();
    }

    public static void parte1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula:");
        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        System.out.println(Arrays.toString(nomes));
    }

    public static void parte2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes e gêneros separados por vírgula (nome-gênero):");
        String input = scanner.nextLine();

        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        String[] pessoas = input.split(",");
        for (String pessoa : pessoas) {
            String[] dados = pessoa.split("-");
            String nome = dados[0].trim();
            String genero = dados[1].trim();

            Pessoa p = new Pessoa(nome, genero);
            if (genero.equalsIgnoreCase("masculino")) {
                masculino.add(p);
            } else if (genero.equalsIgnoreCase("feminino")) {
                feminino.add(p);
            } else {
                System.out.println("Gênero inválido para " + nome);
            }
        }

        System.out.println("Grupo Masculino:");
        System.out.println(masculino);

        System.out.println("Grupo Feminino:");
        System.out.println(feminino);

    }
}

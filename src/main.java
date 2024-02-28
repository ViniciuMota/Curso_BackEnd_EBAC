import java.util.ArrayList;
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
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();
        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();
        int res = 1;

        while (res != 0) {
            System.out.println("Qual o seu nome? ");
            String nome = scanner.next();

            System.out.println("Qual o seu gênero? ");
            String genero = scanner.next();

            Pessoa pessoa = new Pessoa(nome, genero);
            lista.add(pessoa);

            if (genero.equalsIgnoreCase("masculino")) {
                masculino.add(pessoa);
            } else if (genero.equalsIgnoreCase("feminino")) {
                feminino.add(pessoa);
            } else {
                System.out.println("Gênero inválido. Por favor, insira 'masculino' ou 'feminino'.");
            }

            System.out.println("Adicionar mais uma pessoa?");
            System.out.println("1 para 'sim' 0 para 'Não'");
            res = scanner.nextInt();
        }

        System.out.println("Lista de Pessoas:");
        System.out.println(masculino);
        System.out.println(feminino);
    }
}

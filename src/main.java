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
        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();

        Integer novaIdade = idade;

        System.out.println("Sua idade é "+ novaIdade + " anos");
    }
}

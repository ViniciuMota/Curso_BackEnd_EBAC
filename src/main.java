import java.util.Arrays;
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

        double notaFinal = 0;
        double nota;
        for (int i =0 ; i<4; i++){
            System.out.println("Digite a nota numero"+ (i+1));
            nota = scanner.nextDouble();
            notaFinal += nota;
        }
        notaFinal = notaFinal/4;

        if (notaFinal >= 7){
            System.out.println("Sua nota foi "+ notaFinal + " você esta aprovado");
        } else if (notaFinal >= 5) {
            System.out.println("Sua nota foi "+ notaFinal + " você esta de recuperação");
        }else {
            System.out.println("Sua nota foi "+ notaFinal + " você esta reprovado");
        }


    }
}

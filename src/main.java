/**
 * @author ViniciuMota
 */

public class main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Pessoa pessoaJuridica = new PessoaJuridica("Vinicius", 24, 234987234);
        Pessoa pessoaFisica = new PessoaFisica("Joao",24,234456678);

        System.out.println("Pessoa Juridica " + pessoaJuridica);
        System.out.println("Pessoa Fisica " + pessoaFisica);
    }

}

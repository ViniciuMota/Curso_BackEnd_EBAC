public class PessoaFisica extends Pessoa {

    private int cpf;

    public PessoaFisica(String nome, int idade, int cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{ " +
                "nome = " + getNome() +
                " idade = " + getIdade()+
                " cpf = " + cpf +
                '}';
    }
}

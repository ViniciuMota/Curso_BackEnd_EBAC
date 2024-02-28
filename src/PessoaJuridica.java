public class PessoaJuridica extends Pessoa{

    private int cnpj;

    public PessoaJuridica(String nome, int idade, int cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{ " +
                "nome = " + getNome() +
                " idade = " + getIdade()+
                " cnpj = " + cnpj +
                '}';
    }
}

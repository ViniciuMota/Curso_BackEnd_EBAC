public class Calculo {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    /**
     *
     * @param nota1
     * @param nota2
     * @param nota3
     * @param nota4
     */
    public Calculo(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public void calcularMedia(){
        double mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua media final é " + mediaFinal);
    }
}


public class Honda extends Carro {
    public Honda(String modelo, int ano) {
        super("Honda", modelo, ano);
    }

    @Override
    public void tipoCombustivel() {
        System.out.println("Gasolina");
    }
}

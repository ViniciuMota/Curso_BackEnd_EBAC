class Chevrolet extends Carro {
    // Construtor
    public Chevrolet(String modelo, int ano) {
        // Marca Chevrolet é fixa para todos os carros Chevrolet
        super("Chevrolet", modelo, ano);
    }

    // Implementação do método abstrato tipoCombustivel
    @Override
    public void tipoCombustivel() {
        System.out.println("Flex");  // Supondo que todos os carros Chevrolet funcionam com combustível flexível
    }
}
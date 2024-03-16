class Ford extends Carro {
    // Construtor
    public Ford(String modelo, int ano) {
        // Marca Ford é fixa para todos os carros Ford
        super("Ford", modelo, ano);
    }

    // Implementação do método abstrato tipoCombustivel
    @Override
    public void tipoCombustivel() {
        System.out.println("Alcool");  // Supondo que todos os carros Chevrolet funcionam com combustível flexível
    }
}
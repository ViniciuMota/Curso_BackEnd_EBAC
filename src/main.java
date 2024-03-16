import java.util.ArrayList;
import java.util.List;

/**
 * @author ViniciuMota
 */

public class main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Criando uma lista para armazenar todos os tipos de carros
        List<Carro> listaCarros = new ArrayList<>();

        Chevrolet chevrolet = new Chevrolet("Camarro", 2012);
        Honda honda = new Honda("Civic", 2021);
        // Adicionando carros à lista
        listaCarros.add(chevrolet);

        for (Carro carro : listaCarros) {
            System.out.println("\nMarca: " + carro.getMarca());
            System.out.println("\nModelo: " + carro.getModelo());
            System.out.println("\nAno: " + carro.getAno());
            carro.tipoCombustivel();
        }
    }

}

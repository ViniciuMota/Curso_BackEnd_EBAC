import java.lang.annotation.Annotation;

/**
 * @author ViniciuMota
 */

public class main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Cliente tab = new Cliente();
        Annotation[] annotations =  tab.getClass().getAnnotations();

        if(tab.getClass().isAnnotationPresent(Tabela.class)){
            Tabela an = tab.getClass().getAnnotation(Tabela.class);
            System.out.println("O valor da anotação Tabela é: " + an.nomeTabela());
        }
    }

}

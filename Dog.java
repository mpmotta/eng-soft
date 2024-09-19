package revisao2;
public class Dog extends CaesGatos implements Veterinario {
    private boolean displasia;

    public Dog(String nome, String raca, int anoNascimento, double peso, String CorPelo, boolean castrado, boolean displasia) {
        super(raca, CorPelo, castrado, nome, anoNascimento, peso);
        this.displasia = displasia;
    }

    
}

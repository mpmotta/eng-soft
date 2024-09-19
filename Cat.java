package revisao2;
public class Cat extends CaesGatos{
    private boolean pelagem;

    public Cat(boolean pelagem, String raca, String CorPelo, boolean castrado, String nome, int anoNascimento, double peso) {
        super(raca, CorPelo, castrado, nome, anoNascimento, peso);
        this.pelagem = pelagem;
    }
    
    
    
}

package revisao2;
public class Ave extends Pet{
    private boolean voa;
    private String penas;
    private String tipo;

    public Ave(String tipo, boolean voa, String penas, String nome, int anoNascimento, double peso) {
        super(nome, anoNascimento, peso);
        this.voa = voa;
        this.penas = penas;
        this.tipo = tipo;
    }
    
}

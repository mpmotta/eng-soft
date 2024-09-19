package revisao2;

import java.time.LocalDate;

public abstract class CaesGatos extends Pet{
    private String raca;
    private String CorPelo;
    private boolean castrado;
    private LocalDate hoje = LocalDate.now();

    public CaesGatos(String raca, String CorPelo, boolean castrado, String nome, int anoNascimento, double peso) {
        super(nome, anoNascimento, peso);
        this.raca = raca;
        this.CorPelo = CorPelo;
        this.castrado = castrado;
    }
    
    //metodos
    
    public void castrar(){
        if(this.castrado == true){
            System.out.println("Pet " + this.getNome() + " já castrado");
        }else{
            System.out.println("Castração do " + this.getNome() + " realizada com sucesso em " + hoje);
        }
    }
    
    public void vacina(){
        
        System.out.println("Vacina do " + this.getNome() +  " realizada em " + hoje);
    }
    
    public void comparRacao(int g){
        System.out.println(g + "g de ração comprados.");
    }
    
    public void comparRacao(double kg){
        System.out.println(kg + "kg de ração comprados.");
    }
    
    public void imc(double peso, double altura){
        double imc = peso / (altura * altura);
        
    }
    
}

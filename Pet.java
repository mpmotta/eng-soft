package revisao2;
public abstract class Pet {
    private String cpf;
    private String nome;
    private int anoNascimento;
    private double peso;

    public Pet(String nome, String cpf, int anoNascimento, double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
}

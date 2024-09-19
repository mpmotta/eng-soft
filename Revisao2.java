package revisao2;

public class Revisao2 {

    public static void main(String[] args) {
        Dog dog = new Dog("Spike", "Pitbull",
                2018, 12.3, "Cinza", false, false);
    
       dog.vacina();
       dog.castrar();
        
        
        
        Ave ave = new Ave("Papagaio", false,
        "Verde", "Clementino", 2020, 2.5);
    
    Cat cat = new Cat(true, "Persa", "Branco", true, "Frajola", 2020, 4.5);
  
    cat.castrar();
    cat.vacina();
    cat.comparRacao(3.5);
    
    cat.imc(3.5, 0.4);
    
    
   }     
}

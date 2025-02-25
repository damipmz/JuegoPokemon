package Logica;


public class JuegoPokemon {

    public static void main(String[] args) {
        
        //OBJETOS
        Squirtle squirtle = new Squirtle ();
        Pikachu pika = new Pikachu ();
        Charmander charmander = new Charmander ();
        Bulbasaur bulba = new Bulbasaur ();
        
        
        //LLAMO A LOS METODOS
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
        
        bulba.atacarAraniazo();
        bulba.atacarPistolaAgua();
        
        
    }
    
}

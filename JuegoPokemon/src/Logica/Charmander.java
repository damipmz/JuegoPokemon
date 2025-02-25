package Logica;

public class Charmander extends Pokemon implements IFuego{

    //Constructor vacio
    public Charmander() {
    }
    

    //Metodos heredados de la clase madre
    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque PLACAJE de Charmander");      
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque ARANIAZO de Charmander");  
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque MORDISCO de Charmander");  
    }
    
    //Metodos de interfaz de tipo FUEGO
    @Override
    public void atacarPunioFuego() {
        System.out.println("ATAQUE PUNIO DE FUEGO DE CHARMANDER!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("ATAQUE ASCUAS DE CHARMANDER!");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("ATAQUE LANZA LLAMAS DE CHARMANDER!");
    }

    
}

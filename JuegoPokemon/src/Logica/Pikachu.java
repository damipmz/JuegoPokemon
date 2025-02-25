
package Logica;


public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    

    //Metodos heredados de la clase madre
    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque PLACAJE de Pikachu");     
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque ARANIAZO de Pikachu");  
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque MORDISCO de Pikachu");  
    }

    //Implementando interfaz de tipo ELECTRICO
    @Override
    public void atacarImpactrueno() {
        System.out.println("ATAQUE IMPACT TRUENO DE PIKACHU!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("ATAQUE PUNIO DE TRUENO DE PIKACHU!");

    }

    @Override
    public void atacarRayo() {
        System.out.println("ATAQUE RAYO DE PIKACHU!");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("ATAQUE RAYO CARGA DE PIKACHU!");
    }

    
}

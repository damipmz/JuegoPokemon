package Logica;


public class Bulbasaur extends Pokemon implements IAgua{

    public Bulbasaur() {
    }
    

    //Metodos heredados de la clase madre
    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque PLACAJE de Bulbasaur");  
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque ARANIAZO de Bulbasaur");  
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque MORDISCO de Bulbasaur");
    }

    //Implemento metodos de tipo AGUA
    @Override
    public void atacarHidrobomba() {
        System.out.println("ATAQUE HIDROBOMBA DE BULBASAUR!!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("ATAQUE PISTOLA DE AGUA DE BULBASAUR!!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("ATAQUE BURBUJA DE BULBASAUR!!");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("ATAQUE HIDROPULSO DE BULBASAUR!!");
    }

 
    
}

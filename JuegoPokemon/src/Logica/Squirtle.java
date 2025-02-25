package Logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
   

    //Heredo metodos clase madre
    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque PLACAJE de Squirtle"); 
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque ARAÑAZO de Squirtle"); 
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque MORDISCO de Squirtle"); 
    }

    //Implementando interfaz de tipo AGUA
    @Override
    public void atacarHidrobomba() {
        System.out.println("ATAQUE HIDROBOMBA DE SQUIRTLE");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("ATAQUE PISTOLA DE AGUA DE SQUIRTLE");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("ATAQUE BURBUJA DE SQUIRTLE");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("ATAQUE HIDROPULSO DE SQUIRTLE");
    }
  
    
}

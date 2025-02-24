
package Logica;


public abstract class Pokemon {
    
    //PROTECTED Para que solo las clases hijas tengan acceso
    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporadaQueAparece;
    protected String tipo;
    
    
    //No tiene implementacion
    protected abstract void atacarPlacaje();
    
    protected abstract void atacarAraniazo();
    
    protected abstract void atacarMordisco();
    
    
}

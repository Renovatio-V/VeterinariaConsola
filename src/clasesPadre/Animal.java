
package clasesPadre;

public abstract class Animal {
    protected String especie;
    protected String raza;
    protected String nombre;

    public Animal(String especie, String raza, String nombre) {
        this.especie = especie;
        this.raza = raza;
        this.nombre = nombre;
    }   

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    @Override
    public abstract String toString();
}

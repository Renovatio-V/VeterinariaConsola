
package clasesPadre;


public abstract class Empleado extends Persona implements IAcciones{
    private double sueldo;

    public Empleado(double sueldo, long cedula, String nombre, String apellido, int edad) {
        super(cedula, nombre, apellido, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
            
}

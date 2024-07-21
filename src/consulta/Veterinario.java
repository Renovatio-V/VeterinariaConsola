
package consulta;

import clasesPadre.Empleado;
import java.util.ArrayList;
import java.util.List;


public class Veterinario extends Empleado{
    private String especialidad;
    private List<Consulta> consultas;

    public Veterinario(String especialidad, double sueldo, long cedula, String nombre, String apellido, int edad) {
        super(sueldo, cedula, nombre, apellido, edad);
        this.consultas = new ArrayList<>();
    }

    public String getSpecialidad() {
        return especialidad;
    }

    public void setSpecialidad(String specialidad) {
        this.especialidad = specialidad;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    @Override
    public void calcularSueldo(){    
        int contador = 0;
        
        for (Consulta consulta : consultas) {
            contador++;
        }
        
        setSueldo(getSueldo() + (25000) * contador);
        System.out.println("El sueldo dle veterinario es: " + getSueldo());
        
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Veterinario- ").append("\n");
        sb.append("Cedula: ").append(getCedula()).append("\n");
        sb.append("Nombre: ").append(getNombre()).append("\n");
        sb.append("Apellido: ").append(getApellido()).append("\n");
        sb.append("Cedula: ").append(getCedula()).append("\n");
        sb.append("Edad: ").append(getEdad()).append("\n");
        sb.append("Sueldo: ").append(getSueldo()).append("\n");
        sb.append("Especialidad: ").append(especialidad).append("\n");
        sb.append("Cosnultas: ").append("\n");
        for (Consulta consulta : consultas) {
            sb.append(consulta).append("\n");
        }
        
        
        return sb.toString();        
    }
    
    
    
}

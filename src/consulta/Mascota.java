
package consulta;

import clasesPadre.Animal;
import java.util.ArrayList;
import java.util.List;

public class Mascota extends Animal{
    protected long idMascota;
    private Cliente cliente;
    private List<Consulta> consultas;
  

    public Mascota(long idMascota, String especie, String raza, String nombre) {
        super(especie, raza, nombre);
        this.idMascota = idMascota;        
        this.consultas = new ArrayList<>();
    }

    public long getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(long idMascota) {
        this.idMascota = idMascota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("<<Mascota>> ").append("\n");
        sb.append("Especie: ").append(especie).append("\n");
        sb.append("Raza: ").append(raza).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        
        for (Consulta consulta : consultas) {
            sb.append(consulta).append("\n");
        }
        
        return sb.toString();
        
    }
    
    
}

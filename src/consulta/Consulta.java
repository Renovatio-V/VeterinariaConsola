
package consulta;

import Factura.Factura;
import java.time.LocalDateTime;


public class Consulta {
    
    private LocalDateTime fecha;
    private long idConsulta; 
    private Veterinario veterinario;
    private Mascota mascota;
    private String descripcion;
    private Factura factura;

    public Consulta(long idConsulta, String descripcion) {
        this.fecha = LocalDateTime.now();
        this.idConsulta = idConsulta;
        this.descripcion = descripcion;
    }
    
    public Consulta(int ano, int mes, int dia, int hora, int minuto, long idConsulta, String descripcion){
        this.fecha = LocalDateTime.of(ano, mes, dia, hora, minuto);
        this.idConsulta = idConsulta;
        this.descripcion = descripcion;
    }
    
    

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    public void relacionConObjetos(Mascota mascota, Veterinario veterinario){
        setMascota(mascota);
        mascota.getConsultas().add(this);
        
        setVeterinario(veterinario);
        veterinario.getConsultas().add(this);        
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Consulta- ").append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Veterinario: ").append(veterinario.getNombre()).append("\n");
        sb.append("IdMascota: ").append(mascota.idMascota);
        sb.append("Descripción: ").append(descripcion);
        sb.append("Factura: ").append(factura).append("\n");
        
        return sb.toString();        
    }
    
    
}

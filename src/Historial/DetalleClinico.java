
package Historial;

import consulta.Consulta;
import java.time.LocalDateTime;


public class DetalleClinico {
    private LocalDateTime fecha; 
    private HistorialClinico historialClinico;
    private Consulta consulta;
    private String descripcion;

    public DetalleClinico(Consulta consulta) {
        this.fecha = consulta.getFecha();
        this.consulta = consulta;
        this.descripcion = consulta.getDescripcion();        
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha: ").append(fecha);
        sb.append("Consulta: ").append(consulta).append("\n");
        sb.append("Descripcion: ").append(descripcion).append("\n");
        
        return sb.toString();        
    }
    
    
    
}

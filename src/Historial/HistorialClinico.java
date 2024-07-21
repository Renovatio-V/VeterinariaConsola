
package Historial;

import consulta.Mascota;
import java.util.ArrayList;
import java.util.List;

public class HistorialClinico {
    private long nReferencia;
    private Mascota mascota;
    private List<DetalleClinico> detalles;
    
    public HistorialClinico(DetalleClinico detalleClinico){
        nReferencia = detalleClinico.getConsulta().getMascota().getIdMascota();
        this.mascota = detalleClinico.getConsulta().getMascota();
        detalles = new ArrayList<>();
        addDetalle(detalleClinico);
    }
    
    private void addDetalle(DetalleClinico detalleClinico){
        detalles.add(detalleClinico);
        detalleClinico.setHistorialClinico(this);
        
    }

    public long getnReferencia() {
        return nReferencia;
    }

    public void setnReferencia(long nReferencia) {
        this.nReferencia = nReferencia;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public List<DetalleClinico> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleClinico> detalles) {
        this.detalles = detalles;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Historial Clinico").append("\n");
        sb.append("N° Referencia: ").append(nReferencia).append("\n");
        sb.append("Mascota: ").append(mascota.getNombre()).append("\n");
        sb.append("Cliente: ").append(mascota.getCliente().getNombre()).append("\n");
        sb.append("Detalles: ").append("\n");
        for (DetalleClinico detalle : detalles) {
            sb.append("\n").append(detalle);
        }        
        
        return sb.toString();
        
    }
    
}

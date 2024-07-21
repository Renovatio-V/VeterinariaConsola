
package Factura;

import consulta.Consulta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private LocalDate fecha; 
    private long nReferencia;
    private Consulta consulta;
    private double precioTotal = 25000;
    private List<DetalleFactura> detallesFacturas;

    public Factura(long nReferencia, Consulta consulta) {
        this.fecha = LocalDate.now();
        this.nReferencia = nReferencia;
        this.consulta = consulta;
        detallesFacturas = new ArrayList<>();
    }
    
    public void addDetalleFactura(DetalleFactura detalleFactura){
        detallesFacturas.add(detalleFactura);
        detalleFactura.setFactura(this);
        
        AumentarPrecioTotal(detalleFactura.getPrecioDetalle());
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public long getnReferencia() {
        return nReferencia;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public List<DetalleFactura> getDetallesFacturas() {
        return detallesFacturas;
    }
    
    public void AumentarPrecioTotal(double precioDetalle){
        this.precioTotal += precioDetalle;
    }
   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Factura").append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("nReferencia: ").append(nReferencia).append("\n");
        sb.append("Detalles de Factura: ").append("\n\n");
        for (DetalleFactura detalle : detallesFacturas) {
            sb.append(detalle).append("\n");
        }
        sb.append("Precio Consulta: ").append("25,000.0").append("\n");
        sb.append("Precio Total: ").append(precioTotal);
        
        return sb.toString();
                
    }
}

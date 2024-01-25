package MODELO;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carga implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private LocalDate fechaPartida;
    private String observacion;
    private long almacen_id;

    public Carga() {
    }

    public Carga(long id, LocalDate fechaPartida, String observacion,long almacen) {
        this.id = id;
        this.fechaPartida = fechaPartida;
        this.observacion = observacion;
        this.almacen_id = almacen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public long getId_almacen() {
        return almacen_id;
    }

    public void setId_almacen(long almacen) {
        this.almacen_id = almacen;
    }
    
}
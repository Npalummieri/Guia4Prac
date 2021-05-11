import java.time.LocalDate;

public class Alquiler {

    private int id=1;
    private Peliculas pelicula;
    private Cliente cliente;
    private LocalDate fechaRetiro;
    private LocalDate fechaDevo;


    public Alquiler()
    {

    }

    public Alquiler(Peliculas pelicula,Cliente cliente,LocalDate fechaRetiro)
    {
        this.id=id++;
        this.pelicula=pelicula;
        this.cliente=cliente;
        this.fechaRetiro=fechaRetiro;
        this.fechaDevo=fechaRetiro.plusDays(2);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public LocalDate getFechaDevo() {
        return fechaDevo;
    }

    public void setFechaDevo(LocalDate fechaDevo) {
        this.fechaDevo = fechaDevo;
    }


    @Override
    public String toString()
    {
        return "Alquiler [ IDalq = "+id+" Pelicula : "+pelicula+" Cliente : "+cliente+
                " fecha retiro "+fechaRetiro+" fecha devolucion : "+fechaDevo;
    }
}


import java.time.LocalDate;
import java.util.Date;

public class Peliculas {

    private String genero;
    private String titulo;
    private LocalDate fecha;
    private int duracion;
    private String pais;
    private int stock;

    public Peliculas()
    {

    }

    public Peliculas(String genero,String titulo,LocalDate fecha,int duracion,String pais,int stock)
    {
        this.genero=genero;
        this.titulo=titulo;
        this.fecha=fecha;
        this.duracion=duracion;
        this.pais=pais;
        this.stock=stock;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public String getPais()
    {
        return pais;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public LocalDate getFecha()
    {
        return fecha;
    }

    public void setFecha(LocalDate fecha)
    {
        this.fecha = fecha;
    }

    public int getDuracion()
    {
        return duracion;
    }

    public void setDuracion(int duracion)
    {
        this.duracion = duracion;
    }


    @Override
    public String toString() {
        return "Peliculas[" + "genero :'" + genero+ ", titulo :'" + titulo +", fecha=" + fecha +", duracion=" + duracion + ", pais='" + pais + ", stock=" + stock +
                ']';
    }
}

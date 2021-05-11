import java.time.LocalDate;

public class Store {


    private Peliculas[] peliculas;
    private Cliente[] clientes;
    private Alquiler[] alquileres;

    public Store()
    {

    }

    public Store(Peliculas[] peliculas,Cliente[] clientes)
    {
        this.peliculas=peliculas;
        this.clientes=clientes;
        this.alquileres=new Alquiler[50];
    }

    public Peliculas[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Peliculas[] peliculas) {
        this.peliculas = peliculas;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Alquiler[] alquileres) {
        this.alquileres = alquileres;
    }

    public Peliculas buscarPeli(String titulo)     ///Asumo que el doble retorno se puede por la condicion en sí
                                                    // pero lo habia hecho muy parecido
    {
        for(Peliculas peli : peliculas)
        {
            if(peli!=null && peli.getTitulo().equals(titulo))
            {
                return peli;
            }
        }
        return null;
    }

    public Alquiler buscarAlquiler(int id)
    {
        for(Alquiler alq : alquileres)
        {
            if(alq!=null && alq.getId()==id)
            {
                return alq;
            }
        }
        return null;
    }

    public void bajaAlquiler(int id)
    {
        int i;

        for(i=0;i<alquileres.length;i++)
        {
            if(alquileres[i].getId()==id)
            {
                alquileres[i]=null;
                break;                  ///No entiendo xq agrega el break
            }
        }
    }

    public Cliente buscarCliente(String nomCliente) ///Por ahi no es lo mejor por nombre pero bueno
    {
        for(Cliente client : clientes)
        {
            if(client !=null && client.getNombre().equals(nomCliente))
            {
                return client;
            }
        }
        return null;
    }

    public String agregarCliente(String nombre, int telefono, String direccion)
    {
        Cliente cliente = new Cliente(nombre, telefono, direccion);
        for (int i=0;i< clientes.length;i++)
        {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                break;
            }
        }
        return cliente.toString();
    }

    public Alquiler alquilar(String nomPeli,String nomCliente)
    {
        Peliculas peli=buscarPeli(nomPeli);
        Cliente clien= buscarCliente(nomCliente);


        if(peli!=null && clien!=null)
        {
            Alquiler alqui = new Alquiler(peli, clien, LocalDate.now()); ///averiguar si puedo cargar la id de forma automatica
                                                                                    // sin necesidad de hacerlo dde el constructor en si
            peli.setStock(peli.getStock() - 1);

            int i;
            for (i = 0;i < alquileres.length; i++) {
                if (alquileres[i] == null) {
                    alquileres[i] = alqui;
                    break;
                }
            }
            return alqui;

        }
        return null;

    }

    public void checkFechas(int id)
    {
        for(Alquiler alq : alquileres)
        {
            if(alq !=null && alq.getId()==id)
            {
                System.out.println(alq.getFechaRetiro());
                System.out.println(alq.getFechaDevo());
            }
        }

    }

    public void devolverPeli(int alqId)
    {
        Alquiler alqui =buscarAlquiler(alqId);

        if(alqui!=null)
        {
            String nombrePeli = alqui.getPelicula().getTitulo();
            Peliculas peli = buscarPeli(nombrePeli);

            peli.setStock(peli.getStock()+1);
            bajaAlquiler(alqId);


        }
    }


}

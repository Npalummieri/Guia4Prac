import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


    Peliculas[] peliculas = new Peliculas[20];

    Peliculas peli1= new Peliculas("Accion","Duro de Matar", LocalDate.now(),120,"USA",15);
    Peliculas peli2=new Peliculas("Aventura","Indiana Jones",LocalDate.now(),112,"USA",10);

    peliculas[0]=peli1;
    peliculas[1]=peli2;
    Cliente[] clientes = new Cliente[20];

    Cliente client1 =new Cliente("Jorge Jorgeles",223342453,"Catamarca 2020");
    Cliente client2 =new Cliente("Roberto Roberts",223545456,"La Rioja 1525");

    Store coleccion =new Store(peliculas,clientes);

    coleccion.agregarCliente("Jorge Jorgeles",223342453,"Catamarca 2020");
    coleccion.agregarCliente("Roberto Roberts",223545456,"La Rioja 1525");

    imprimirClientes(coleccion);
    imprimirPelis(coleccion);


    }
    public static void imprimirPelis(Store coleccion)
    {
        System.out.println("\n=== Imprimo films ===");
        for (Peliculas peli : coleccion.getPeliculas())
        {
            if (peli != null)
                System.out.println(peli);
        }
    }

    public static void imprimirClientes(Store coleccion)
    {
        System.out.println("\n=== Imprimo clientes ===");
        for (Cliente cliente : coleccion.getClientes()) {
            if (cliente != null) System.out.println(cliente);
        }
    }
}

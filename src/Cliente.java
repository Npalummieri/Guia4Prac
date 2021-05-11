public class Cliente {

    private String nombre;
    private int telefono;
    private String direcc;


    public Cliente()
    {

    }

    public Cliente(String nombre,int telefono,String direcc)
    {
        this.nombre=nombre;
        this.telefono=telefono;
        this.direcc=direcc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }


    @Override
    public String toString()
    {
        return "Cliente[ Nombre : "+nombre+" Telefono : "+telefono+" Direccion : "+direcc+"]";
    }
}

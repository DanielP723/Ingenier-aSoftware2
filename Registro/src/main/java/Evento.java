
public class Evento {
    private int id;
    private String nombre;
    private String dirección;
    private String hora;
    private String fecha;

    public Evento(int id, String nombre, String dirección, String hora, String fecha){
        this.id = id;
        this.nombre = nombre;
        this.dirección = dirección;
        this.hora = hora;
        this.fecha = fecha;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString(){
        return "Evento: " + nombre + "\nLugar: " + dirección+
                "\nHora: "+ hora + "\nFecha: " + fecha +"\n";
    }
    
}

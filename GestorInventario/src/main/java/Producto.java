
public class Producto {
    String nombreP;
    String categoría;

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
    
    public Producto(String n,String c){
        this.nombreP = n;
        this.categoría = c;
    }
    @Override
    public String toString(){
        return "Producto: "+nombreP + "\nCategoría: "+categoría+"\n";
    }
}

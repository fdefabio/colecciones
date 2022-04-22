package proyecto;

public class Animal {

    private String nombre;
    private String numeroDePatas;
    private String TipoDeAlimentacion;

    public Animal(String nombre, String numeroDePatas, String tipoDeAlimentacion) {
        this.nombre = nombre;
        this.numeroDePatas = numeroDePatas;
        this.TipoDeAlimentacion = tipoDeAlimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroDePatas() {
        return numeroDePatas;
    }

    public String getTipoDeAlimentacion() {
        return TipoDeAlimentacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDePatas(String numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        TipoDeAlimentacion = tipoDeAlimentacion;
    }
}

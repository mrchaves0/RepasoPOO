public class Deportista {
    private String nombre;
    private int edad;
    private String pais;
    private int horasEntrenamiendo;

    public Deportista() {

    }

    public Deportista(String nombre, int edad, String pais, int horasEntrenamiendo) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.horasEntrenamiendo = horasEntrenamiendo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getHorasEntrenamiendo() {
        return horasEntrenamiendo;
    }

    public void setHorasEntrenamiendo(int horasEntrenamiendo) {
        this.horasEntrenamiendo = horasEntrenamiendo;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasEntrenamiendo=" + horasEntrenamiendo +
                '}';
    }
    public void mostrarInformación (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Pais: " + pais);
        System.out.println("horasEntrenamiendo:" + horasEntrenamiendo);

    }

    public abstract double calcularRendimiento ();
}

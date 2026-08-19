public class Corredor extends Deportista{
    private double distancia;
    private double tiempo;

    public Corredor() {

    }

    public Corredor(double distancia, double tiempo) {
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public Corredor(String nombre, int edad, String pais, int horasEntrenamiendo, double distancia, double tiempo) {
        super(nombre, edad, pais, horasEntrenamiendo);
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "distancia=" + distancia +
                ", tiempo=" + tiempo +
                '}';
    }
}

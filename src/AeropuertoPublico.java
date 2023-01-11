public class AeropuertoPublico extends Aeropuerto {

    private double subvencion;

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }   

    public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, Compania[] listaCompañias, double subvencion) {
        super(nombre, ciudad, pais, listaCompañias);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }
   
}

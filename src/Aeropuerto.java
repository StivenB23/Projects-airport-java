public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compania listaCompañias[];
    private int numeroCompañia = 0;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    

    public Aeropuerto(String nombre, String ciudad, String pais, int numeroCompañia) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numeroCompañia = 0;
    }



    public Aeropuerto(String nombre, String ciudad, String pais, Compania[] listaCompañias) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.listaCompañias = listaCompañias;
        this.numeroCompañia = listaCompañias.length;
    }



    public void insertarCompañia(Compania compañia){
        listaCompañias[numeroCompañia] = compañia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    

    public Compania[] getListaCompañias() {
        return listaCompañias;
    }



    public Compania getCompañia(int i){
        return listaCompañias[i];
    }

    public Compania getCompañia(String nombre){
        int index = 0;
        boolean encontrado = false;
        Compania compañia = null;
        while((!encontrado) && (index < listaCompañias.length)){
            if(nombre.equals(listaCompañias[index].getNombre())){
                compañia = listaCompañias[index];
                encontrado = true;
            }
            index++;
        }
        return compañia;
    }

    

    
}

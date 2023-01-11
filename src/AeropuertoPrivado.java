public class AeropuertoPrivado extends Aeropuerto {
    
    private String[] listaEmpresas = new String[10];
    private int numeroEmpresas;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
            super(nombre, ciudad, pais);
    }

    

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compania[] listaCompañias, String[] listaEmpresas) {
        super(nombre, ciudad, pais, listaCompañias);
        this.listaEmpresas = listaEmpresas;
        numeroEmpresas = listaEmpresas.length;
    }

    public void insertarEmpresas(String empresas[]){
        this.listaEmpresas = empresas;
        this.numeroEmpresas = empresas.length;
    }

    public void insertarEmpresa(String empresa){
        this.listaEmpresas[numeroEmpresas] = empresa;
    }



    public String[] getListaEmpresas() {
        return listaEmpresas;
    }



    public int getNumeroEmpresas() {
        return numeroEmpresas;
    }

    
}

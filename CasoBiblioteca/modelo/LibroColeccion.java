package modelo;

public class LibroColeccion extends Libro
{
    //---------------------
    //Atributos
    //---------------------
    public String nombreColeccion;
    public int numColeccion;

    public LibroColeccion(String nLi, String nAu1,String nAu2, int aEd, String eLu, String nCol, int sCol)
    {
        super(nLi, nAu1,nAu2, aEd, eLu);
        this.nombreColeccion= nCol;
        this.numColeccion= sCol;
    }
    public String getNombreColeccion() {
        return nombreColeccion;
    }
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    public int getSerieColeccion() {
        return numColeccion;
    }
    public void setSerieColeccion(int numColeccion) {
        this.numColeccion = numColeccion;
    }
}

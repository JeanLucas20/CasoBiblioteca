package modelo;


public class Libro 
{
    //---------------------
    //Atributos
    //---------------------
    public String nombreLibro;
    public String nombreAutor1;
    public String nombreAutor2;
    public int añoEdicion;
    public String edicionLujo;
    //public boolean edicionLujo;

    //---------------------
    //Métodos
    //---------------------

    //Constructor comun u ordinario
    public Libro(String nLi, String nAu1, String nAu2,int aEd, String eLu)
    {
        this.nombreLibro = nLi;
        this.nombreAutor1 = nAu1;
        this.nombreAutor2 = nAu2;
        this.añoEdicion = aEd;
        this.edicionLujo= eLu;
    }

    public Libro(Libro pb)
    {
        this.nombreLibro = pb.getNombreLibro();
        this.nombreAutor1 = pb.getNombreAutor1();
        this.nombreAutor2 = pb.getNombreAutor2();
        this.añoEdicion = (int) pb.getAñoEdicion();
        this.edicionLujo = pb.getEdicionLujo();
    }

    //Metodos de acceso
    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    public String getNombreAutor1() {
        return nombreAutor1;
    }

    public void setNombreAutor1(String nombreAutor1) {
        this.nombreAutor1 = nombreAutor1;
    }
    public String getNombreAutor2() {
        return nombreAutor2;
    }

    public void setNombreAutor2(String nombreAutor2) {
        this.nombreAutor2 = nombreAutor2;
    }
    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }
    public String getEdicionLujo() {
        return edicionLujo;
    }

    public void setEdicionLujo(String edicionLujo) {
        this.edicionLujo = edicionLujo;
    }
    public String calcularNombreAutor2()
    {
        if(nombreAutor2.equals(""))
        {
            return nombreAutor2;
        }
        else
        {
            return nombreAutor2 + " y otros";
        }
    }
    //______________________

    public String toString()
    {
        return "Información del libro: "+ "\n✓ El nombre del libro es : " + nombreLibro +"\n✓ El autor es: " + nombreAutor1 + calcularNombreAutor2() + 
         "\n✓ El año de la edicion del libro es: "+añoEdicion + "\n✓ La colección es : "+ edicionLujo; 
    }
}

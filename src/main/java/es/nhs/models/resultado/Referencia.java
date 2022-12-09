package es.nhs.models.resultado;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/12/2022
 */
public class Referencia
{

    String equipo;
    String nombre;
    int pases;

    public Referencia(String equipo, String nombre, int pases)
    {
        this.equipo = equipo;
        this.nombre = nombre;
        this.pases = pases;
    }

    public String getEquipo()
    {
        return equipo;
    }

    public void setEquipo(String equipo)
    {
        this.equipo = equipo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getPases()
    {
        return pases;
    }

    public void setPases(int pases)
    {
        this.pases = pases;
    }

    @Override
    public String toString()
    {
        return "Referencia{" +
                "equipo='" + equipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pases=" + pases +
                '}';
    }
}

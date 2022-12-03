package es.nhs.models.resultado;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/12/2022
 */
public class PorteroJugador
{

    String equipo;
    String nombre;
    int pases;

    public PorteroJugador()
    {
        this.equipo = "";
        this.nombre = "";
        this.pases = -1;
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
}

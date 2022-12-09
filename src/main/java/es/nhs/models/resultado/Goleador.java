package es.nhs.models.resultado;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/12/2022
 */
public class Goleador
{

    String equipo;
    String nombre;
    int minuto;
    int segundo;

    public Goleador(String equipo, String nombre, int minuto, int segundo)
    {
        this.equipo = equipo;
        this.nombre = nombre;
        this.minuto = minuto;
        this.segundo = segundo;
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

    public int getMinuto()
    {
        return minuto;
    }

    public void setMinuto(int minuto)
    {
        this.minuto = minuto;
    }

    public int getSegundo()
    {
        return segundo;
    }

    public void setSegundo(int segundo)
    {
        this.segundo = segundo;
    }

    @Override
    public String toString()
    {
        return "Goleador{" +
                "equipo='" + equipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }
}

package es.nhs.models.resultado;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/12/2022
 */
public class Luchador
{

    String equipo;
    String nombre_jugador;
    int duelos_ganados;

    public Luchador(String equipo, String nombre_jugador, int duelos_ganados)
    {
        this.equipo = equipo;
        this.nombre_jugador = nombre_jugador;
        this.duelos_ganados = duelos_ganados;
    }

    public String getEquipo()
    {
        return equipo;
    }

    public void setEquipo(String equipo)
    {
        this.equipo = equipo;
    }

    public String getNombre_jugador()
    {
        return nombre_jugador;
    }

    public void setNombre_jugador(String nombre_jugador)
    {
        this.nombre_jugador = nombre_jugador;
    }

    public int getDuelos_ganados()
    {
        return duelos_ganados;
    }

    public void setDuelos_ganados(int duelos_ganados)
    {
        this.duelos_ganados = duelos_ganados;
    }

    @Override
    public String toString()
    {
        return "Luchador{" +
                "equipo='" + equipo + '\'' +
                ", nombre_jugador='" + nombre_jugador + '\'' +
                ", duelos_ganados=" + duelos_ganados +
                '}';
    }
}

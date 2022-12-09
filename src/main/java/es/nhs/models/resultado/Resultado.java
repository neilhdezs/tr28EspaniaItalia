package es.nhs.models.resultado;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/12/2022
 */
public class Resultado
{
    List<Goleador> goleador;
    List<Referencia> referencia;
    PorteroJugador portero_jugador;
    List<Luchador> luchador;
    PorcentajePosesion porcentajes_posesion;

    public Resultado()
    {
        this.goleador = new ArrayList<>();
        this.referencia = new ArrayList<>();
        this.portero_jugador = new PorteroJugador();
        this.luchador = new ArrayList<>();
        this.porcentajes_posesion = new PorcentajePosesion();
    }

    public List<Goleador> getGoleador()
    {
        return goleador;
    }

    public void setGoleador(List<Goleador> goleador)
    {
        this.goleador = goleador;
    }

    public List<Referencia> getReferencia()
    {
        return referencia;
    }

    public void setReferencia(List<Referencia> referencia)
    {
        this.referencia = referencia;
    }

    public PorteroJugador getPortero_jugador()
    {
        return portero_jugador;
    }

    public void setPortero_jugador(PorteroJugador portero_jugador)
    {
        this.portero_jugador = portero_jugador;
    }

    public List<Luchador> getLuchador()
    {
        return luchador;
    }

    public void setLuchador(List<Luchador> luchador)
    {
        this.luchador = luchador;
    }

    public PorcentajePosesion getPorcentajes_posesion()
    {
        return porcentajes_posesion;
    }

    public void setPorcentajes_posesion(PorcentajePosesion porcentajes_posesion)
    {
        this.porcentajes_posesion = porcentajes_posesion;
    }

    @Override
    public String toString()
    {
        return "Resultado{" +
                "\n\ngoleador=" + goleador +
                "\n\nreferencia=" + referencia +
                "\n\nportero_jugador=" + portero_jugador +
                "\n\nluchador=" + luchador +
                "\n\nporcentajes_posesion=" + porcentajes_posesion +
                '}';
    }
}

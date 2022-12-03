package es.nhs.utils;

import es.nhs.models.events.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/12/2022
 */
public class Filtter
{

    List<Event> eventList;

    public Filtter(List<Event> eventList)
    {
        this.eventList = eventList;
    }

    public List<Event> getEventList()
    {
        return eventList;
    }

    public void setEventList(List<Event> eventList)
    {
        this.eventList = eventList;
    }

    public void goleadores()
    {

        for (int i = 0; i<this.eventList.size(); i++)
        {
            if (this.eventList.get(i).getShot() != null)
            {
                if (this.eventList.get(i).getShot().getOutcome().getId() == 97 && this.eventList.get(i+1).getGoalkeeper().getType().getId() == 26)
                {
                    System.out.println(
                            "Nombre del jugador que ha marcado: " + this.eventList.get(i).getPlayer().getName() + " - Equipo al que pertenece -> " +
                            this.eventList.get(i).getTeam().getName() + " - minuto en el que se ha marcado el gol -> " + this.eventList.get(i).getMinute() +
                            ":" + this.eventList.get(i).getSecond()
                    );
                }
            }
        }
    }

    public void referenica()
    {
        // String: Jugador que recibe el pase, Integer: Numero de pases que ha recibido
        Map<String, Integer> numeroPases = new HashMap<>();

        for (Event event : this.eventList)
        {
            if (event.getPass() != null)
            {
                if (event.getPass().getRecipient() != null)
                {
                    if (numeroPases.containsKey(event.getPass().getRecipient().getName()))
                    {
                        numeroPases.put(event.getPass().getRecipient().getName(), numeroPases.get(event.getPass().getRecipient().getName()) + 1);
                    }
                    else
                    {
                        numeroPases.put(event.getPass().getRecipient().getName(), 1);
                    }
                }
            }
        }

        String jugadorMaxPass = "";
        int numPassOfJugador = -1;

        for (Map.Entry<String,Integer> jugadorPass:numeroPases.entrySet())
        {
            if (jugadorPass.getValue() > numPassOfJugador)
            {
                numPassOfJugador = jugadorPass.getValue();
                jugadorMaxPass = jugadorPass.getKey();
            }
        }

        System.out.println("El Jugador con el mayor número de pases recibidos del partido ha sido -> " + jugadorMaxPass + " Con " + numPassOfJugador + " Pases.");

    }

    public void porteroJugador()
    {

    }

    public void luchador()
    {

        int duelWonSpain = 0;
        int duelWonItaly = 0;
        int duelTotal = 0;

        String ganador;

        for (Event event : this.eventList)
        {
            if (event.getType().getId() == 4)
            {
                duelTotal++;

                if (event.getDuel().getOutcome() != null)
                {
                    if (event.getDuel().getOutcome().getId() == 4 && event.getTeam().getName().equals("Spain"))
                    {
                        duelWonSpain++;
                    } else if (event.getDuel().getOutcome().getId() == 4 && event.getTeam().getName().equals("Italy"))
                    {
                        duelWonItaly++;
                    }
                }
            }
        }

        if (duelWonSpain > duelWonItaly)
        {
            ganador = "Spain";
        }
        else if (duelWonSpain < duelWonItaly)
        {
            ganador = "Italy";
        }
        else
        {
            ganador = "empate";
        }

        System.out.println("El Equipo que mayor porcentaje de duelos ha ganado es: " + ganador + " total: " + duelTotal + " Spain: " + duelWonSpain + " Italy: " + duelWonItaly);

    }

    public void porcentajePosesion()
    {

    }

}

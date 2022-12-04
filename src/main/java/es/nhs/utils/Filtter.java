package es.nhs.utils;

import es.nhs.models.events.Event;
import es.nhs.models.resultado.*;

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
    Resultado resultado;

    public Filtter(List<Event> eventList)
    {
        this.eventList = eventList;
        this.resultado = new Resultado();
    }

    public List<Event> getEventList()
    {
        return eventList;
    }

    public void setEventList(List<Event> eventList)
    {
        this.eventList = eventList;
    }

    public void filtradoCompleto()
    {
        goleadores();
        referenica();
        porteroJugador();
        luchador();
        porcentajePosesion();
        System.out.println(this.resultado.toString());
    }

    public void goleadores()
    {

        for (int i = 0; i<this.eventList.size(); i++)
        {
            if (this.eventList.get(i).getShot() != null)
            {
                if (this.eventList.get(i).getShot().getOutcome().getId() == 97 && this.eventList.get(i+1).getGoalkeeper().getType().getId() == 26)
                {

                    this.resultado.getGoleador().add(new Goleador(
                            this.eventList.get(i).getTeam().getName(),
                            this.eventList.get(i).getPlayer().getName(),
                            this.eventList.get(i).getMinute(),
                            this.eventList.get(i).getSecond()
                    ));
                }
            }
        }
    }

    public void referenica()
    {
        // String: Jugador que recibe el pase, Integer: Numero de pases que ha recibido
        Map<String, Integer> numeroPasesSpain = new HashMap<>();
        Map<String, Integer> numeroPasesItaly = new HashMap<>();


        for (int i = 0; i<this.eventList.size(); i++)
        {
            if (this.eventList.get(i).getPass() != null)
            {
                if (this.eventList.get(i).getPass().getRecipient() != null)
                {
                    if (this.eventList.get(i+1).getPossession_team().getName().equals("Spain"))
                    {
                        if (numeroPasesSpain.containsKey(this.eventList.get(i).getPass().getRecipient().getName()))
                        {
                            numeroPasesSpain.put(this.eventList.get(i).getPass().getRecipient().getName(), numeroPasesSpain.get(this.eventList.get(i).getPass().getRecipient().getName()) + 1);
                        }
                        else
                        {
                            numeroPasesSpain.put(this.eventList.get(i).getPass().getRecipient().getName(), 1);
                        }
                    }
                    else
                    {
                        if (numeroPasesItaly.containsKey(this.eventList.get(i).getPass().getRecipient().getName()))
                        {
                            numeroPasesItaly.put(this.eventList.get(i).getPass().getRecipient().getName(), numeroPasesItaly.get(this.eventList.get(i).getPass().getRecipient().getName()) + 1);
                        }
                        else
                        {
                            numeroPasesItaly.put(this.eventList.get(i).getPass().getRecipient().getName(), 1);
                        }
                    }
                }
            }
        }

        String jugadorMaxPass = "";
        int numPassOfJugador = -1;

        for (Map.Entry<String,Integer> jugadorPassSpain:numeroPasesSpain.entrySet())
        {
            if (jugadorPassSpain.getValue() > numPassOfJugador)
            {
                numPassOfJugador = jugadorPassSpain.getValue();
                jugadorMaxPass = jugadorPassSpain.getKey();
            }
        }

        this.resultado.getReferencia().add(new Referencia("Spain", jugadorMaxPass, numPassOfJugador));

        jugadorMaxPass = "";
        numPassOfJugador = -1;

        for (Map.Entry<String,Integer> jugadorPassItaly:numeroPasesItaly.entrySet())
        {
            if (jugadorPassItaly.getValue() > numPassOfJugador)
            {
                numPassOfJugador = jugadorPassItaly.getValue();
                jugadorMaxPass = jugadorPassItaly.getKey();
            }
        }

        this.resultado.getReferencia().add(new Referencia("Italy", jugadorMaxPass, numPassOfJugador));

    }

    public void porteroJugador()
    {

        int passOfSpainToGoalPeeker = 0;
        int passOfItalyToGoalPeeker = 0;
        String goalKeeperSpain = "";
        String goalKeeperItaly = "";

        for (int i = 0; i<this.eventList.size(); i++)
        {
            if (this.eventList.get(i).getPass() != null)
            {
                if (this.eventList.get(i).getPass().getRecipient() != null)
                {
                    if (this.eventList.get(i + 1).getPosition().getId() == 1)
                    {

                        if(this.eventList.get(i + 1).getTeam().getName().equals("Spain"))
                        {
                            passOfSpainToGoalPeeker++;
                        }


                        if(this.eventList.get(i + 1).getTeam().getName().equals("Italy"))
                        {
                            passOfItalyToGoalPeeker++;
                        }
                    }
                }
            }
        }

        int i = 0;

        while (goalKeeperSpain.equals("") || goalKeeperItaly.equals(""))
        {

            if (eventList.get(i).getTeam().getName().equals("Spain"))
            {
                goalKeeperSpain = eventList.get(i).getTactics().getLineup().get(0).getPlayer().getName();
            }

            if (eventList.get(i).getTeam().getName().equals("Italy"))
            {
                goalKeeperItaly = eventList.get(i).getTactics().getLineup().get(0).getPlayer().getName();
            }

            i++;
        }

        if (passOfSpainToGoalPeeker>passOfItalyToGoalPeeker)
        {
            this.resultado.setPortero_jugador(new PorteroJugador("Spain", goalKeeperSpain, passOfSpainToGoalPeeker));
        }
        else
        {
            this.resultado.setPortero_jugador(new PorteroJugador("Italy", goalKeeperItaly, passOfItalyToGoalPeeker));
        }
    }

    public void luchador()
    {

        // String: Jugador que recibe gana el duelo, Integer: Numero de duelos ganados
        Map<String, Integer> numeroDuelosSpain = new HashMap<>();
        Map<String, Integer> numeroDuelosItaly = new HashMap<>();
        int duelosGanadosSpain = 0;
        int duelosGanadosItaly = 0;
        int duelosTotales = 0;

        for (Event event:this.eventList)
        {
            if (event.getDuel() != null && event.getDuel().getOutcome() != null)
            {
                if (event.getDuel().getOutcome().getId() == 4)
                {

                    duelosTotales++;

                    if (event.getPossession_team().getName().equals("Spain"))
                    {

                        duelosGanadosSpain++;

                        if (numeroDuelosSpain.containsKey(event.getPlayer().getName()))
                        {
                            numeroDuelosSpain.put(event.getPlayer().getName(), numeroDuelosSpain.get(event.getPlayer().getName())+ 1);
                        }
                        else
                        {
                            numeroDuelosSpain.put(event.getPlayer().getName(), 1);
                        }
                    } else if (event.getPossession_team().getName().equals("Italy"))
                    {

                        duelosGanadosItaly++;

                        if (numeroDuelosItaly.containsKey(event.getPlayer().getName()))
                        {
                            numeroDuelosItaly.put(event.getPlayer().getName(), numeroDuelosItaly.get(event.getPlayer().getName())+ 1);
                        }
                        else
                        {
                            numeroDuelosItaly.put(event.getPlayer().getName(), 1);
                        }
                    }
                }
            }
        }

        System.out.println(duelosTotales);
        System.out.println(duelosGanadosSpain);
        System.out.println(duelosGanadosItaly);

        for (Map.Entry<String, Integer> entry:numeroDuelosSpain.entrySet())
        {
            System.out.println(entry.getValue() + " -> Puntos " + entry.getKey() + " <- Jugador");
        }

        System.out.println("\n\nITALY");

        for (Map.Entry<String, Integer> entry:numeroDuelosItaly.entrySet())
        {
            System.out.println(entry.getValue() + " -> Puntos " + entry.getKey() + " <- Jugador");
        }

    }

    public void porcentajePosesion()
    {

        double primerTiempoSpain = 0;
        double segundoTiempoSpain = 0;
        double primerTiempoItaly = 0;
        double segundoTiempoItaly = 0;
        double total = 0;

        for (Event event:this.eventList)
        {
            if (event.getDuration() != null)
            {

                total = total + event.getDuration();

                if (event.getPossession_team().getName().equals("Spain"))
                {
                    if (event.getPeriod() == 1)
                    {
                        primerTiempoSpain = primerTiempoSpain + event.getDuration();
                    } else if (event.getPeriod() == 2)
                    {
                        segundoTiempoSpain = segundoTiempoSpain + event.getDuration();
                    }
                }

                if (event.getPossession_team().getName().equals("Italy"))
                {
                    if (event.getPeriod() == 1)
                    {
                        primerTiempoItaly = primerTiempoItaly + event.getDuration();
                    } else if (event.getPeriod() == 2)
                    {
                        segundoTiempoItaly = segundoTiempoItaly + event.getDuration();
                    }
                }
            }
        }

        double porcentajeSpainPrimerTiempo = 100 / ((primerTiempoSpain + primerTiempoItaly) / primerTiempoSpain);
        double porcentajeItalyPrimerTiempo = 100 / ((primerTiempoSpain + primerTiempoItaly) / primerTiempoItaly);
        double porcentajeSpainSegundoTiempo = 100 / ((segundoTiempoSpain + segundoTiempoItaly) / segundoTiempoSpain);
        double porcentajeItalySegundoTiempo = 100 / ((segundoTiempoSpain + segundoTiempoItaly) / segundoTiempoItaly);
        double porcentajeSpainTotal = (porcentajeSpainPrimerTiempo + porcentajeSpainSegundoTiempo) / 2;
        double porcentajeItalyTotal = (porcentajeItalyPrimerTiempo + porcentajeItalySegundoTiempo) / 2;

        this.resultado.getPorcentajes_posesion().setPrimer_tiempo(new PrimerTiempo(porcentajeSpainPrimerTiempo, porcentajeItalyPrimerTiempo));
        this.resultado.getPorcentajes_posesion().setSegundo_tiempo(new SegundoTiempo(porcentajeSpainSegundoTiempo, porcentajeItalySegundoTiempo));
        this.resultado.getPorcentajes_posesion().setPartido_completo(new PartidoCompleto(porcentajeSpainTotal, porcentajeItalyTotal));

    }

}

package es.nhs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import es.nhs.models.events.Event;
import es.nhs.utils.Filtter;
import es.nhs.utils.Json;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Launcher
{

    private static final Logger LOG = LogManager.getLogger(); // we create Logs

    public static void main(String[] args)
    {

        Filtter filtter = null;

        ObjectMapper mapper = Json.mapper();

        try
        {
            List<Event> listEvent = mapper.readValue(Paths.get("src/main/resources/3795220.json").toFile(), new TypeReference<List<Event>>(){});

            filtter = new Filtter(listEvent);

            filtter.goleadores();
            filtter.luchador();
            filtter.referenica();

        } catch (IOException exception)
        {
            exception.printStackTrace();
        }




    }
}

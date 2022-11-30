package es.nhs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import es.nhs.models.Event;
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
        ObjectMapper mapper = Json.mapper();

        try
        {
            List<Event> cocheList1 = mapper.readValue(Paths.get("src/main/resources/3795220.json").toFile(), new TypeReference<List<Event>>(){});

            for (Event coche1: cocheList1)
            {
                System.out.println(coche1.toString());
            }

        } catch (IOException exception)
        {
            exception.printStackTrace();
        }


    }
}

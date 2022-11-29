package es.nhs;

import com.fasterxml.jackson.databind.ObjectMapper;
import es.nhs.utils.Json;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Launcher
{

    private static final Logger LOG = LogManager.getLogger(); // we create Logs
    ObjectMapper mapper = Json.mapper();

    public static void main(String[] args)
    {

    }
}

package es.nhs.utils;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Json
{
    private static final String DATE_TIME_FORMATTER = "HH:mm:ss.SSS";
    private static ObjectMapper mapper;

    public static ObjectMapper mapper()
    {
        if (Json.mapper == null)
        {
            Json.mapper = Json.createJson();
        }
        return Json.mapper;
    }

//    private static ObjectMapper createJson()
//    {
//        return new ObjectMapper();
//    }

    private static ObjectMapper createJson()
    {
        final ObjectMapper mapper = new ObjectMapper();
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(DATE_TIME_FORMATTER)));
        mapper.registerModule(javaTimeModule);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        return mapper;
    }

}

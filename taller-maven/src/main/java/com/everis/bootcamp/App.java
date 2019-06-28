package com.everis.bootcamp;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	LocalTime localTime = new LocalTime();
        LocalDate localDate = new LocalDate();
        String fechaHora=localDate.toString()+" " +localTime.toString();
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS");
        DateTime jodatime = dtf.parseDateTime(fechaHora);
     
        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm");
        System.out.println( "Hello World!" );
        System.out.println( "Hora: " +localTime.toString());
        System.out.println( "Fecha: "+ localDate.toString());
        System.out.println( dtfOut.print(jodatime));

    }
}


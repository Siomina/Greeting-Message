package message;

import static org.junit.Assert.assertEquals;
import java.text.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class EventTest {
	 private static final Logger log = LogManager.getLogger(EventTest.class.getName());
	     Event event;
  
	    @Test
	    public void testNightFirst()throws ParseException{
	       event = new Event("23:00:00");
	       assertEquals("\\u0414\\u043E\\u0431\\u0440\\u043E\\u0439 \\u043D\\u043E\\u0447\\u0438, \\u041C\\u0438\\u0440!", event.getEvent());
	       log.info(event.getEvent());
	    }

	    @Test
	    public void testNightSecond()throws ParseException{
	        event = new Event("05:59:59");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u043E\\u0439 \\u043D\\u043E\\u0447\\u0438, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testNightThree()throws ParseException{
	        event = new Event("23:00:01");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u043E\\u0439 \\u043D\\u043E\\u0447\\u0438, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testNightFour()throws ParseException{
	        event = new Event("02:00:00");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u043E\\u0439 \\u043D\\u043E\\u0447\\u0438, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testMorningFirst()throws ParseException{
	        event = new Event("06:00:01");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u043E\\u0435 \\u0443\\u0442\\u0440\\u043E, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testMorningSecond()throws ParseException{
	        event = new Event("08:59:59");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u043E\\u0435 \\u0443\\u0442\\u0440\\u043E, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testMorningThree()throws ParseException{
	        event = new Event("07:25:01");
	       assertEquals("\\u0414\\u043E\\u0431\\u0440\\u043E\\u0435 \\u0443\\u0442\\u0440\\u043E, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testMorningFour()throws ParseException{
	        event = new Event("08:00:00");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u043E\\u0435 \\u0443\\u0442\\u0440\\u043E, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }
	    @Test
	    public void testDayFirst()throws ParseException{
	        event = new Event("09:00:01");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u044B\\u0439 \\u0434\\u0435\\u043D\\u044C, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testDaySecond()throws ParseException{
	        event = new Event("18:59:59");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u044B\\u0439 \\u0434\\u0435\\u043D\\u044C, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testDayThree()throws ParseException{
	        event = new Event("15:35:51");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u044B\\u0439 \\u0434\\u0435\\u043D\\u044C, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testDayFour()throws ParseException{
	        event = new Event("16:53:15");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u044B\\u0439 \\u0434\\u0435\\u043D\\u044C, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testEveningFirst()throws ParseException{
	        event = new Event("19:00:01");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u044B\\u0439 \\u0432\\u0435\\u0447\\u0435\\u0440, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testEveningSecond()throws ParseException{
	        event = new Event("22:59:59");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u044B\\u0439 \\u0432\\u0435\\u0447\\u0435\\u0440, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testEveningThree()throws ParseException{
	        event = new Event("21:25:01");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u044B\\u0439 \\u0432\\u0435\\u0447\\u0435\\u0440, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testEveningFour()throws ParseException{
	        event = new Event("22:00:00");
	        assertEquals("\\u0414\\u043E\\u0431\\u0440\\u044B\\u0439 \\u0432\\u0435\\u0447\\u0435\\u0440, \\u041C\\u0438\\u0440!", event.getEvent());
	        log.info(event.getEvent());
	    }
	}


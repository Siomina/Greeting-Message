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
	       assertEquals("Доброй ночи, Мир!", event.getEvent());
	       log.info(event.getEvent());
	    }

	    @Test
	    public void testNightSecond()throws ParseException{
	        event = new Event("05:59:59");
	        assertEquals("Доброй ночи, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testNightThree()throws ParseException{
	        event = new Event("23:00:01");
	        assertEquals("Доброй ночи, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testNightFour()throws ParseException{
	        event = new Event("02:00:00");
	        assertEquals("Доброй ночи, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testMorningFirst()throws ParseException{
	        event = new Event("06:00:01");
	        assertEquals("Доброе утро, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testMorningSecond()throws ParseException{
	        event = new Event("08:59:59");
	        assertEquals("Доброе утро, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testMorningThree()throws ParseException{
	        event = new Event("07:25:01");
	       assertEquals("Доброе утро, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testMorningFour()throws ParseException{
	        event = new Event("08:00:00");
	        assertEquals("Доброе утро, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }
	    @Test
	    public void testDayFirst()throws ParseException{
	        event = new Event("09:00:01");
	        assertEquals("Добрый день, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testDaySecond()throws ParseException{
	        event = new Event("18:59:59");
	        assertEquals("Добрый день, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testDayThree()throws ParseException{
	        event = new Event("15:35:51");
	        assertEquals("Добрый день, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testDayFour()throws ParseException{
	        event = new Event("16:53:15");
	        assertEquals("Добрый день, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testEveningFirst()throws ParseException{
	        event = new Event("19:00:01");
	        assertEquals("Добрый вечер, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testEveningSecond()throws ParseException{
	        event = new Event("22:59:59");
	        assertEquals("Добрый вечер, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testEveningThree()throws ParseException{
	        event = new Event("21:25:01");
	        assertEquals("Добрый вечер, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }

	    @Test
	    public void testEveningFour()throws ParseException{
	        event = new Event("22:00:00");
	        assertEquals("Добрый вечер, Мир!", event.getEvent());
	        log.info(event.getEvent());
	    }
	}


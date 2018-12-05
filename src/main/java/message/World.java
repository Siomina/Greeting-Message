package message;

import java.text.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class World {
	
	    private static final Logger log = LogManager.getLogger(World.class.getName());

	    public static void main(String[] args) {
//commit
	        Event event = new Event();
	        String events = null;
	        try{
	            events = event.getEvent();
	            System.out.println(events);
	        }catch (ParseException e){
	            log.error("Parse exception",e);
	        }
	    }
	}


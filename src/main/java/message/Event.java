package message;

import java.text.ParseException;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Event {
	    private static final Logger log = LogManager.getLogger(Event.class.getName());
	    private LocalTime now; 
	    private String morning = "06:00";
	    private String day = "09:00";
	    private String evening = "19:00";
	    private String night = "23:00";
	    private String ress;

	    public Event(){
	    	now = LocalTime.now();
	    }

	    public Event(String time) throws ParseException{
	    	now = LocalTime.parse(time);
	    }

	    public String getEvent() throws ParseException {

	    	Locale.getDefault();
			ResourceBundle res = ResourceBundle.getBundle("MessageResource");
	
	        if(now.isAfter(LocalTime.parse(morning)) && now.isBefore(LocalTime.parse(day)) || now.equals(morning) ){
	            ress = res.getString("morning");
	            log.info(ress);
	            return ress;
	        }
	        else if (now.isAfter(LocalTime.parse(day)) && now.isBefore(LocalTime.parse(evening)) || now.equals(day)){
	            ress = res.getString("day");
	            log.info(ress);
	            return ress;
	        }
	        else if (now.isAfter(LocalTime.parse(evening)) && now.isBefore(LocalTime.parse(night)) || now.equals(morning)){
	            ress = res.getString("evening");
	            log.info(ress);
	            return ress;
	        }
	        else
	        ress = res.getString("night");
	        log.info(ress);
	        return ress;
	     }
}
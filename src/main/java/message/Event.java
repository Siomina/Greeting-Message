package message;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Event {
	
	    private static final Logger log = LogManager.getLogger(Event.class.getName());

	    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    private Date current;//текущий
	    private Date morning;//утро
	    private Date day;//день
	    private Date evening;//вечер
	    private Date night;//ночь
	    private Date currentDate;//текущая дата
	    private String ress;

	    public Event(){
	        currentDate = new Date();
	    }

	    public Event(String event) throws ParseException{
	        currentDate = dateFormat.parse(event);
	    }

	    public String getEvent() throws ParseException {

	    	Locale.setDefault(new Locale("ru", "RU"));
			ResourceBundle res = ResourceBundle.getBundle("MessageResource");
			
	        current = dateFormat.parse(dateFormat.format(currentDate));
	        morning  = dateFormat.parse(BorderEvent.MORNING.toString());
	        day  = dateFormat.parse(BorderEvent.DAY.toString());
	        evening = dateFormat.parse(BorderEvent.EVENING.toString());
	        night = dateFormat.parse(BorderEvent.NIGHT.toString());

	        if(current.after(morning) && current.before(day) || current.equals(morning) ){
	            ress = res.getString("morning");
	            log.info(ress);
	            return ress;
	        }
	        else if (current.after(day) && current.before(evening) || current.equals(day)){
	            ress = res.getString("day");
	            log.info(ress);
	            return ress;
	        }
	        else if (current.after(evening) && current.before(night) || current.equals(morning)){
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
	enum BorderEvent {

	    MORNING("06:00:00"),
	    DAY("09:00:00"),
	    EVENING("19:00:00"),
	    NIGHT("23:00:00");

	    private final String time;

	    BorderEvent(String time) {
	        this.time = time;
	    }

	    @Override
	    public String toString() {
	        return time;
	    }
	}


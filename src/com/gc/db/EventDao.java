package com.gc.db;
import java.util.List;

import com.gc.model.Events;
public class EventDao {

public interface EventDaoInterface{
   public List<Events> getAllEvents();
   public Events getEventByType (String type);
   public Events getEventByDate (String date);
   public Events getEventByLocation (String location);
   public Events getEventByPrice (String Price);
   
   public void updateEvents(Events event);
   public void cleanEvents(Events event);
}

}

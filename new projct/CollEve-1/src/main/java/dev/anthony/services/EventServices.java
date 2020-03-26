package dev.anthony.services;

import java.util.Set;

import dev.anthony.entities.Event;

public interface EventServices {

	 Event createEvnt(Event ev);
	
	 Set<Event> getallEvent();
	 
	 Event getEventById(int id);
	 
	 Event updateEvent(Event eve);
	 
	 boolean deleteEvent(Event eve);
}

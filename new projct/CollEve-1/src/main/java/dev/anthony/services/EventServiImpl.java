package dev.anthony.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.anthony.entities.Event;
import dev.anthony.repositories.EventRepo;
@Component
@Service
public class EventServiImpl implements EventServices {
	
	@Autowired
	EventRepo er;
	

	@Override
	public Event createEvnt(Event ev) {
		this.er.save(ev);
		return ev;
	}

	@Override
	public Set<Event> getallEvent() {
		Set<Event> ee= new HashSet<Event>((Collection<? extends Event>)er.findAll());
		
		return ee;
	}

	@Override
	public Event getEventById(int id) {
		
		return er.findById(id).get();
	}

	@Override
	public Event updateEvent(Event eve) {
		eve = er.save(eve);
		return eve;
	}

	@Override
	public boolean deleteEvent(Event eve) {
		this.er.delete(eve);
		return false;
	}

}

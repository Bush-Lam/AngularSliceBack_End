package dev.anthony.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.anthony.entities.Event;

@Component
@Repository
public interface EventRepo extends CrudRepository<Event, Integer> {

}

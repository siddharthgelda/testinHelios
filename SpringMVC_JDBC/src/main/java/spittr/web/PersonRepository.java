package spittr.web;

import org.springframework.stereotype.Repository;

import spittr.person;

@Repository
public interface PersonRepository {
	public person getUser(long id);
	public int addPerson(person p);
}
package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spittr.person;
@Service
public class Manager {

	@Autowired
	public PersonRepository personeRepository;
	
	public  void save(person ob)
	{
		personeRepository.addPerson(ob);
	}

	public person findOne(String spittleId) {
		// TODO Auto-generated method stub
		person p= personeRepository.getUser(Long.parseLong(spittleId));
System.out.println(p.toString());
return p;
	}
}

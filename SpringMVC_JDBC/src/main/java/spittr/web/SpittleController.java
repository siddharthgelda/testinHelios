package spittr.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.Spittle;
import spittr.person;
@Controller
@RequestMapping("/spitttles")
public class SpittleController {
	public static List personlist=new ArrayList();
public SpittleController()
{
	
}
@Autowired
private Manager manager;


	
	
//for query parameter
	//@RequestParam(value="count", defaultValue="20")
	//@RequestParam("max") long max,
	//@RequestParam("count") int count)

	//URL param meter like /spitttles/123
	//@RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
//	public String spittle(
		   // @PathVariable("spittleId") long spittleId,
		   // Model model)
	
	@RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
	public String spittle(@PathVariable String spittleId, Model model) {
	  model.addAttribute("person",manager.findOne(spittleId));
	  return "spittles";
	}

	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String spittle() {
	return "registerForm";
	}

	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String spittle(person spittle) {
		manager.save(spittle);
		return "redirect:/register";
	}
	
	
}

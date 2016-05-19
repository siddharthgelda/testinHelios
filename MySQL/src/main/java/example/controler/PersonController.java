package example.controler;

import example.domain.Person;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import example.repository.PersonRepository;

@Controller
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value="/add",method=RequestMethod.GET )
    public String AddPerson() {
      return "add";
  }
    @RequestMapping(value="/add",method=RequestMethod.POST )
      public String AddPerson( Person person) {
        personRepository.save(person);
        return "redirect:/list";
    }
    @RequestMapping("/list")
    public String ListPerson(Map map) {
     map.put("list",  personRepository.findAll());
    	return "list";
    }
}
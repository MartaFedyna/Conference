package pl.edu.agh.ki.mwo.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.edu.agh.ki.mwo.model.Author;
import pl.edu.agh.ki.mwo.persistence.ConferenceDatabase;

@Controller
public class AuthorsController {

    @RequestMapping(value="/Authors")
    public String listStudents(Model model, HttpSession session) 
    {    	
    	if (session.getAttribute("userLogin") == null)
    		return "redirect:/Login";
    	
    	model.addAttribute("authors", ConferenceDatabase.getInstance().getAuthors());
    	
        return "authorsList"; 
    }
    
    
    /*
    @RequestMapping(value="/AddStudent")
    public String displayAddStudentForm(Model model, HttpSession session) 
    {    	
    	if (session.getAttribute("userLogin") == null)
    		return "redirect:/Login";
    	
        return "studentForm";    
    }
    */

    /*
    @RequestMapping(value="/CreateStudent", method=RequestMethod.POST)
    public String createStudent(@RequestParam(value="studentName", required=false) String name,
    		@RequestParam(value="studentSurname", required=false) String surname,
    		@RequestParam(value="studentSex", required=false) String sex,
    		Model model, HttpSession session) 
    {    	
    	if (session.getAttribute("userLogin") == null)
    		return "redirect:/Login";
    	
    	StudentsDatabase.getInstance().addStudent(new Student(name, surname, sex.equals("female")));    	
       	model.addAttribute("students", StudentsDatabase.getInstance().getStudents());
    	model.addAttribute("message", "Nowy uczeń został dodany");
         	
    	return "studentsList";    
    }
    */


    /*
    @RequestMapping(value="/RemoveStudent")
    public String createStudent(@RequestParam(value="studentId") int studentId,
    		Model model, HttpSession session) 
    {    	
    	if (session.getAttribute("userLogin") == null)
    		return "redirect:/Login";
    	
    	StudentsDatabase.getInstance().removeStudent(studentId);
       	model.addAttribute("students", StudentsDatabase.getInstance().getStudents());
    	model.addAttribute("message", "Uczeń został skasowany");
         	
    	return "studentsList";    
    }
    */


}
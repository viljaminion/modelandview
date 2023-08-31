package s23backend.modelandview.controller;

import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import s23backend.modelandview.domain.Student;



@Controller
public class StudentController {

@GetMapping ("hello")
public String sayHello
	
			(@RequestParam(name="age")int age,
			@RequestParam(name="name")String name,  Model model)
		{
			model.addAttribute("age",age);
			model.addAttribute("name", name);
	
			return "list";
		}
	
	
@GetMapping("students")
	public String showStudents(Model model) {
		
			System.out.println("Welcome to Haaga-Helia!");
		
			List<Student> oppilaat = new ArrayList<>();
			oppilaat.add(new Student ("Thornton", "Joe"));
			oppilaat.add(new Student ("Domi", "Max"));
			oppilaat.add(new Student ("Selanne", "Teemu"));
			oppilaat.add(new Student ("Brodeur", "Martin"));
			oppilaat.add(new Student ("Hall", "Taylor"));
		
			model.addAttribute("students", oppilaat);
		
			return "StudentList";
	}



}



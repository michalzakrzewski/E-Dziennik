package pl.devmich.edziennik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.devmich.edziennik.entities.Student;
import pl.devmich.edziennik.repositories.StudentRepository;

import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/")
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page){

        model.addAttribute("data", studentRepository.findAll(new PageRequest(page, 4)));
        return "index";
    }

    @PostMapping(value = "/save")
    public String saveStudent(Student student){
        studentRepository.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteStudent(Integer id){
        studentRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Student> findOne(Integer id){
        return studentRepository.findById(id);
    }

}

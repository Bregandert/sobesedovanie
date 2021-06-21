package Students_application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/students")
public class StudentsController {

    private StudentsService studentsService;

    @Autowired
    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @GetMapping
    public String showAll(Model model, @RequestParam Map<String, String> requestParams) {
        List<Students> students = studentsService.findAll();
        model.addAttribute("students", students);
        return "all_students";
    }

    @GetMapping("/add")
    public String showAddForm() {
        return "add_student_form";
    }

    @PostMapping("/add")
    public String saveNewStudent(@ModelAttribute Students student) {
        studentsService.saveOrUpdate(student);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentsService.findById(id));
        return "edit_student_form";
    }

    @PostMapping("/edit")
    public String modifyStudent(@ModelAttribute Students student) {
        studentsService.saveOrUpdate(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id, Model model) {
        studentsService.deleteById(id);
        return "redirect:/students";
    }

}
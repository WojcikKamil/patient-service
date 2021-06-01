package pl.wsiz.iid3.healthcenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid3.healthcenter.service.PatientService;

@Controller
@RequestMapping(value="/patient")
public class PatientController extends PatientService{
    @Autowired
    private PatientService patientService;

    @GetMapping(path="/name")
    @ResponseBody
    public String name() {
        return "Witamy";
    }

    @GetMapping(path="/age")
    @ResponseBody
    public String age(@RequestParam(required = true) int yearNow, @RequestParam int yearBirth) {
        return Integer.toString(yearNow-yearBirth);
    }

    @GetMapping(path="/all")
    @ResponseBody
    public String patientId(@RequestParam Long idP){
        return (patientService.findbyId(idP)).toString();
    }

    @GetMapping(path="/lastname")
    @ResponseBody
    public String patientName(@RequestParam String lname){
        return patientService.findByName(lname);
    }
}

package pl.wsiz.iid3.healthcenter.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.wsiz.iid3.healthcenter.entity.PatientEntity;
import pl.wsiz.iid3.healthcenter.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientControllerJSON {
    @Autowired
    private PatientService patientService;

    @GetMapping(path="name/{lname}", produces = "application/json")
    public String patientName(@PathVariable String lname){
        return (patientService.findByLastName(lname)).toString();
    }

    @GetMapping(path="/all", produces = "application/json")
    public String patientAll(){
        return (patientService.findAll()).toString();
    }

    @GetMapping(path="pesel/{pesel}", produces = "application/json")
    public String patientPesel(@PathVariable String pesel){
        return (patientService.findByPesel(pesel)).toString();
    }
}

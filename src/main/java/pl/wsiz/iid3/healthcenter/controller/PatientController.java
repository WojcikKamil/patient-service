package pl.wsiz.iid3.healthcenter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/patient")
public class PatientController {
    @GetMapping(path="/name")
    @ResponseBody
    public String name() {
        return "Witamy";
    }
}

package pl.wsiz.iid3.healthcenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid3.healthcenter.dto.Lek;
import pl.wsiz.iid3.healthcenter.service.LekService;

import java.util.List;

@Controller
@RequestMapping(value = "/medicine")
public class MedicineController {
    @Autowired
    private LekService lekService;

    @GetMapping(path = "/allMedicine")
    public String getMedicineAll(final ModelMap model) {
        List<Lek> leki = lekService.getAllMedicine();
        model.addAttribute("lekiAll", leki);
        return "lekiAll";
    }

    @GetMapping(path = "/medicineByName")
    @ResponseBody
    public String getMedicineByNazwa(@RequestParam String nazwa){
        return lekService.findMedicineByName(nazwa);
    }

    @GetMapping(path = "/medicineByProducent")
    @ResponseBody
    public String getMedicineByProducent(@RequestParam String producent){
        return lekService.findMedicineByProducent(producent);
    }

    @GetMapping(path = "/medicineByNameWeb")
    public String getAllByName(final ModelMap model, @RequestParam String name) {
        List<Lek> leki = lekService.getAllMedByName(name);
        model.addAttribute("lekiByName", leki);
        return "lekiByName";
    }
    @GetMapping(path = "/medicineByProducentWeb")
    public String getAllByProducent(final ModelMap model, @RequestParam String producent) {
        List<Lek> leki = lekService.getAllMedByProducent(producent);
        model.addAttribute("lekiByProducent", leki);
        return "lekiByProducent";
    }
}

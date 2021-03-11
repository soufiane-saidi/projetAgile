package com.projetAgile.ubo.Controllers;

import com.projetAgile.ubo.Entities.Formation;
import com.projetAgile.ubo.Services.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FormationController {

    private FormationService formationService;
    @Autowired
    public FormationController(FormationService formationService) {
        this.formationService = formationService;
    }



    @GetMapping(value = "/allFormations")
    public List<Formation> findAllFormations(){
        return formationService.getAllFormations();
    }

    @GetMapping(value = "/Formations/code={code}")
    public Formation findByCode(@PathVariable String code){
        return formationService.getFormation(code);
    }

    @PostMapping(path = "/formation")
    public boolean addFormation(@RequestBody Formation formation){
        return formationService.addFormation(formation);
    }
}

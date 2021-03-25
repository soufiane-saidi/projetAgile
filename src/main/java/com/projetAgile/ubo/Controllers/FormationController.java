package com.projetAgile.ubo.Controllers;

import com.projetAgile.ubo.Entities.Formation;
import com.projetAgile.ubo.Services.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value = "/formation/{id}")
    public Formation findFormationById(@PathVariable String id){
        return formationService.getFormationById(id);
    }
    
    @PostMapping(path = "/formation")
    public Formation addFormation(@RequestBody Formation formation){
        return formationService.addFormation(formation);
    }
    
    @DeleteMapping(value = "/Formations/code={code}")
    public boolean findByCode(@PathVariable String code){
        return formationService.deleteFormation(code);
    }

}

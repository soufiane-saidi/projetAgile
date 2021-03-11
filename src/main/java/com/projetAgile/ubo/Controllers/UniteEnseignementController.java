package com.projetAgile.ubo.Controllers;


import com.projetAgile.ubo.Entities.UniteEnseignement;

import com.projetAgile.ubo.Services.UniteEnseignementService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")

@RestController
public class UniteEnseignementController {

    private UniteEnseignementService uniteEnseignementService;
    @Autowired
    public UniteEnseignementController(UniteEnseignementService uniteEnseignementService) { this.uniteEnseignementService = uniteEnseignementService; }



    @GetMapping(value = "/allUniteEnseignement")
    public List<UniteEnseignement> findAllUniteEnseignement(){
        return uniteEnseignementService.getAllUniteEnseignement();
    }
    
    @GetMapping(value = "/UniteEnseignements/Formation/code={code}")
    public List<UniteEnseignement> getUniteEnseignementsByCodeFormation(@PathVariable String code){
        return uniteEnseignementService.getUniteEnseignementsByCodeFormation(code);
    }


}

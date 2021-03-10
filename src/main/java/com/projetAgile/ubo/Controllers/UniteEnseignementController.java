package com.projetAgile.ubo.Controllers;


import com.projetAgile.ubo.Entities.UniteEnseignement;

import com.projetAgile.ubo.Services.UniteEnseignementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UniteEnseignementController {

    private UniteEnseignementService uniteEnseignementService;
    @Autowired
    public UniteEnseignementController(UniteEnseignementService uniteEnseignementService) { this.uniteEnseignementService = uniteEnseignementService; }



    @GetMapping(value = "/allUniteEnseignement")
    public List<UniteEnseignement> findAllUniteEnseignement(){
        return uniteEnseignementService.getAllUniteEnseignement();
    }

}

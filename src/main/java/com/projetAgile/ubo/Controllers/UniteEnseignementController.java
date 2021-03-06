package com.projetAgile.ubo.Controllers;


import com.projetAgile.ubo.Entities.UniteEnseignement;

import com.projetAgile.ubo.Services.UniteEnseignementService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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
    
    /*@GetMapping(value = "/UniteEnseignements/Formation/code={code}")
    public List<UniteEnseignement> getUniteEnseignementsByCodeFormation(@PathVariable String code){
        return uniteEnseignementService.getUniteEnseignementsByCodeFormation(code);
    }*/


    @GetMapping(value = "/UniteEnseignements/Formation/code={code}")
    public List<UniteEnseignement> getUniteEnseignementsByCodeFormation(@PathVariable String code){
        return uniteEnseignementService.getUniteEnseignementsByCodeFormation(code);
    }

    @GetMapping(value = "/UniteEnseignements/UE/code={code}")
    public UniteEnseignement getUniteEnseignementsByCodeUe(@PathVariable String code){
        return uniteEnseignementService.getUniteEnseignementsByCodeUe(code);
    }

    @PutMapping(value = "/UniteEnseignements/UE/code={code}/designation={designation}/nbhCm={nbhCm}/nbhTd={nbhTd}/nbhTp={nbhTp}")
    public boolean updateUe(@PathVariable String code,@PathVariable String designation,
                            @PathVariable BigDecimal nbhCm,@PathVariable BigDecimal nbhTd,
                            @PathVariable BigDecimal nbhTp){
       return uniteEnseignementService.updateUe(code, designation, nbhCm,  nbhTd,  nbhTp);

    }

    @PutMapping(value = "/updateUEEnseignant/code={code}/ensCode={ensCode}")
    public boolean updateEUEns(@PathVariable String code,@PathVariable long ensCode){
        return uniteEnseignementService.updateUeEns(code,ensCode);
    }
}

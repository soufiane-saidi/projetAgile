package com.projetAgile.ubo.Controllers;

import com.projetAgile.ubo.DTO.EnseignantsDTO;
import com.projetAgile.ubo.Entities.Enseignant;
import com.projetAgile.ubo.Services.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@RestController
public class EnseignantController {

    private EnseignantService enseignantService;

    @Autowired
    public EnseignantController(EnseignantService enseignantService) {
        this.enseignantService = enseignantService;
    }

    @GetMapping(value = "/allEnseignants")
    public List<EnseignantsDTO> getAllEnseignants(){
        return enseignantService.getAllEnseignant();
    }
    
    
}

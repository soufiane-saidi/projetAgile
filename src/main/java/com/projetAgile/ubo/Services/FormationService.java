package com.projetAgile.ubo.Services;

import com.projetAgile.ubo.Entities.Formation;
import com.projetAgile.ubo.Repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationService {

    private FormationRepository formationRepository;

    @Autowired
    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public List<Formation> getAllFormations(){
        return formationRepository.findAll();
    }
    public Formation getFormation(String code){
        return formationRepository.findFormationByCodeFormation(code);
    }

    public Formation addFormation(Formation formation){
        return formationRepository.save(formation);
    }



}

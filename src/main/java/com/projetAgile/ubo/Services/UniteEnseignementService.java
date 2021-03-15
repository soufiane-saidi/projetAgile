package com.projetAgile.ubo.Services;

import com.projetAgile.ubo.Entities.Formation;
import com.projetAgile.ubo.Entities.UniteEnseignement;
import com.projetAgile.ubo.Repositories.FormationRepository;
import com.projetAgile.ubo.Repositories.UniteEnseignementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniteEnseignementService {

    private UniteEnseignementRepository uniteEnseignementRepository;
    private FormationRepository formationRepository;

    @Autowired
    public UniteEnseignementService(UniteEnseignementRepository uniteEnseignementRepository) {
        this.uniteEnseignementRepository = uniteEnseignementRepository;

    }

    public List<UniteEnseignement> getAllUniteEnseignement(){
        return uniteEnseignementRepository.findAll();
    }



    public List<UniteEnseignement> getUniteEnseignementsByCodeFormation(String codeFormation) {
       // Formation formation= formationRepository.findFormationByCodeFormation(codeFormation);
        return uniteEnseignementRepository.findByIdCodeFormation(codeFormation);
    }




}

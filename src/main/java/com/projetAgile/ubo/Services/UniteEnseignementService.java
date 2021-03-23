package com.projetAgile.ubo.Services;

import com.projetAgile.ubo.Entities.Formation;
import com.projetAgile.ubo.Entities.UniteEnseignement;
import com.projetAgile.ubo.Repositories.FormationRepository;
import com.projetAgile.ubo.Repositories.UniteEnseignementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.List;

import static org.aspectj.runtime.internal.Conversions.intValue;

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
    public UniteEnseignement getUniteEnseignementsByCodeUe(String codeUe) {
        // Formation formation= formationRepository.findFormationByCodeFormation(codeFormation);
        return uniteEnseignementRepository.findByIdCodeUe(codeUe);
    }
    public boolean updateUe(String codeUe,String designation,BigDecimal nbhCm, BigDecimal nbhTd, BigDecimal nbhTp){
        UniteEnseignement uniteEnseignement=getUniteEnseignementsByCodeUe(codeUe);

        uniteEnseignement.setDesignation(designation);
        uniteEnseignement.setNbhCm(nbhCm);
        uniteEnseignement.setNbhTd(nbhTd);
        uniteEnseignement.setNbhTp(nbhTp);
         if(uniteEnseignementRepository.save(uniteEnseignement)!=null){
             return true;
         }else{ return false;}

    }



}

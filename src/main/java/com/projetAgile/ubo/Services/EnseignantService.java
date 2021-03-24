package com.projetAgile.ubo.Services;

import com.projetAgile.ubo.DTO.EnseignantsDTO;
import com.projetAgile.ubo.Entities.Enseignant;
import com.projetAgile.ubo.Entities.UniteEnseignement;
import com.projetAgile.ubo.Repositories.EnseignantRepository;
import com.projetAgile.ubo.Repositories.UniteEnseignementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Service
public class EnseignantService {

    private EnseignantRepository enseignantRepository;
    private UniteEnseignementRepository uniteEnseignementRepository;

    @Autowired
    public EnseignantService(EnseignantRepository enseignantRepository,UniteEnseignementRepository uniteEnseignementRepository) {
        this.enseignantRepository = enseignantRepository;
        this.uniteEnseignementRepository = uniteEnseignementRepository;
    }

    public List<EnseignantsDTO> getAllEnseignant(){
        List<EnseignantsDTO> returnList = new ArrayList<>();
        List<Enseignant> enseignants =  enseignantRepository.findAll();
        if(!enseignants.isEmpty()){
            for(Enseignant enseignant: enseignants){
                List<UniteEnseignement> uniteEnseignements = uniteEnseignementRepository.findByEnseignantNoEnseignant(enseignant.getNoEnseignant());
                EnseignantsDTO enseignantsDTO = new EnseignantsDTO();
                enseignantsDTO.setId(enseignant.getNoEnseignant());
                enseignantsDTO.setNom(enseignant.getNom());
                enseignantsDTO.setPrenom(enseignant.getPrenom());
                BigDecimal nbrHTD = new BigDecimal("0");
                if(!uniteEnseignements.isEmpty()){
                    for(UniteEnseignement uniteEnseignement: uniteEnseignements){
                        nbrHTD = nbrHTD.add(calculateHeureTD(uniteEnseignement));
                    }
                }
                enseignantsDTO.setNombreHeuresTD(nbrHTD);
                returnList.add(enseignantsDTO);

            }
        }
        return returnList;
    }

    public BigDecimal calculateHeureTD(UniteEnseignement uniteEnseignement){
        //Gotta get the correct math calcul
        BigDecimal divisor = new BigDecimal("1.5");
        BigDecimal cm = uniteEnseignement.getNbhCm().divide(divisor,2, RoundingMode.CEILING);
        BigDecimal tp = uniteEnseignement.getNbhTp().multiply(divisor);

        return cm.add(uniteEnseignement.getNbhTd()).add(tp);

    }
}

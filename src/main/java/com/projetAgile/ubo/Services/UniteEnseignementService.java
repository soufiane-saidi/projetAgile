package com.projetAgile.ubo.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetAgile.ubo.Entities.UniteEnseignement;
import com.projetAgile.ubo.Repositories.UniteEnseignementRepository;

@Service
public class UniteEnseignementService {
	private UniteEnseignementRepository uniteEnseignementRepository;
	
	@Autowired
    public UniteEnseignementService(UniteEnseignementRepository uniteEnseignementRepository) {
        this.uniteEnseignementRepository = uniteEnseignementRepository;
    }

	public List<UniteEnseignement> findByFormation(String codeFormation) {
		return uniteEnseignementRepository.findByFormation(codeFormation);
	}
	
	
    
}

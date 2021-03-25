package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.Entities.UniteEnseignement;
import com.projetAgile.ubo.Entities.UniteEnseignementPK;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniteEnseignementRepository extends JpaRepository<UniteEnseignement, UniteEnseignementPK> {
	public List<UniteEnseignement> findByFormation(String codeFormation);
}

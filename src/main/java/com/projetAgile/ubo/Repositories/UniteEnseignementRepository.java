package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.Entities.Formation;
import com.projetAgile.ubo.Entities.UniteEnseignement;
import com.projetAgile.ubo.Entities.UniteEnseignementPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface UniteEnseignementRepository extends JpaRepository<UniteEnseignement, UniteEnseignementPK> {

	//public List<UniteEnseignement> findByFormation(Formation formation);

    public List<UniteEnseignement> findByFormation(Formation formation);
    public List<UniteEnseignement> findByIdCodeFormation(String codeFormation);
    public UniteEnseignement findByIdCodeUe(String codeUE);



}

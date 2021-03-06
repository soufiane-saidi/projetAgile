package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.Entities.Formation;
import com.projetAgile.ubo.Entities.UniteEnseignement;
import com.projetAgile.ubo.Entities.UniteEnseignementPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniteEnseignementRepository extends JpaRepository<UniteEnseignement, UniteEnseignementPK> {

    //public List<UniteEnseignement> findByFormation(Formation formation);

    List<UniteEnseignement> findByFormation(Formation formation);
    UniteEnseignement findByIdCodeUe(String codeUE);
    List<UniteEnseignement> findByIdCodeFormation(String codeFormation);
    List<UniteEnseignement> findByEnseignantNoEnseignant(long noEnseignant);
}

package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant,String> {
}

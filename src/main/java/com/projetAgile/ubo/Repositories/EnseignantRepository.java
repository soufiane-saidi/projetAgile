package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.DTO.EnseignantsDTO;
import com.projetAgile.ubo.Entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {

    Enseignant findByNoEnseignant(long noEnseignant);
}

package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.Entities.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat,String> {
}

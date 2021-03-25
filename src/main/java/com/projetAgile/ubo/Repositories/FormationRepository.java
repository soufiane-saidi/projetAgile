package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.Entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<Formation, String> {
}

package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.Entities.Formation;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormationRepository extends JpaRepository<Formation, String> {

    public Formation findFormationByCodeFormation(String code);

}

package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.Entities.ElementConstitutif;
import com.projetAgile.ubo.Entities.ElementConstitutifPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementConstitutifRepository extends JpaRepository<ElementConstitutif, ElementConstitutifPK> {
}

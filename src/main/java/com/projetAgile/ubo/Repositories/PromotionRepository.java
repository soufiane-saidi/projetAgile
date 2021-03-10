package com.projetAgile.ubo.Repositories;

import com.projetAgile.ubo.Entities.Promotion;
import com.projetAgile.ubo.Entities.PromotionPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, PromotionPK> {
}

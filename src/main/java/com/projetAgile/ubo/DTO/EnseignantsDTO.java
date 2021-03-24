package com.projetAgile.ubo.DTO;

import com.projetAgile.ubo.Entities.UniteEnseignement;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class EnseignantsDTO {
    private long id;
    private String nom;
    private String prenom;
    private BigDecimal nombreHeuresTD;
}

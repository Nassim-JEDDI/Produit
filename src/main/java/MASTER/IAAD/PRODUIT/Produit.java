package MASTER.IAAD.PRODUIT;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
    private double prixUnitaireHt;
    private double prixUnitaireTtc;
    private String descruption;
    @Transient
    private Rubrique rubrique;
    private  Long rubriqueID;
}


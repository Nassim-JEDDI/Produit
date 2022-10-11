package MASTER.IAAD.PRODUIT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {

}

package MASTER.IAAD.PRODUIT;

import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitRestController {
    private ProduitRepository produitRepository;
    private RubriqueRestClient rubriqueRestClient;

    public ProduitRestController(ProduitRepository produitRepository, RubriqueRestClient rubriqueRestClient) {
        this.produitRepository = produitRepository;
        this.rubriqueRestClient = rubriqueRestClient;
    }
    @GetMapping(path = "/produits/{id}")
    public Produit getProduit(@PathVariable Long id){
        Produit produit=produitRepository.findById(id).get();
        Rubrique rubrique=rubriqueRestClient.getRubriqueById(produit.getRubriqueID());
        produit.setRubrique(rubrique);
        return produit;
    }


    @PostMapping(path ="/produits")
    public Produit save(@RequestBody Produit produit){
        return produitRepository.save(produit);

    }
    @PutMapping (path="/produits/{id}")
    public Produit update(@RequestBody Produit produit, @PathVariable Long id){
        produit.setId(id);
        return produitRepository.save(produit);
    }
    @DeleteMapping(path="/produit/{id}")
    public void delete(@PathVariable Long id){
        produitRepository.deleteById(id);
    }

}

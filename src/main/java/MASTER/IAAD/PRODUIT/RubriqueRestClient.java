package MASTER.IAAD.PRODUIT;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RUBRIQUE-SERVICE")
public interface RubriqueRestClient {
    @GetMapping(path="/rubriques/{id}")
    Rubrique getRubriqueById(@PathVariable(name="id") Long id);

}

package ousmane.alhassane.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ousmane.alhassane.entities.Produit;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    @RestResource(path="/byDesignation")
	List<Produit> findByDesignationContains(@Param("mc") String des);

    @RestResource(path="/byDesignationPage")
	Page<Produit> findByDesignationContains(@Param("mc") String des, Pageable pageable);

}

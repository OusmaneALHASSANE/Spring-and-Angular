package ousmane.alhassane.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1",types=Produit.class)
public interface ProduitProjection {
public double getPrix();
public String getDesignation();
}

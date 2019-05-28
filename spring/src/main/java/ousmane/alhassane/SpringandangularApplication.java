package ousmane.alhassane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import ousmane.alhassane.dao.ProduitRepository;
import ousmane.alhassane.entities.Produit;

@SpringBootApplication
public class SpringandangularApplication implements CommandLineRunner{
  @Autowired
	private ProduitRepository produitRepository;
  @Autowired
  private RepositoryRestConfiguration restConfiguration; 

  public static void main(String[] args) {
		SpringApplication.run(SpringandangularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 restConfiguration.exposeIdsFor(Produit.class);
		produitRepository.save(new Produit("MAC", 5000, 2));
		produitRepository.save(new Produit("HP", 9000, 7));
		produitRepository.save(new Produit("HP", 7000, 4));

		
		produitRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}

}

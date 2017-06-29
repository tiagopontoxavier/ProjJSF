package io.altar.jsfproject.Repository;

import io.altar.jsfproject.model.Product;
//import io.altar.jsfproject.repository.Named;
import io.altar.jsfproject.Repository.EntityRepository;
import javax.annotation.PostConstruct;
import javax.inject.Named;

@Named("productRepository")
public class ProductRepository extends EntityRepository<Product> {

	@PostConstruct
	public void init(){
		addToList(new Product());
	}

	public void alterElement(Integer id, String shelf, String name, Integer desconto, Integer iva, Double preco) {
		((Product) get(id)).setShelfLoc(shelf);
		((Product) get(id)).setName(name);		
		((Product) get(id)).setDesconto(desconto);
		((Product) get(id)).setIva(iva);
		((Product) get(id)).setPreco(preco);
	}
}

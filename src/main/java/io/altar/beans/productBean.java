package io.altar.beans;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.service.ProductService;

@Named("ProductBean")
@RequestScoped
public class productBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Product selectedProduct;
	
	public Product getSelectedProduct() {
		return selectedProduct;
	}
	
	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
	
	private Product newProduct = new Product();

	public Product getNewProduct() {
		return newProduct;
	}

	public void setNewProduct(Product newProduct) {
		this.newProduct = newProduct;
	}

	@Inject
	private ProductService productService;

	public List<Product> getProducts() {
		return productService.showEntities(productService.getProductRepository());
	}

	public String addProduct() {
		productService.addEntity(productService.getProductRepository(), newProduct);
		return null;
	}

	public String editProduct() {
		System.out.println(selectedProduct.toString());
		productService.editProduct(selectedProduct);
		return null;
	}

	public String deleteProduct() {
		productService.removeEntity(productService.getProductRepository(), selectedProduct);
		return null;
	}
}
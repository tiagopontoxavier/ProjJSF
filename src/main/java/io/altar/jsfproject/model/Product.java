package io.altar.jsfproject.model;

import io.altar.jsfproject.model.Entity;


public class Product extends Entity {
	
	private String ShelfLoc ="";
	private String Name = "";
	private Integer id;
	private Integer desconto;
	private Integer iva;
	private double preco;
	
	public Product () {}

	public String getShelfLoc() {
		return ShelfLoc;
	}

	public void setShelfLoc(String shelfLoc) {
		ShelfLoc = shelfLoc;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}

	public Integer getIva() {
		return iva;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString(){
		String shelfString = null;
		if(!(ShelfLoc.isEmpty())){
			shelfString = ShelfLoc.toString();
		}
		return String.format("| ID: %d | Nome: %s | Prateleiras: %s | Desconto: %d%% | IVA: %d%% | PVP: %.2f€ |\n", getId(), Name, shelfString, desconto, iva, preco);
	}

	
	
}


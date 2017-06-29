package io.altar.jsfproject.Repository;

import io.altar.jsfproject.Repository.EntityRepository;
import io.altar.jsfproject.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf> {
	public static final ShelfRepository Instance = new ShelfRepository();
	
	private  ShelfRepository(){}
	
	public static ShelfRepository getInstance(){
		
		return Instance;
	}		
}
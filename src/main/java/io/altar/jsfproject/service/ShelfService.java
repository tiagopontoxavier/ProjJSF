package io.altar.jsfproject.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jsfproject.model.Shelf;
import io.altar.jsfproject.Repository.ShelfRepository;

@Named("ShelfService")
@ApplicationScoped
public class ShelfService extends EntityService<Shelf>{
	@Inject
	private ShelfRepository shelfList;
	
	public ShelfRepository getShelfRepository(){
		return shelfList;
	}
}

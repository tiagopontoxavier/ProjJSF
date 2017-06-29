package io.altar.beans;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import io.altar.jsfproject.model.Shelf;
import io.altar.jsfproject.service.ShelfService;

@Named("ShelfBean")
@RequestScoped
public class shelfBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private Shelf selectedShelf;
	
	public Shelf getSelectedShelf() {
        return selectedShelf;
    }
 
    public void setSelectedShelf(Shelf selectedShelf) {
        this.selectedShelf = selectedShelf;
    }
	
	private Shelf newShelf = new Shelf();
	
	public Shelf getNewShelf() {
		return newShelf;
	}

	public void setNewShelf(Shelf newShelf) {
		this.newShelf = newShelf;
	}

	@Inject
	private ShelfService shelfService;
     
    public List<Shelf> getShelves() {
        return shelfService.showEntities(shelfService.getShelfRepository());
    }
    
    public String addShelf(){
    	shelfService.addEntity(shelfService.getShelfRepository(), newShelf);
    	return null;
    }
    
//    public String editShelf(){
//		System.out.println(selectedShelf.toString());
//		shelfService.editShelf(selectedShelf);
//    	return null;
//    }
    
    public String deleteShelf(){
    	shelfService.removeEntity(shelfService.getShelfRepository(), selectedShelf);
    	return null;
    }
}
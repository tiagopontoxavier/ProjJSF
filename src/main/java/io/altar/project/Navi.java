package io.altar.project;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

	@Named("navi")
	@RequestScoped
	
	public class Navi {
	    private String name;
	    private boolean disabled;
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean isDisabled() {
			return disabled;
		}
		public void setDisabled(boolean disabled) {
			this.disabled = disabled;
		}
	      
	

}

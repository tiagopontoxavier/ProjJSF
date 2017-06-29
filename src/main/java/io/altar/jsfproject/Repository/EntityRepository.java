package io.altar.jsfproject.Repository;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import io.altar.jsfproject.model.Entity;

public abstract class EntityRepository <E extends Entity>{
		
		private Integer id = 0;
		private LinkedHashMap<Integer,E> entityList = new LinkedHashMap<>();
		
		public Integer getNextId(){
			return ++id;
		}
		
		public void addToList(E entity){
			entity.setId(getNextId());
			entityList.put(entity.getId(),entity);
		 }
		
		public void remove(Integer id){
			entityList.remove(id);
		}
		
		public void alterElment(){}
		
		public Entity get(Integer id){
			return entityList.get(id);
		}
		
		public boolean isEmpty(){
			return entityList.isEmpty();
		}
		
		public Set<Integer> keySet(){
			return entityList.keySet();
		}
		
		public Collection<E> values(){
			return entityList.values();
		}
		
		public boolean containsKey(Integer key){
			return entityList.containsKey(key);
		}
		
		public void displayElement(Integer key){
			System.out.println(entityList.get(key).toString());
		}
		
		public String getList(String listType){
			String text = String.format("Lista de %s:\n", listType);
			if (!entityList.isEmpty()) {
				for (Integer ID : entityList.keySet()) {
					text += entityList.get(ID).toString();
				}
			} else {
				text += "Vazia!\n";
			}
			return text;
		}
}
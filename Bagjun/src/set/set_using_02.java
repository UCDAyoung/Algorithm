package set;

import java.util.HashSet;

class Animal {
	String species;
	String habitat;
	
	Animal(String species, String habitat){
		this.species = species;
		this.habitat = habitat;
	}
	
	public int hashCode() {
		return (species + habitat).hashCode();  //??
	}
	public boolean equals(Object obj) {
		if(obj instanceof Animal) { 
			Animal temp = (Animal)obj;
			return species.equals(temp.species) && habitat.equals(temp.habitat);
		}else {
			return false;
		}
	}
}

public class set_using_02 {
	public static void main(String[] args) {
		HashSet<Animal> hs = new HashSet<Animal>();
		
		//계속 저장하지만 , 집합은 한 번만 저장이됨 . 
		hs.add(new Animal("고양이","육지"));
		hs.add(new Animal("고양이","육지"));
		System.out.println(hs.add(new Animal("고양이","육지")));
		
		System.out.println(hs.size());
		
		
	}
	
	
}

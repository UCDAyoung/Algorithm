package 아무거나;

import java.util.*;

public class 합집합 {

	public static void main(String[] args) {
		Object[] objA = {1,3,5,7,9};
		Object[] objB = {2,4,6,8,9};
		
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		
		for(int i=0 ;i<objA.length;i++) {
			setA.add(objA[i]);
		}
		for(int i=0 ;i<objA.length;i++) {
			setA.add(objB[i]);
		}
		
		Iterator it = setA.iterator();
		//교집합
		HashSet setKyo = new HashSet();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setB.contains(tmp))
				setKyo.add(tmp);
		}
		
		
		//합집합
		it = setA.iterator();
		HashSet setHab = new HashSet();
		while(it.hasNext()) {
			Object tmp = it.next();
			setHab.add(tmp);
		}
		it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			setHab.add(tmp);
		}
		
		//차집합 A-B  
		HashSet setCha = new HashSet();
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
	}

}

/*
 * https://github.com/ksh901016/thinkDataStructure/blob/master/src/main/java/thinkDataStructures/map/MyLinearMap.java
 * 따라 제작 
 */

package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class map_byArrayList<K,V> implements Map<K,V> {

		private List<Entry> entries = new ArrayList<>();
		
		public class Entry implements Map.Entry<K,V>{
			private K key;
			private V value;
			
			public Entry(K key, V value) {
				this.key = key;
				this.value = value;
			}

			@Override
			public K getKey() {
				return this.key;
			}

			@Override
			public V getValue() {
				return this.value;
			}

			@Override
			public V setValue(V value) {
				this.value = value;
				return null;
			}
		}


	@Override
	public int size() {
		return entries.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object target) {
		return findEntry(target) != null;
	}

	private Entry findEntry(Object target) {
		for(Entry entry : entries) {
			if(equals(target,entry.getKey())) {
				return entry;
			}
		}
		return null;
	}

	@Override
	public boolean containsValue(Object target) {
		for(Map.Entry<K, V> entry : entries) {
			if(equals(target, entry.getValue()))
					return true;
		}
		return false;
	}
	
	private boolean equasl(Object target, Object obj) {
			if(target == null) {
				return obj == null;
			}
			return target.equals(obj);
	}

	@Override
	public V get(Object key) {
			Entry entry = findEntry(key);
			if(entry == null) {
					return null;
			}
			return null;
	}
	

	@Override
	public V put(K key, V value) {
			Entry entry = findEntry(key);
			if(entry ==null) {
					entries.add(new Entry(key,value));
					return null;
			}else {
					V oldValue = entry.value;
					entry.setValue(value);
					return oldValue;
			}
			
	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
			entries.clear();
		
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}

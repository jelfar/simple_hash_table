import java.util.*;

public class HashTableSC<T> {
	
	private LinkedList[] table;
	
	public HashTableSC(int size){
		
		table = (LinkedList<T>[])(new LinkedList[size]);
		for(int i = 0; i < size; i++){
			table[i] = new LinkedList<T>();
		}
	}
	
	private int hash(T key){
		return ((Math.abs(key.hashCode()))%table.length);
	}
	
	public void insert(T item){
		int h = hash(item);
		table[h].addFirst(item);
	}
	
	public void delete(T item){
		int h = hash(item);
		if(table[h].contains(item))
			table[h].remove(item);
	}
	
	public boolean find(T item){
		int h = hash(item);
		return (table[h].contains(item));
	}
	
	public boolean isEmpty(){
		for(int i = 0; i < table.length; i++){
			if(table[i].size() > 0) return false;
		}
		return true;
	}
	
	public void print(){
		System.out.println();
		for(int i = 0; i < table.length; i++){
			System.out.print(i + ": ");
			for(int j = 0; j < table[i].size(); j++){
				System.out.print(table[i].get(j) + " ");
			}
			System.out.println();
		}
	}
}

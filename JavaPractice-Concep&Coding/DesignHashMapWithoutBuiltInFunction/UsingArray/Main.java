package UsingArray;

import java.util.Arrays;
import java.util.Map.Entry;

class MyHashMap{
	int[] map;
	MyHashMap(){
		map=new int[10001];
		Arrays.fill(map, -1);
	}
	
	void put(int key,int value) {
		map[key]=value;
	}
	
	int get(int key) {
		return map[key];
	}
	
	void remove(int key) {
		map[key]=-1;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 1);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));

	}

}

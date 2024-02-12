package UsingLinkedList;


@SuppressWarnings("hiding")
class MyHashMap<String,Integer>{
	
	Entry<String,Integer>[] table;
	
	@SuppressWarnings("unchecked")
	public MyHashMap() {
		table=new Entry[16];
	}
	
	class Entry<String,Integer>{
		String key;
		Integer value;
		Entry<String,Integer> next;
		
		Entry(String key,Integer value){
			this.key=key;
			this.value=value;
		}
		
	}

	public void put(String key, int value) {
		if(key==null)
			return;
		
		int index=getIndex(key);
		Entry<String,Integer> entry=new Entry(key,value);
		
		if(table[index]==null) {
			table[index]=entry;
		}else {
			Entry<String,Integer> prev=null;
			Entry<String,Integer> current=table[index];
			while(current!=null) {
				if(current.key.equals(key)) {
					current.value=entry.value;
					return;
				}
				prev=current;
				current=prev.next;
			}
			prev.next=entry;
		}
	}

	private int getIndex(String key) {
		return Math.abs(key.hashCode())% table.length;
		
	}

	public Integer get(String key) {
		if(key==null)
			return null;
		
		int index=getIndex(key);
		if(table[index]==null) {
			return null;
		}else {
			Entry<String,Integer> current=table[index];
			while(current!=null) {
				if(current.key.equals(key)) {
					return current.value;
				}
				current=current.next;
			}
		}
		return null;
	}

	public void remove(String key) {
		if(key==null)
			return ;
		
		int index=getIndex(key);
		if(table[index]==null) {
			return;
		}else {
			Entry<String,Integer> current=table[index];
			if(current.key.equals(key)) {
				current.value=null;
			}
			
		}
		
	}
	
}

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		MyHashMap hashMap=new MyHashMap();
		 hashMap.put("1", 1);
	        hashMap.put("2", 2);
	        System.out.println(hashMap.get("1"));
	        System.out.println(hashMap.get("3"));
	        hashMap.put("3", 1);
	        System.out.println(hashMap.get("2"));
	        hashMap.remove("2");
	        System.out.println(hashMap.get("2"));
		//System.out.println(map.get("1"));
	}

}

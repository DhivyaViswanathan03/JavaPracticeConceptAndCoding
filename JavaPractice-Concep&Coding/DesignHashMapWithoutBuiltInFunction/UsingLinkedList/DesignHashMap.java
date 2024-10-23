package UsingLinkedList;
class MyHashMapDesign{
	Entry<String,Integer>[] table;
	
	MyHashMapDesign(){
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
	
	public void put(String key,Integer value) {
		if(key==null) {
			return;
		}
		int index=getIndex(key);
		Entry<String,Integer> entry=new Entry(key, value);
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
	
	public Integer get(String key) {
		if(key==null) {
			return null;
		}
		int index=getIndex(key);
		if(table[index]==null) {
			return null;
		}
		else {
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
		if(key==null) {
			return;
		}
		int index=getIndex(key);
		if(table[index]==null) {
			return;
		}else {
			Entry<String,Integer> current=table[index];
			Entry<String,Integer> prev=null;
			while(current!=null) {
				if(current.key.equals(key)) {
					if(prev==null) {
						table[index]=current.next;
					}else {
						prev.next=null;
					}
					return;
					
				}
				prev=current;
				current=prev.next;
			}
			
		}
	}

	private int getIndex(String key) {
		return Math.abs(key.hashCode())%table.length;
	}
}



public class DesignHashMap {

	public static void main(String args[]) {
		MyHashMapDesign hashMap=new MyHashMapDesign();
		    hashMap.put("1", 1);
	        hashMap.put("2", 2);
	        System.out.println(hashMap.get("1"));
	        System.out.println(hashMap.get("3"));
	        hashMap.put("3", 1);
	        System.out.println(hashMap.get("3"));
	        hashMap.remove("2");
	        System.out.println(hashMap.get("2"));
	        hashMap.remove("1");
	        System.out.println(hashMap.get("2"));
	        hashMap.put("3", 2);
	        System.out.println(hashMap.get("3"));
	        hashMap.put("3", 21);
	        System.out.println(hashMap.get("3"));
	}

}

package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Map
//		Map<String, String> map = new HashMap();
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap();
//		map.put("a", "divs");
//		map.put("b", "priya");
//		map.put("c", "reka");
//
//		Set<Map.Entry<String, String>> entrySet = map.entrySet();
//		for (Map.Entry<String, String> entry : entrySet) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//			map.put("d", "mouli");
//		}
		
		//Set
		
//		KeySetView<Object, Boolean> set = map.newKeySet();
//		set.add("demo");
//		set.add("review");
//		
//		Iterator itr=set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			set.add("hello");
//		}
		
		//list
		List<String> list=new CopyOnWriteArrayList<String>();
		list.add("divs");
		list.add("demo");
		 
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			list.add("mouli");
		}

	}

}

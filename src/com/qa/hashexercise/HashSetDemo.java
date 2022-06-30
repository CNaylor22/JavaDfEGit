package com.qa.hashexercise;
import java.util.HashSet;
public class HashSetDemo {

	
	
//	Key/Value pairs
//	We don't choose the key
//	The key is a hash code of the value
//	So you can't have duplicate objects
//  Order not preserved so use ArrayList instead if you want order to list	
	
	HashSet<String> myHashSet = new HashSet<>();
	
	public void hashSetDemoMethod() {
	
	myHashSet.add("Anoush");
	myHashSet.add("Claire");
	myHashSet.add("Charles");
	
//	If you try and add a duplicate. it will override the previous "Anoush" String in set
	myHashSet.add("Anoush");
	
	
	
//	Size of set = myHashSet.size();
//	Remove from set = myHashSet.remove("Anoush");
//	check if set is empty or not = myHashSet.isEmpty
//	check if set contains an object myHashSet.contains("Claire");
//	hashcodes "Charles.hashcode"

	}
	}

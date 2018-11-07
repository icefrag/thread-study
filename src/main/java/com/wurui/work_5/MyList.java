package com.wurui.work_5;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List<String> myList = new ArrayList<>();
	
	public void add(){
		myList.add("小白");
	}
	
	public int getSize(){
		return myList.size();
	}
}

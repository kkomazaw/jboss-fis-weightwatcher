package com.mycompany.fxtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BeanCreator {
		
	public BatchSession createSessionContent(Prices prices){
		BatchSession bss = new BatchSession();
		
		InsertElement insertElement = new InsertElement();				
		insertElement.setPrices(prices);
		
		bss.setInsertElement(insertElement);
		bss.setFireallrules(new FireAllRules());
		bss.setQuery(new Query());
		return bss;
	}
	
	
}

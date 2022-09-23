package com.stackroute.exercises;


import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {

	List<String> strlst;
    //write here logic to get sorted Array List which is a global class variable
    public String catalogListSorter(List<String> unSortedCatalogList) {
    	if(unSortedCatalogList.isEmpty() ) {
    		return "The catalog list is empty";
    	}
    	else if( unSortedCatalogList==null) {
    		return "The catalog list is null";
    	}else {
    		Collections.sort(unSortedCatalogList);
    		this.strlst = unSortedCatalogList;
    		return strlst.toString();
    	}
        
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {
    	if(value.isBlank()) {
    		return "Input is not accepted";
    	}
    	for(String s : strlst) {
    		if(s.equals(value)) {
    			return "Found: "+value;
    		}else if(s.isBlank() || s.equals(" ")) {
    			return "The catalog List contains empty or null or blank space as a value";
    		}
    	}
        return "Not Found";
    }
}


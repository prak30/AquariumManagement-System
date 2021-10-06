package com.aquariummanagementsystem;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class FishStore {
	// private ArrayList<Object> fishList = new ArrayList();
	//private HashSet<Fish> fishList = new HashSet();
	private Set<Fish> fishList = new HashSet<>();

	public Set<Fish> getFishList() {
		return fishList;
	}

	void add(Fish fish) {
		fishList.add(fish);
	}

//	public void add(String abc) {
//		fishList.add(abc);
//	}

	public void remove(Fish fish) {
		fishList.remove(fish);
	}
}

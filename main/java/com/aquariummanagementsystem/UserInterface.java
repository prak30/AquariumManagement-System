package com.aquariummanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class UserInterface {
	void print(Set<Fish> fishList) {
//		for(int i = 0; i < fishList.size(); i++)
//		{
//			System.out.println(fishList.get(i));
//		}	
		for (Fish s : fishList) {
			System.out.println((s));
		}
	}
}

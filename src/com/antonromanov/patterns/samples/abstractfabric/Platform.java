package com.antonromanov.patterns.samples.abstractfabric;

import java.util.Random;

public class Platform {

	private String pltf;
	
	public  String currentPlatform() {
		int rn = rnd(); 
		
		if (rn==1) { 
		
		pltf = "MACOSX";
		} else {
			
			pltf = "WIN";
			
		}
		return pltf;
	}
	
	
private  static int rnd() {
	Random rand = new Random();
	int randomNum = rand.nextInt((2 - 1) + 1) + 1;
	//	pltf = "MACOSX";
		return randomNum;
	}
	
}

package com.antonromanov.patterns.samples.abstractfabric;

public class MSWindow implements Window{
	
	public void setTitle(String text){
		System.out.println("Win");
	  }
	  public void repaint(){
	    //MS Windows specific behaviour
	  }	

}

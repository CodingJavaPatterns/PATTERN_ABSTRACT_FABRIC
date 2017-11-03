package com.antonromanov.patterns.samples.abstractfabric;

public class MacOSXWindow implements Window{

	@Override
	public void setTitle(String text) {
		System.out.println("OS X");
		
	}

	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		
	}

}

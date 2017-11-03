package com.antonromanov.patterns.samples.abstractfabric;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {

	 //create a MacOSXWindow
	  public Window createWindow(){
	    MacOSXWindow window = new MacOSXWindow();
	    return window;
	  }
	
	
}

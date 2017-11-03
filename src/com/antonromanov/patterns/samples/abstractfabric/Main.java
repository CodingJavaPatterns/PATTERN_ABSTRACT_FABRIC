package com.antonromanov.patterns.samples.abstractfabric;

public class Main {

	public static void main(String[] args) {
		GUIBuilder builder = new GUIBuilder();
		Platform p = new Platform();
		
	    AbstractWidgetFactory widgetFactory = null;
	    //check what platform we're on
	    if(p.currentPlatform()=="MACOSX"){
	      widgetFactory  =  new MacOSXWidgetFactory();
	    } else {
	      widgetFactory  =  new MsWindowsWidgetFactory();
	    }
	    builder.buildWindow(widgetFactory);

	}

}

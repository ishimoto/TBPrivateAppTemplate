// Generated by the TBLips Templateengine Plug-in at Jan 23, 2020 8:45:17 PM
package com.your.app;

import org.treasureboat.webcore.appserver.TBDirectAction;
import org.treasureboat.webcore.appserver.TBRequest;
import org.treasureboat.webcore.appserver.iface.ITBWActionResults;

import com.your.app.components.Main;

public class DirectAction extends TBDirectAction {
	
	public DirectAction(TBRequest request) {
		super(request);
	}

	public ITBWActionResults defaultAction() {
		return pageWithName(Main.class.getName());
	}
}
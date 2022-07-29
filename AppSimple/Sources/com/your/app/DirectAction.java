package com.your.app;

import org.treasureboat.webcore.annotations.TBAction;
import org.treasureboat.webcore.appserver.TBDirectAction;
import org.treasureboat.webcore.appserver.TBRequest;
import org.treasureboat.webcore.appserver.iface.ITBWActionResults;

import com.your.app.components.Main;

public class DirectAction extends TBDirectAction {

	public DirectAction(TBRequest request) {
		super(request);
	}

	@TBAction
	public ITBWActionResults standard() {
		return pageWithName(Main.class.getName());
	}
}

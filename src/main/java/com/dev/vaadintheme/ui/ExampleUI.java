package com.dev.vaadintheme.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;

@Theme("th")
@SpringUI
@SpringViewDisplay
public class ExampleUI extends UI implements ViewDisplay {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void showView(View view) {
		// TODO Auto-generated method stub
		this.setContent((Component) view);
	}

	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub

	}

}

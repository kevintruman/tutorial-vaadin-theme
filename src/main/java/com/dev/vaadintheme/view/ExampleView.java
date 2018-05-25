package com.dev.vaadintheme.view;

import javax.annotation.PostConstruct;

import com.dev.vaadintheme.design.ExampleDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = "")
public class ExampleView extends ExampleDesign implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	void init() {
		setListener();
	}

	@Override
	public void enter(ViewChangeEvent event) {

	}

	void setListener() {
		bt.addStyleName("cblack");
		bt.addClickListener(e -> {
			lb.setValue("Hello World");
		});
	}

}

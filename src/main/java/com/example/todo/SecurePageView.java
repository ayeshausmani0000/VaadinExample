package com.example.todo;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class SecurePageView extends VerticalLayout implements View {
	private Navigator navigator;
	public static final String NAME = "secure";
	private Button button;

	@Override
	public void enter(ViewChangeEvent event) {
		button = new Button("Secure Page");
		Label textField = new Label(VaadinSession.getCurrent()
				.getAttribute("user").toString());
		button.addClickListener(e -> {
			UI.getCurrent().getNavigator().navigateTo("login");
		});

		addComponents(button, textField);

	}
}

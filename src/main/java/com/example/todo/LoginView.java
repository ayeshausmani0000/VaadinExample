package com.example.todo;

import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class LoginView extends VerticalLayout implements View {

	public static final String NAME = "login";
	private TextField user;
	private PasswordField password;
	private Button loginButton;
	private Navigator navigator;

	public LoginView() {

		user = new TextField("User: ");
		password = new PasswordField("Password: ");
		loginButton = new Button("login");
		System.out.println("Hemlata");
		VerticalLayout fields = new VerticalLayout(user, password, loginButton);
		loginButton.addClickListener(event -> {
			VaadinSession.getCurrent().setAttribute("user", user.getValue());

			UI.getCurrent().getNavigator().navigateTo(SecurePageView.NAME);
		});

		addComponent(fields);
		/*
		 * getUI().getNavigator().addView(SecurePageView.NAME,
		 * SecurePageView.class);
		 */
	}

	@Override
	public void enter(ViewChangeEvent event) {
		user.focus();
	}

}

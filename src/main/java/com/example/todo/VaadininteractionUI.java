package com.example.todo;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class VaadininteractionUI extends UI {

	public static final String NAME = "Main";

	@Override
	protected void init(VaadinRequest request) {

		new Navigator(this, this);
		getNavigator().addView(LoginView.NAME, LoginView.class);
		getNavigator().addView(SecurePageView.NAME, SecurePageView.class);
		getNavigator().navigateTo(LoginView.NAME);

	}
}
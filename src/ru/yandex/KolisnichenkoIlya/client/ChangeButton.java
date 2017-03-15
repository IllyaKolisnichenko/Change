package ru.yandex.KolisnichenkoIlya.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ChangeButton implements EntryPoint {

	private VerticalPanel mainPanel = new VerticalPanel();
	private Button change=new Button("Change");
	private String[] color = new String[]{"red","black","green",
										  "blue","gray","magenta",
										  "orange","white","yellow"};
	@Override
	public void onModuleLoad() {
		mainPanel.add(change);
		RootPanel.get("mainContainer").add(mainPanel);
		change.addClickHandler(new ClickHandler() {
		
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.getBodyElement().getStyle().setBackgroundColor(color[(int)(Math.random()*color.length)]);	
			}
		});
	}
}
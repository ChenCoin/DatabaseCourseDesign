/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 *
 * @author coin
 */
public class TitlepageSet {

    Parent parent;

    public TitlepageSet(Parent parent) {
	this.parent = parent;
    }

    private int i;

    public void init() {
	Label gradePage = (Label) parent.lookup("#gradepage");
	Label studentPage = (Label) parent.lookup("#studentpage");
	Label teacherPage = (Label) parent.lookup("#teacherpage");
	Label coursePage = (Label) parent.lookup("#coursepage");
	Label infoPage = (Label) parent.lookup("#infopage");

	HBox morePage = (HBox) parent.lookup("#morepage");
	AnchorPane tablePage = (AnchorPane) parent.lookup("#tablepage");

	Label[] page = {gradePage, studentPage, teacherPage, coursePage, infoPage};

	gradePage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    for (Label label : page) {
		label.setFont(new Font(13));
	    }
	    gradePage.setFont(new Font(17));
	    morePage.setVisible(false);
	    tablePage.setVisible(true);
	});

	studentPage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    for (Label label : page) {
		label.setFont(new Font(13));
	    }
	    studentPage.setFont(new Font(17));
	    morePage.setVisible(false);
	    tablePage.setVisible(true);
	});

	teacherPage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    for (Label label : page) {
		label.setFont(new Font(13));
	    }
	    teacherPage.setFont(new Font(17));
	    morePage.setVisible(false);
	    tablePage.setVisible(true);
	});

	coursePage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    for (Label label : page) {
		label.setFont(new Font(13));
	    }
	    coursePage.setFont(new Font(17));
	    morePage.setVisible(false);
	    tablePage.setVisible(true);
	});

	infoPage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    for (Label label : page) {
		label.setFont(new Font(13));
	    }
	    infoPage.setFont(new Font(17));
	    morePage.setVisible(true);
	    tablePage.setVisible(false);
	});

    }

}

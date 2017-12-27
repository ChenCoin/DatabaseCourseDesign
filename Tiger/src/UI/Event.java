/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DB.DB;
import DB.DBresult;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import tiger.config;

/**
 *
 * @author coin
 */
public class Event {

    Parent parent;
    DBresult ret;

    public Event(Parent parent) {
	this.parent = parent;
    }

    public void init() {
	Button searchBtn = (Button) parent.lookup("#searchbtn");
	Button addBtn = (Button) parent.lookup("#addbtn");
	Button motifyBtn = (Button) parent.lookup("#motifybtn");
	Button deleteBtn = (Button) parent.lookup("#deletebtn");

	searchBtn.setOnAction((ActionEvent e) -> {
	    switch (config.pageState) {
		case grade:
		    Platform.runLater(new Runnable() {
			@Override
			public void run() {
			    ret = DB.query("select * from GradeInfo;");
			    System.out.println(ret.msg + ret.state);
			}
		    });
		    break;
		case student:
		    break;
		case teacher:
		    break;
		case course:
		    break;
		case info:
		    break;
		default:
		    break;
	    }
	});

	addBtn.setOnAction((ActionEvent e) -> {
	    switch (config.pageState) {
		case grade:
		    break;
		case student:
		    break;
		case teacher:
		    break;
		case course:
		    break;
		case info:
		    break;
		default:
		    break;
	    }
	});

	motifyBtn.setOnAction((ActionEvent e) -> {
	    switch (config.pageState) {
		case grade:
		    break;
		case student:
		    break;
		case teacher:
		    break;
		case course:
		    break;
		case info:
		    break;
		default:
		    break;
	    }
	});

	deleteBtn.setOnAction((ActionEvent e) -> {
	    switch (config.pageState) {
		case grade:
		    break;
		case student:
		    break;
		case teacher:
		    break;
		case course:
		    break;
		case info:
		    break;
		default:
		    break;
	    }
	});

    }

}

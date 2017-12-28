/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DB.DBresult;
import Do.Do;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import tiger.Context;
import tiger.config;

/**
 *
 * @author coin
 */
public class Event {

    Parent parent;
    Context context;
    DBresult ret;
    Do todo;

    public Event(Parent parent, Do todo, Context context) {
	this.parent = parent;
	this.context = context;
	this.todo = todo;
    }

    public void init() {
	Button searchBtn = (Button) parent.lookup("#searchbtn");
	Button addBtn = (Button) parent.lookup("#addbtn");
	Button motifyBtn = (Button) parent.lookup("#motifybtn");
	Button deleteBtn = (Button) parent.lookup("#deletebtn");

	searchBtn.setOnAction((ActionEvent e) -> {
	    Platform.runLater(new Runnable() {
		@Override
		public void run() {
		    todo.search();
		}
	    });
	});

	addBtn.setOnAction((ActionEvent e) -> {
	    Platform.runLater(new Runnable() {
		@Override
		public void run() {
		    todo.add();
		}
	    });
	});

	motifyBtn.setOnAction((ActionEvent e) -> {
	    Platform.runLater(new Runnable() {
		@Override
		public void run() {
		    todo.motify();
		}
	    });
	});

	deleteBtn.setOnAction((ActionEvent e) -> {
	    Platform.runLater(new Runnable() {
		@Override
		public void run() {
		    todo.delete();
		}
	    });
	});

    }

}

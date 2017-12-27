/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.collections.FXCollections;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Separator;

/**
 *
 * @author coin
 */
public class ChoiceboxSet {

    Parent parent;

    public ChoiceboxSet(Parent parent) {
	this.parent = parent;
    }

    public void init() {
	ChoiceBox term = (ChoiceBox) parent.lookup("#term");
	ChoiceBox condition = (ChoiceBox) parent.lookup("#condition");

	term.setItems(FXCollections.observableArrayList(
		"全部", "2017上", "2017下")
	);
	term.getSelectionModel().select(0);
	term.getSelectionModel().selectedIndexProperty().addListener((ov, oldv, newv) -> {

	    //label.setText(greeting[newv.intValue()]);  
	});

	condition.setItems(FXCollections.observableArrayList(
		"全部", "姓名", "学号", "科目", "教师", "分数")
	);
	condition.getSelectionModel().select(0);
	condition.getSelectionModel().selectedIndexProperty().addListener((ov, oldv, newv) -> {

	    //label.setText(greeting[newv.intValue()]);  
	});

    }

}

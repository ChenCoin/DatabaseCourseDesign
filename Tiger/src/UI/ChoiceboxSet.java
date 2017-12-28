/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import tiger.Context;

/**
 *
 * @author coin
 */
public class ChoiceboxSet {

    Parent parent;
    Context context;

    public ChoiceboxSet(Parent parent, Context context) {
	this.parent = parent;
	this.context = context;
    }

    public void init() {
	ChoiceBox term = (ChoiceBox) parent.lookup("#term");
	ChoiceBox condition = (ChoiceBox) parent.lookup("#condition");

	term.getSelectionModel().selectedIndexProperty().addListener((ov, oldv, newv) -> {
	    context.termCBox = newv.intValue();
	});

	condition.getSelectionModel().selectedIndexProperty().addListener((ov, oldv, newv) -> {
	    context.conditionCBox = newv.intValue();
	});

    }

}

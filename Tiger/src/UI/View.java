/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.scene.Parent;

/**
 *
 * @author Cano
 */
public class View {

    Parent parent;

    public View(Parent parent) {
	this.parent = parent;
    }

    public void init() {

	ChoiceboxSet choiceboxSet = new ChoiceboxSet(parent);
	choiceboxSet.init();
	
	TitlepageSet titlepageSet = new TitlepageSet(parent);
	titlepageSet.init();
	
	TableSet tableSet = new TableSet(parent);
	tableSet.init();
	
	Page page = new Page(parent);
	page.init();
	
	Event event = new Event(parent);
	event.init();

    }

}

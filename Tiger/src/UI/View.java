/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Do.Do;
import Do.GradeDo;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import tiger.Context;

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
	Context context = new Context();
	Do todo = new GradeDo();

	ChoiceboxSet choiceboxSet = new ChoiceboxSet(parent, context);
	choiceboxSet.init();

	Page page = new Page(parent, todo, context);
	page.init();
	page.gradepageInit();

	Event event = new Event(parent, todo, context);
	event.init();

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiger;

import Do.Do;
import Do.GradeDo;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author coin
 */
public class Context {

    Parent parent;
    
    public int termCBox = 0;
    public int conditionCBox = 0;
    public String[] termItem;
    
    public Do todo = new GradeDo(this);

    public Context(Parent parent) {
	this.parent = parent;
	init();
    }

    public ChoiceBox term;
    public ChoiceBox condition;
    public Label termTxt;

    public Label gradePage;
    public Label studentPage;
    public Label teacherPage;
    public Label coursePage;
    public Label infoPage;

    public HBox morePage;
    public AnchorPane tablePage;

    public HBox alert;
    public Label alertTitle;
    public Label alertContent;
    public Button alertCancel;
    public Button alertConfirm;

    public Button searchBtn;
    public Button addBtn;
    public Button motifyBtn;
    public Button deleteBtn;

    private void init() {
	term = (ChoiceBox) parent.lookup("#term");
	condition = (ChoiceBox) parent.lookup("#condition");
	termTxt = (Label) parent.lookup("#termtxt");

	gradePage = (Label) parent.lookup("#gradepage");
	studentPage = (Label) parent.lookup("#studentpage");
	teacherPage = (Label) parent.lookup("#teacherpage");
	coursePage = (Label) parent.lookup("#coursepage");
	infoPage = (Label) parent.lookup("#infopage");

	morePage = (HBox) parent.lookup("#morepage");
	tablePage = (AnchorPane) parent.lookup("#tablepage");

	alert = (HBox) parent.lookup("#alert");
	alertTitle = (Label) parent.lookup("#alerttitle");
	alertContent = (Label) parent.lookup("#alertcontent");
	alertCancel = (Button) parent.lookup("#alertcancel");
	alertConfirm = (Button) parent.lookup("#alertconfirm");

	searchBtn = (Button) parent.lookup("#searchbtn");
	addBtn = (Button) parent.lookup("#addbtn");
	motifyBtn = (Button) parent.lookup("#motifybtn");
	deleteBtn = (Button) parent.lookup("#deletebtn");
    }

}

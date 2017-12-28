/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DB.DB;
import DB.DBresult;
import Do.CourseDo;
import Do.GradeDo;
import Do.StudentDo;
import Do.TeacherDo;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import tiger.Context;

/**
 *
 * @author coin
 */
public class Page {

    private final Context context;

    public Page(Context context) {
	this.context = context;
	init();
    }

    private void init() {

	Label gradePage = context.gradePage;
	Label studentPage = context.studentPage;
	Label teacherPage = context.teacherPage;
	Label coursePage = context.coursePage;
	Label infoPage = context.infoPage;
	Label[] page = {gradePage, studentPage, teacherPage, coursePage, infoPage};

	HBox morePage = context.morePage;
	AnchorPane tablePage = context.tablePage;

	Label termTxt = context.termTxt;
	ChoiceBox term = context.term;
	ChoiceBox condition = context.condition;

	gradePage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    gradepageInit();
	});

	studentPage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    for (Label label : page) {
		label.setFont(new Font(13));
	    }
	    studentPage.setFont(new Font(17));

	    morePage.setVisible(false);
	    tablePage.setVisible(true);

	    termTxt.setVisible(false);
	    term.setVisible(false);
	    termTxt.setPrefWidth(0);
	    term.setPrefWidth(0);

	    context.todo = new StudentDo(context);
	});

	teacherPage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    for (Label label : page) {
		label.setFont(new Font(13));
	    }
	    teacherPage.setFont(new Font(17));

	    morePage.setVisible(false);
	    tablePage.setVisible(true);

	    termTxt.setVisible(false);
	    term.setVisible(false);
	    termTxt.setPrefWidth(0);
	    term.setPrefWidth(0);

	    context.todo = new TeacherDo(context);
	});

	coursePage.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
	    for (Label label : page) {
		label.setFont(new Font(13));
	    }
	    coursePage.setFont(new Font(17));

	    morePage.setVisible(false);
	    tablePage.setVisible(true);

	    termTxt.setVisible(true);
	    term.setVisible(true);
	    termTxt.setPrefWidth(45);
	    term.setPrefWidth(72);

	    context.todo = new CourseDo(context);
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

    public void gradepageInit() {
	Label gradePage = context.gradePage;
	Label studentPage = context.studentPage;
	Label teacherPage = context.teacherPage;
	Label coursePage = context.coursePage;
	Label infoPage = context.infoPage;
	Label[] page = {gradePage, studentPage, teacherPage, coursePage, infoPage};

	HBox morePage = context.morePage;
	AnchorPane tablePage = context.tablePage;

	Label termTxt = context.termTxt;
	ChoiceBox term = context.term;
	ChoiceBox condition = context.condition;

	for (Label label : page) {
	    label.setFont(new Font(13));
	}
	gradePage.setFont(new Font(17));

	morePage.setVisible(false);
	tablePage.setVisible(true);

	termTxt.setVisible(true);
	term.setVisible(true);
	termTxt.setPrefWidth(45);
	term.setPrefWidth(72);

	context.todo = new GradeDo(context);

	HBox alert = context.alert;
	Label alertTitle = context.alertTitle;
	Label alertContent = context.alertContent;
	Button alertCancel = context.alertCancel;
	Button alertConfirm = context.alertConfirm;
	Platform.runLater(new Runnable() {
	    @Override
	    public void run() {
		DBresult result = DB.query("select DISTINCT term from CourseInfo;");
		String[] str;
		if (result.state) {
		    int length = result.list.size();
		    str = new String[length + 1];
		    str[0] = "全部  ";
		    for (int i = 0; i < length; i++) {
			str[i + 1] = result.list.get(i).get("term").toString();
		    }
		    context.termItem = str;
		} else {
		    alert.setVisible(true);
		    alertTitle.setText("严重错误");
		    alertContent.setText("执行SQL语句：" + result.SQL + "\n出现错误：" + result.msg);
		    alertCancel.setOnAction((ActionEvent e) -> {
			Platform.exit();
		    });
		    alertConfirm.setOnAction((ActionEvent e) -> {
			Platform.exit();
		    });
		    str = new String[0];
		}
		term.setItems(
			FXCollections.observableArrayList(str)
		);
		term.getSelectionModel().select(0);
	    }
	});

	condition.setItems(
		FXCollections.observableArrayList("全部", "姓名", "学号", "科目", "教师", "分数")
	);
	condition.getSelectionModel().select(0);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiger;

import Do.Do;
import Do.GradeDo;
import Table.Table;
import UI.ChoiceboxSet;
import UI.Confirm;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author coin
 */
public class Context {

    private final Parent parent;

    public int termCBox = 0;
    public int conditionCBox = 0;
    public String[] termItem;

    public String[] gradeCondition = {"全部", "姓名", "学号", "科目", "教师", "分数"};
    public Map<String, Object> gradeColMap = new LinkedHashMap<String, Object>() {
	{
	    this.put("学号", "studentID");
	    this.put("姓名", "studentName");
	    this.put("学期", "time");
	    this.put("课程", "course");
	    this.put("教师", "teacher");
	    this.put("成绩", "grade");
	}
    };

    public String[] studentCondition = {"全部", "姓名", "学号", "性别", "年龄"};
    public Map<String, Object> studentColMap = new LinkedHashMap<String, Object>() {
	{
	    this.put("学号", "studentID");
	    this.put("姓名", "name");
	    this.put("年龄", "age");
	    this.put("性别", "sex");
	    this.put("班级", "class2");
	}
    };

    public Do todo = new GradeDo(this);

    public Table table;
    public int tableRow = -1;
    public ChoiceboxSet choiceboxSet;
    public Confirm confirm;

    public List<Map<String, Object>> resultList;
    public String DBcommand = null;

    public Context(Parent parent) {
	this.parent = parent;
	init();
	table = new Table(this);
	choiceboxSet = new ChoiceboxSet(this);
	confirm = new Confirm(this);
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

    public TableView tableView;

    public TextField textField1;
    public TextField textField2;
    public TextField textField3;

    public Label tip;

    public HBox gradeaction;
    public Label gradeactiontitle;
    public TextField gradeactionname;
    public TextField gradeactioncourse;
    public TextField gradeactionterm;
    public TextField gradeactiongrade;
    public Button gradeactioncancel;
    public Button gradeactionconfirm;

    public HBox studentaction;
    public Label studentactiontitle;
    public TextField studentactionname;
    public TextField studentactionid;
    public TextField studentactionage;
    public TextField studentactionsex;
    public TextField studentactionclass;
    public Button studentactioncancel;
    public Button studentactionconfirm;

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

	tableView = (TableView) parent.lookup("#grade_table");

	textField1 = (TextField) parent.lookup("#textfield1");
	textField2 = (TextField) parent.lookup("#textfield2");
	textField3 = (TextField) parent.lookup("#textfield3");

	tip = (Label) parent.lookup("#tip");

	gradeaction = (HBox) parent.lookup("#gradeaction");
	gradeactiontitle = (Label) parent.lookup("#gradeactiontitle");
	gradeactionname = (TextField) parent.lookup("#gradeactionname");
	gradeactioncourse = (TextField) parent.lookup("#gradeactioncourse");
	gradeactionterm = (TextField) parent.lookup("#gradeactionterm");
	gradeactiongrade = (TextField) parent.lookup("#gradeactiongrade");
	gradeactioncancel = (Button) parent.lookup("#gradeactioncancel");
	gradeactionconfirm = (Button) parent.lookup("#gradeactionconfirm");

	studentaction = (HBox) parent.lookup("#studentaction");
	studentactiontitle = (Label) parent.lookup("#studentactiontitle");
	studentactionname = (TextField) parent.lookup("#studentactionname");
	studentactionid = (TextField) parent.lookup("#studentactionid");
	studentactionage = (TextField) parent.lookup("#studentactionage");
	studentactionsex = (TextField) parent.lookup("#studentactionsex");
	studentactionclass = (TextField) parent.lookup("#studentactionclass");
	studentactioncancel = (Button) parent.lookup("#studentactioncancel");
	studentactionconfirm = (Button) parent.lookup("#studentactionconfirm");

    }

}

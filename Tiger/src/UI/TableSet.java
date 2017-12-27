/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author coin
 */
public class TableSet {

    Parent parent;

    public TableSet(Parent parent) {
	this.parent = parent;
    }

    public void init() {
	TableView table = (TableView) parent.lookup("#grade_table");

	table.setEditable(false);

	TableColumn StudentIDCol = new TableColumn("学号");
	StudentIDCol.setMinWidth(100);
	StudentIDCol.setCellValueFactory(
		new PropertyValueFactory<>("studentID"));

	TableColumn StudentNameCol = new TableColumn("姓名");
	StudentNameCol.setMinWidth(100);
	StudentNameCol.setCellValueFactory(
		new PropertyValueFactory<>("studentName"));

	TableColumn TimeCol = new TableColumn("学期");
	TimeCol.setMinWidth(100);
	TimeCol.setCellValueFactory(
		new PropertyValueFactory<>("time"));

	TableColumn CourseCol = new TableColumn("课程");
	CourseCol.setMinWidth(100);
	CourseCol.setCellValueFactory(
		new PropertyValueFactory<>("course"));

	TableColumn TeacherCol = new TableColumn("教师");
	TeacherCol.setMinWidth(100);
	TeacherCol.setCellValueFactory(
		new PropertyValueFactory<>("teacher"));

	TableColumn GradeCol = new TableColumn("成绩");
	GradeCol.setMinWidth(100);
	GradeCol.setCellValueFactory(
		new PropertyValueFactory<>("grade"));

	table.setItems(data);
	table.getColumns().addAll(StudentIDCol, StudentNameCol, TimeCol, CourseCol, TeacherCol, GradeCol);

	table.getFocusModel().focusedCellProperty().addListener(
		new ChangeListener<TablePosition>() {
	    @Override
	    public void changed(ObservableValue<? extends TablePosition> observable,
		    TablePosition oldPos, TablePosition pos) {
		itemSelect(true);
	    }
	});

//	Button searchBtn = (Button) parent.lookup("#search_btn");
//	searchBtn.setOnAction((ActionEvent e) -> {
//	    if (tableFocus) {
//		System.out.println(table.getFocusModel().getFocusedCell().getRow());
//	    }
//	});
    }

    private void itemSelect(boolean b) {
	Button motifyBtn = (Button) parent.lookup("#motifybtn");
	Button deleteBtn = (Button) parent.lookup("#deletebtn");

	motifyBtn.setDisable(!b);
	deleteBtn.setDisable(!b);

    }

    private final ObservableList<TableSet.GradeItem> data
	    = FXCollections.observableArrayList(
		    new TableSet.GradeItem("10001", "Smith", "2017下", "语文", "Alice", "86"),
		    new TableSet.GradeItem("10003", "Bob", "2017下", "语文", "Alice", "76"),
		    new TableSet.GradeItem("10005", "Cally", "2017下", "数学", "Alice", "96"),
		    new TableSet.GradeItem("10006", "Devi", "2017下", "语文", "Alice", "66"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56")
	    );

    boolean tableFocus = false;

    public class GradeItem {

	private final SimpleStringProperty studentID;
	private final SimpleStringProperty studentName;
	private final SimpleStringProperty time;
	private final SimpleStringProperty course;
	private final SimpleStringProperty teacher;
	private final SimpleStringProperty grade;

	public GradeItem(String studentID, String studentName, String time, String course, String teacher, String grade) {
	    this.studentID = new SimpleStringProperty(studentID);
	    this.studentName = new SimpleStringProperty(studentName);
	    this.time = new SimpleStringProperty(time);
	    this.course = new SimpleStringProperty(course);
	    this.teacher = new SimpleStringProperty(teacher);
	    this.grade = new SimpleStringProperty(grade);
	}

	/**
	 * @return the studentID
	 */
	public String getStudentID() {
	    return studentID.get();
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(String studentID) {
	    this.studentID.set(studentID);
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
	    return studentName.get();
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
	    this.studentName.set(studentName);
	}

	/**
	 * @return the time
	 */
	public String getTime() {
	    return time.get();
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
	    this.time.set(time);
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
	    return course.get();
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
	    this.course.set(course);
	}

	/**
	 * @return the teacher
	 */
	public String getTeacher() {
	    return teacher.get();
	}

	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(String teacher) {
	    this.teacher.set(teacher);
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
	    return grade.get();
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
	    this.grade.set(grade);
	}
    }
}

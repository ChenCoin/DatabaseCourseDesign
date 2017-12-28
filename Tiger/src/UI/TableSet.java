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

	table.getFocusModel().focusedCellProperty().addListener(
		new ChangeListener<TablePosition>() {
	    @Override
	    public void changed(ObservableValue<? extends TablePosition> observable,
		    TablePosition oldPos, TablePosition pos) {
		itemSelect(true);
	    }
	});

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

	//table.setItems(data);
	table.getColumns().addAll(StudentIDCol, StudentNameCol, TimeCol, CourseCol, TeacherCol, GradeCol);

    }

    private void itemSelect(boolean b) {
	Button motifyBtn = (Button) parent.lookup("#motifybtn");
	Button deleteBtn = (Button) parent.lookup("#deletebtn");

	motifyBtn.setDisable(!b);
	deleteBtn.setDisable(!b);

    }

//    private final ObservableList<TableSet.GradeItem> data
//	    = FXCollections.observableArrayList(
//		    new TableSet.GradeItem("10001", "Smith", "2017下", "语文", "Alice", "86"),
//		    new TableSet.GradeItem("10003", "Bob", "2017下", "语文", "Alice", "76"),
//		    new TableSet.GradeItem("10005", "Cally", "2017下", "数学", "Alice", "96"),
//		    new TableSet.GradeItem("10006", "Devi", "2017下", "语文", "Alice", "66"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56"),
//		    new TableSet.GradeItem("10007", "Fly", "2017下", "语文", "Alice", "56")
//	    );

}

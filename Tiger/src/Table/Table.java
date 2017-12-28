/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import java.util.Iterator;
import java.util.Map;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author coin
 */
public class Table {

    Parent parent;
    TableView table;

    public Table(Parent parent) {
	this.parent = parent;
	table = (TableView) parent.lookup("#grade_table");
    }

    public void show() {

    }

    public void hide() {

    }

    public void setCol(Map<String, Object> mMap) {
	table.getColumns().clear();
	Iterator<Map.Entry<String, Object>> itera_Entry = mMap.entrySet().iterator();
	while (itera_Entry.hasNext()) {
	    Map.Entry<String, Object> mapEntry = itera_Entry.next();

	    TableColumn Col = new TableColumn(mapEntry.getKey());
	    Col.setMinWidth(100);
	    Col.setCellValueFactory(
		    new PropertyValueFactory<>(mapEntry.getValue().toString()));

	    table.getColumns().add(Col);
	}
    }
//List<Map<String, Object>> mList
    public void setData(ObservableList<Object> data) {
	table.setItems(data);
    }

}

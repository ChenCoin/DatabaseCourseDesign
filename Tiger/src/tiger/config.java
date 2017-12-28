/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiger;

import Do.Do;
import Do.StudentDo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cano
 */
public class config {

    public enum enumPageState {
	grade, student, teacher, course, info
    };

    public static enumPageState pageState = enumPageState.grade;

    public static int termCBox = 0;
    public static int conditionCBox = 0;

    public static Map<String, Object> gradeMap = new HashMap<String, Object>() {
	{
	    gradeMap.put("学号", "studentID");
	    gradeMap.put("姓名", "studentName");
	    gradeMap.put("学期", "time");
	    gradeMap.put("课程", "course");
	    gradeMap.put("教师", "teacher");
	    gradeMap.put("成绩", "grade");
	}
    };

}

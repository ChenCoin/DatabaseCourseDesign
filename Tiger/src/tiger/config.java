/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiger;

/**
 *
 * @author Cano
 */
public class config {
    public enum enumPageState{
	grade,student,teacher,course,info
    };
    
    public static enumPageState pageState = enumPageState.grade;
    
}

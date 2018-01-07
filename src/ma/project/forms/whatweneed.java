/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.forms;

import java.util.ArrayList;

/**
 *
 * @author Hakim
 */
public interface whatweneed<T> {
    public ArrayList<T> ShowData();    
    public void InsertData(T o);   
    public void UpdateData(T o);
    public void DeleteData(T o);



}

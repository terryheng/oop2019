/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2019;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Student {
  private List<Student> studentList = new ArrayList<Student>();
  public void addStudent(Student student)
  {
    studentList.add(student);
  }

  public List<Student> getSList()
  {
    return studentList;
  }
}


package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String selNpm) {
		// todo implement
		for (StudentModel sm : studentList) {
			if (sm.getNpm().equalsIgnoreCase(selNpm)) {
				return sm;
			}
		}
		return null;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}

	@Override
	public boolean deleteStudent(String delNpm) {
		for (StudentModel sm : studentList) {
			if (sm.getNpm().equalsIgnoreCase(delNpm)) {
				studentList.remove(studentList.indexOf(sm));
				return true;
			}
		}
		return false;
	}
}

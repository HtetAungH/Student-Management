package com.pjdc_b1.student_management.service;

import java.util.List;


import com.pjdc_b1.student_management.model.StudentModel;

public interface StudentService {
	public List<StudentModel> studentDataAdd(StudentModel stu);
	public List<StudentModel> studentDataDelete(String Stu_ID);
	public StudentModel selectById(String stu_ID);
	public List<StudentModel> updateProcess(StudentModel stu);
}

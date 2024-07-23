package com.pjdc_b1.student_management.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.pjdc_b1.student_management.model.StudentModel;
import com.pjdc_b1.student_management.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	
		private static ArrayList<StudentModel> stuList = new ArrayList<StudentModel>();
		private static int stuIdIndex = 1;
		
		@Override
		public List<StudentModel> studentDataAdd(StudentModel stu) {
			stu.setStu_ID(stuIdIndex);
			stuIdIndex++;
			stuList.add(stu);
			return stuList;
		}
		
		@Override
		public List<StudentModel> studentDataDelete(String Stu_ID) {
			int employeeId = Integer.parseInt(Stu_ID);
			for (int i = 0; i < stuList.size(); i++) {
				if (stuList.get(i).getStu_ID() == employeeId) {
					stuList.remove(i);
					return stuList;
				}
			}
			return stuList;
		}

		@Override
		public StudentModel selectById(String stu_ID) {
			int studentId = Integer.parseInt(stu_ID);
			for (int i = 0; i < stuList.size(); i++) {
				if (stuList.get(i).getStu_ID() == studentId) {
					return stuList.get(i);
				}
			}
			return null;
		}

		@Override
		public List<StudentModel> updateProcess(StudentModel stu) {
			for (int i = 0; i < stuList.size(); i++) {
				if (stuList.get(i).getStu_ID() == stu.getStu_ID()) {
					stuList.get(i).setStu_Name(stu.getStu_Name());
					stuList.get(i).setStu_Age(stu.getStu_Age());
					stuList.get(i).setStu_Email(stu.getStu_Email());
					stuList.get(i).setStu_Address(stu.getStu_Address());
					stuList.get(i).setStu_PhoneNo(stu.getStu_PhoneNo());
					return stuList;
				}
			}
			return stuList;
		}
	

}

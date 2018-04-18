package com.dianwang.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dianwang.gof.Student;
import com.dianwang.mapper.StudentMapper;
import com.dianwang.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Resource
	private StudentMapper studentMapper;

	@Override
	public Student login(Student stu) throws Exception {
		return studentMapper.login(stu);
	}
	
}

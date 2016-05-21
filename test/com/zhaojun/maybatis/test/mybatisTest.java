package com.zhaojun.maybatis.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhaojun.mybatis.model.Student;
import com.zhaojun.mybatis.studentDao.StudentDao;

public class mybatisTest {

	@Test
	public void test2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao studentDao = (StudentDao) ctx.getBean("studentDao");	
		Student student = studentDao.queryStudent("1");
		System.out.println(student);
		studentDao.deleteStudent("1");
	}
}

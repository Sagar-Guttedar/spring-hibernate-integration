package com.joc;

import com.joc.dao.StudentDAO;
import com.joc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestHibernate {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        StudentDAO s=(StudentDAO) ctx.getBean("sd");
        // Create table and insert student values
        /*Student s1 = new Student();
        s1.setId(1);
        s1.setName("ABC");
        s1.setFees(60000.34f);
        s.saveStudent(s1);*/

        // Get All Student values
        /*List<Student> slist = s.getAllStudentInfo();
        slist.forEach(
                (x)->{
                    System.out.println(x.toString());
                    System.out.println("---------------------------------------------------------");
                }

        );*/

        //Get Specific student Information
        /*Student s1 = s.getStudent(1);
        System.out.println(s1.toString());*/

        // Update Specific Student Info
        /*s.updateStudent(1,"Sagar");*/

        //Delete Specific Specific Student record
        s.deleteStudent(4);

    }
}

package com.joc.dao;

import com.joc.entity.Student;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

public class StudentDAO {

    HibernateTemplate template;

    public void setTemplate(HibernateTemplate template){
        this.template=template;
    }

    // Create table and insert student Information
    public void saveStudent(Student st){
        template.save(st);
        System.out.println("Record saved successfully");
    }

    //Get all student Information
    public List<Student> getAllStudentInfo(){
        return template.loadAll(Student.class);
    }

    // Get Specific student Information
    public Student getStudent(int id){
        return template.get(Student.class, new Integer(id));
    }

    // Update Student Information
    public void updateStudent(int id, String n){
        Student st = template.get(Student.class, new Integer(id));
        st.setName(n);
        template.update(st);
        System.out.println("Record updated successfully");
    }

    // Delete Student Record
    public void deleteStudent(int id){
        Student st =template.get(Student.class, new Integer(id));
        template.delete(st);
        System.out.println("Record deleted successfully");
    }



}

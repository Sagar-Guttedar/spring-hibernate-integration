package com.joc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    @Column
    int id;
    @Column
    String name;
    @Column
    float fees;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }

   public String toString(){
        return "Student Id : "+id+" Student name : "+name+" Student fees : "+fees;
   }
}

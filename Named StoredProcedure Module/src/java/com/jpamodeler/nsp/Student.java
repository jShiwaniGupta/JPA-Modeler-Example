package com.jpamodeler.nsp;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@NamedStoredProcedureQuery(name = "FindStudentByBatch", procedureName = "studentAll", resultClasses = {Student.class}, parameters = {
    @StoredProcedureParameter(name = "BATCH_NO", mode = ParameterMode.IN, type = Integer.class)})
public class Student implements Serializable {

    @Column(name = "SID", table = "student", nullable = false)
    @Id
    private Integer sid;

    @Column(name = "LNAME", table = "student", length = 10)
    @Basic
    private String lname;

    @Column(name = "EMAIL", table = "student", length = 30)
    @Basic
    private String email;

    @Column(name = "BATCH", table = "student")
    @Basic
    private Integer batch;

    @Column(name = "DEPT", table = "student", length = 10)
    @Basic
    private String dept;

    @Column(name = "FNAME", table = "student", nullable = false, length = 10)
    @Basic
    private String fname;

    public Student() {

    }

    public Integer getSid() {
        return this.sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBatch() {
        return this.batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}

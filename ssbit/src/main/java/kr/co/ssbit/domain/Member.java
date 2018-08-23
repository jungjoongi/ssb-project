package kr.co.ssbit.domain;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;

    private int no;
    private String id;
    private String name;
    private String email;
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Member [no=" + no + ", id=" + id + ", name=" + name + ", email=" + email + "]";
    }

   // @JsonFormat(pattern="yyyy-MM-dd")
   // private Date createdDate;

    
    
    
}
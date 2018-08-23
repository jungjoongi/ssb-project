package kr.co.ssbit.domain;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    private int no;
    private String koName;
    private String enName;
    private String cnName;
    private String juminNo;
    private String photoName;
    private String birthYMD;
    private String birthRN;
    private String sex;
    private String marry;
    private String workYear;
    private String joinStyle;
    private String hopeWork;
    private String address;
    private String tel;
    private String email;
    private String tech;
    private String alcohol;
    private String work;
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getKoName() {
        return koName;
    }
    public void setKoName(String koName) {
        this.koName = koName;
    }
    public String getEnName() {
        return enName;
    }
    public void setEnName(String enName) {
        this.enName = enName;
    }
    public String getCnName() {
        return cnName;
    }
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }
    public String getJuminNo() {
        return juminNo;
    }
    public void setJuminNo(String juminNo) {
        this.juminNo = juminNo;
    }
    public String getPhotoName() {
        return photoName;
    }
    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }
    public String getBirthYMD() {
        return birthYMD;
    }
    public void setBirthYMD(String birthYMD) {
        this.birthYMD = birthYMD;
    }
    public String getBirthRN() {
        return birthRN;
    }
    public void setBirthRN(String birthRN) {
        this.birthRN = birthRN;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getMarry() {
        return marry;
    }
    public void setMarry(String marry) {
        this.marry = marry;
    }
    public String getWorkYear() {
        return workYear;
    }
    public void setWorkYear(String workYear) {
        this.workYear = workYear;
    }
    public String getJoinStyle() {
        return joinStyle;
    }
    public void setJoinStyle(String joinStyle) {
        this.joinStyle = joinStyle;
    }
    public String getHopeWork() {
        return hopeWork;
    }
    public void setHopeWork(String hopeWork) {
        this.hopeWork = hopeWork;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    public String getAlcohol() {
        return alcohol;
    }
    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    @Override
    public String toString() {
        return "Worker [no=" + no + ", koName=" + koName + ", enName=" + enName + ", cnName=" + cnName + ", juminNo="
                + juminNo + ", photoName=" + photoName + ", birthYMD=" + birthYMD + ", birthRN=" + birthRN + ", sex="
                + sex + ", marry=" + marry + ", workYear=" + workYear + ", joinStyle=" + joinStyle + ", hopeWork="
                + hopeWork + ", address=" + address + ", tel=" + tel + ", email=" + email + ", tech=" + tech
                + ", alcohol=" + alcohol + ", work=" + work + "]";
    }
   
    
//    @JsonFormat(pattern="yyyy-MM-dd")
//    private Date createdDate;

   
    
    
}

//ver 31 - 생성자 제거 및 count 변수 제거
//ver 27 - java.io.Serializable 인터페이스 구현
//ver 24 - setNo() 변경
//ver 18 - 게시물 객체의 고유 번호(no)를 static 변수(count)를 이용하여 자동 설정한다. 
// ver 16 - 캡슐화 적용. 겟터, 셋터 추가.
// ver 13 - 등록일의 데이터 타입을 String에서 Date으로 변경







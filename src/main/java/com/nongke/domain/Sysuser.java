package com.nongke.domain;

import com.nongke.base.domain.BaseEntity;
import java.util.Date;

public class Sysuser extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String loginName;

    private String password;

    private String name;

    private Integer age;

    private Boolean sex;

    private String nation;

    private String nowaddress;

    private String peraddress;

    private String telephone;

    private String email;

    private String qq;

    private Integer certifyType;

    private String certifyNumber;

    private String imageurl;

    private Integer education;

    private String school;

    private Integer statsu;

    private Date createdate;

    private Integer createbyid;

    private Date modifydate;

    private Integer modifybyid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNowaddress() {
        return nowaddress;
    }

    public void setNowaddress(String nowaddress) {
        this.nowaddress = nowaddress;
    }

    public String getPeraddress() {
        return peraddress;
    }

    public void setPeraddress(String peraddress) {
        this.peraddress = peraddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Integer getCertifyType() {
        return certifyType;
    }

    public void setCertifyType(Integer certifyType) {
        this.certifyType = certifyType;
    }

    public String getCertifyNumber() {
        return certifyNumber;
    }

    public void setCertifyNumber(String certifyNumber) {
        this.certifyNumber = certifyNumber;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}

	public Integer getStatsu() {
		return statsu;
	}

	public void setStatsu(Integer statsu) {
		this.statsu = statsu;
	}

	public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getCreatebyid() {
        return createbyid;
    }

    public void setCreatebyid(Integer createbyid) {
        this.createbyid = createbyid;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getModifybyid() {
        return modifybyid;
    }

    public void setModifybyid(Integer modifybyid) {
        this.modifybyid = modifybyid;
    }
}
package com.nongke.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nongke.base.domain.BaseExample;

public class SysuserExample implements BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitOffset = -1;

    public SysuserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitOffset(int limitOffset) {
        this.limitOffset=limitOffset;
    }

    public int getLimitOffset() {
        return limitOffset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNowaddressIsNull() {
            addCriterion("nowaddress is null");
            return (Criteria) this;
        }

        public Criteria andNowaddressIsNotNull() {
            addCriterion("nowaddress is not null");
            return (Criteria) this;
        }

        public Criteria andNowaddressEqualTo(String value) {
            addCriterion("nowaddress =", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressNotEqualTo(String value) {
            addCriterion("nowaddress <>", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressGreaterThan(String value) {
            addCriterion("nowaddress >", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressGreaterThanOrEqualTo(String value) {
            addCriterion("nowaddress >=", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressLessThan(String value) {
            addCriterion("nowaddress <", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressLessThanOrEqualTo(String value) {
            addCriterion("nowaddress <=", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressLike(String value) {
            addCriterion("nowaddress like", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressNotLike(String value) {
            addCriterion("nowaddress not like", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressIn(List<String> values) {
            addCriterion("nowaddress in", values, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressNotIn(List<String> values) {
            addCriterion("nowaddress not in", values, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressBetween(String value1, String value2) {
            addCriterion("nowaddress between", value1, value2, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressNotBetween(String value1, String value2) {
            addCriterion("nowaddress not between", value1, value2, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressIsNull() {
            addCriterion("peraddress is null");
            return (Criteria) this;
        }

        public Criteria andPeraddressIsNotNull() {
            addCriterion("peraddress is not null");
            return (Criteria) this;
        }

        public Criteria andPeraddressEqualTo(String value) {
            addCriterion("peraddress =", value, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressNotEqualTo(String value) {
            addCriterion("peraddress <>", value, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressGreaterThan(String value) {
            addCriterion("peraddress >", value, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("peraddress >=", value, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressLessThan(String value) {
            addCriterion("peraddress <", value, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressLessThanOrEqualTo(String value) {
            addCriterion("peraddress <=", value, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressLike(String value) {
            addCriterion("peraddress like", value, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressNotLike(String value) {
            addCriterion("peraddress not like", value, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressIn(List<String> values) {
            addCriterion("peraddress in", values, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressNotIn(List<String> values) {
            addCriterion("peraddress not in", values, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressBetween(String value1, String value2) {
            addCriterion("peraddress between", value1, value2, "peraddress");
            return (Criteria) this;
        }

        public Criteria andPeraddressNotBetween(String value1, String value2) {
            addCriterion("peraddress not between", value1, value2, "peraddress");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeIsNull() {
            addCriterion("certify_type is null");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeIsNotNull() {
            addCriterion("certify_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeEqualTo(Integer value) {
            addCriterion("certify_type =", value, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeNotEqualTo(Integer value) {
            addCriterion("certify_type <>", value, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeGreaterThan(Integer value) {
            addCriterion("certify_type >", value, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("certify_type >=", value, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeLessThan(Integer value) {
            addCriterion("certify_type <", value, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("certify_type <=", value, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeIn(List<Integer> values) {
            addCriterion("certify_type in", values, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeNotIn(List<Integer> values) {
            addCriterion("certify_type not in", values, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeBetween(Integer value1, Integer value2) {
            addCriterion("certify_type between", value1, value2, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("certify_type not between", value1, value2, "certifyType");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberIsNull() {
            addCriterion("certify_number is null");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberIsNotNull() {
            addCriterion("certify_number is not null");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberEqualTo(String value) {
            addCriterion("certify_number =", value, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberNotEqualTo(String value) {
            addCriterion("certify_number <>", value, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberGreaterThan(String value) {
            addCriterion("certify_number >", value, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("certify_number >=", value, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberLessThan(String value) {
            addCriterion("certify_number <", value, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberLessThanOrEqualTo(String value) {
            addCriterion("certify_number <=", value, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberLike(String value) {
            addCriterion("certify_number like", value, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberNotLike(String value) {
            addCriterion("certify_number not like", value, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberIn(List<String> values) {
            addCriterion("certify_number in", values, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberNotIn(List<String> values) {
            addCriterion("certify_number not in", values, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberBetween(String value1, String value2) {
            addCriterion("certify_number between", value1, value2, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andCertifyNumberNotBetween(String value1, String value2) {
            addCriterion("certify_number not between", value1, value2, "certifyNumber");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNull() {
            addCriterion("imageurl is null");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNotNull() {
            addCriterion("imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andImageurlEqualTo(String value) {
            addCriterion("imageurl =", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotEqualTo(String value) {
            addCriterion("imageurl <>", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThan(String value) {
            addCriterion("imageurl >", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("imageurl >=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThan(String value) {
            addCriterion("imageurl <", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThanOrEqualTo(String value) {
            addCriterion("imageurl <=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLike(String value) {
            addCriterion("imageurl like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotLike(String value) {
            addCriterion("imageurl not like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlIn(List<String> values) {
            addCriterion("imageurl in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotIn(List<String> values) {
            addCriterion("imageurl not in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlBetween(String value1, String value2) {
            addCriterion("imageurl between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotBetween(String value1, String value2) {
            addCriterion("imageurl not between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Boolean value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Boolean value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Boolean value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Boolean value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Boolean value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Boolean> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Boolean> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Boolean value1, Boolean value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andStatsuIsNull() {
            addCriterion("statsu is null");
            return (Criteria) this;
        }

        public Criteria andStatsuIsNotNull() {
            addCriterion("statsu is not null");
            return (Criteria) this;
        }

        public Criteria andStatsuEqualTo(Boolean value) {
            addCriterion("statsu =", value, "statsu");
            return (Criteria) this;
        }

        public Criteria andStatsuNotEqualTo(Boolean value) {
            addCriterion("statsu <>", value, "statsu");
            return (Criteria) this;
        }

        public Criteria andStatsuGreaterThan(Boolean value) {
            addCriterion("statsu >", value, "statsu");
            return (Criteria) this;
        }

        public Criteria andStatsuGreaterThanOrEqualTo(Boolean value) {
            addCriterion("statsu >=", value, "statsu");
            return (Criteria) this;
        }

        public Criteria andStatsuLessThan(Boolean value) {
            addCriterion("statsu <", value, "statsu");
            return (Criteria) this;
        }

        public Criteria andStatsuLessThanOrEqualTo(Boolean value) {
            addCriterion("statsu <=", value, "statsu");
            return (Criteria) this;
        }

        public Criteria andStatsuIn(List<Boolean> values) {
            addCriterion("statsu in", values, "statsu");
            return (Criteria) this;
        }

        public Criteria andStatsuNotIn(List<Boolean> values) {
            addCriterion("statsu not in", values, "statsu");
            return (Criteria) this;
        }

        public Criteria andStatsuBetween(Boolean value1, Boolean value2) {
            addCriterion("statsu between", value1, value2, "statsu");
            return (Criteria) this;
        }

        public Criteria andStatsuNotBetween(Boolean value1, Boolean value2) {
            addCriterion("statsu not between", value1, value2, "statsu");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatebyidIsNull() {
            addCriterion("createbyid is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyidIsNotNull() {
            addCriterion("createbyid is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyidEqualTo(Integer value) {
            addCriterion("createbyid =", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidNotEqualTo(Integer value) {
            addCriterion("createbyid <>", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidGreaterThan(Integer value) {
            addCriterion("createbyid >", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("createbyid >=", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidLessThan(Integer value) {
            addCriterion("createbyid <", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidLessThanOrEqualTo(Integer value) {
            addCriterion("createbyid <=", value, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidIn(List<Integer> values) {
            addCriterion("createbyid in", values, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidNotIn(List<Integer> values) {
            addCriterion("createbyid not in", values, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidBetween(Integer value1, Integer value2) {
            addCriterion("createbyid between", value1, value2, "createbyid");
            return (Criteria) this;
        }

        public Criteria andCreatebyidNotBetween(Integer value1, Integer value2) {
            addCriterion("createbyid not between", value1, value2, "createbyid");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifydate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifydate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifydate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifydate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifydate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifydate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifydate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifydate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifydate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifydate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifydate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifybyidIsNull() {
            addCriterion("modifybyid is null");
            return (Criteria) this;
        }

        public Criteria andModifybyidIsNotNull() {
            addCriterion("modifybyid is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyidEqualTo(Integer value) {
            addCriterion("modifybyid =", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidNotEqualTo(Integer value) {
            addCriterion("modifybyid <>", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidGreaterThan(Integer value) {
            addCriterion("modifybyid >", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifybyid >=", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidLessThan(Integer value) {
            addCriterion("modifybyid <", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidLessThanOrEqualTo(Integer value) {
            addCriterion("modifybyid <=", value, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidIn(List<Integer> values) {
            addCriterion("modifybyid in", values, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidNotIn(List<Integer> values) {
            addCriterion("modifybyid not in", values, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidBetween(Integer value1, Integer value2) {
            addCriterion("modifybyid between", value1, value2, "modifybyid");
            return (Criteria) this;
        }

        public Criteria andModifybyidNotBetween(Integer value1, Integer value2) {
            addCriterion("modifybyid not between", value1, value2, "modifybyid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
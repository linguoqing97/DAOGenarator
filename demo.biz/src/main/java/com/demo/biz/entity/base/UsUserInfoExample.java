package com.demo.biz.entity.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart;

    protected int limitEnd;

    protected String groupByClause;

    public UsUserInfoExample() {
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

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    public void setGroupByClause(String groupByClause) {
        this.groupByClause=groupByClause;
    }

    public String getGroupByClause() {
        return groupByClause;
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
            addCriterion("us_user_info.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("us_user_info.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("us_user_info.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("us_user_info.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("us_user_info.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("us_user_info.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("us_user_info.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("us_user_info.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("us_user_info.user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("us_user_info.user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("us_user_info.user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("us_user_info.user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("us_user_info.user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("us_user_info.user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("us_user_info.user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("us_user_info.user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("us_user_info.nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("us_user_info.nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("us_user_info.nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("us_user_info.nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("us_user_info.nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("us_user_info.nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("us_user_info.nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("us_user_info.nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("us_user_info.nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("us_user_info.nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("us_user_info.nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("us_user_info.nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("us_user_info.nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("us_user_info.nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andHeadImageIsNull() {
            addCriterion("us_user_info.head_image is null");
            return (Criteria) this;
        }

        public Criteria andHeadImageIsNotNull() {
            addCriterion("us_user_info.head_image is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImageEqualTo(String value) {
            addCriterion("us_user_info.head_image =", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotEqualTo(String value) {
            addCriterion("us_user_info.head_image <>", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageGreaterThan(String value) {
            addCriterion("us_user_info.head_image >", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageGreaterThanOrEqualTo(String value) {
            addCriterion("us_user_info.head_image >=", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageLessThan(String value) {
            addCriterion("us_user_info.head_image <", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageLessThanOrEqualTo(String value) {
            addCriterion("us_user_info.head_image <=", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageLike(String value) {
            addCriterion("us_user_info.head_image like", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotLike(String value) {
            addCriterion("us_user_info.head_image not like", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageIn(List<String> values) {
            addCriterion("us_user_info.head_image in", values, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotIn(List<String> values) {
            addCriterion("us_user_info.head_image not in", values, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageBetween(String value1, String value2) {
            addCriterion("us_user_info.head_image between", value1, value2, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotBetween(String value1, String value2) {
            addCriterion("us_user_info.head_image not between", value1, value2, "headImage");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("us_user_info.mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("us_user_info.mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("us_user_info.mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("us_user_info.mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("us_user_info.mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("us_user_info.mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("us_user_info.mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("us_user_info.mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("us_user_info.mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("us_user_info.mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("us_user_info.mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("us_user_info.mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("us_user_info.mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("us_user_info.mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("us_user_info.sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("us_user_info.sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("us_user_info.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("us_user_info.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("us_user_info.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("us_user_info.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("us_user_info.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("us_user_info.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("us_user_info.region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("us_user_info.region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(Integer value) {
            addCriterion("us_user_info.region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(Integer value) {
            addCriterion("us_user_info.region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(Integer value) {
            addCriterion("us_user_info.region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(Integer value) {
            addCriterion("us_user_info.region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<Integer> values) {
            addCriterion("us_user_info.region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<Integer> values) {
            addCriterion("us_user_info.region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("us_user_info.signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("us_user_info.signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("us_user_info.signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("us_user_info.signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("us_user_info.signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("us_user_info.signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("us_user_info.signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("us_user_info.signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("us_user_info.signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("us_user_info.signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("us_user_info.signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("us_user_info.signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("us_user_info.signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("us_user_info.signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("us_user_info.type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("us_user_info.type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("us_user_info.type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("us_user_info.type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("us_user_info.type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("us_user_info.type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("us_user_info.type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("us_user_info.type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("us_user_info.type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("us_user_info.type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("us_user_info.type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("us_user_info.type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andKindCodeIsNull() {
            addCriterion("us_user_info.kind_code is null");
            return (Criteria) this;
        }

        public Criteria andKindCodeIsNotNull() {
            addCriterion("us_user_info.kind_code is not null");
            return (Criteria) this;
        }

        public Criteria andKindCodeEqualTo(String value) {
            addCriterion("us_user_info.kind_code =", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotEqualTo(String value) {
            addCriterion("us_user_info.kind_code <>", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeGreaterThan(String value) {
            addCriterion("us_user_info.kind_code >", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeGreaterThanOrEqualTo(String value) {
            addCriterion("us_user_info.kind_code >=", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeLessThan(String value) {
            addCriterion("us_user_info.kind_code <", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeLessThanOrEqualTo(String value) {
            addCriterion("us_user_info.kind_code <=", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeLike(String value) {
            addCriterion("us_user_info.kind_code like", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotLike(String value) {
            addCriterion("us_user_info.kind_code not like", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeIn(List<String> values) {
            addCriterion("us_user_info.kind_code in", values, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotIn(List<String> values) {
            addCriterion("us_user_info.kind_code not in", values, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeBetween(String value1, String value2) {
            addCriterion("us_user_info.kind_code between", value1, value2, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotBetween(String value1, String value2) {
            addCriterion("us_user_info.kind_code not between", value1, value2, "kindCode");
            return (Criteria) this;
        }

        public Criteria andHotIsNull() {
            addCriterion("us_user_info.hot is null");
            return (Criteria) this;
        }

        public Criteria andHotIsNotNull() {
            addCriterion("us_user_info.hot is not null");
            return (Criteria) this;
        }

        public Criteria andHotEqualTo(Integer value) {
            addCriterion("us_user_info.hot =", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotEqualTo(Integer value) {
            addCriterion("us_user_info.hot <>", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThan(Integer value) {
            addCriterion("us_user_info.hot >", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.hot >=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThan(Integer value) {
            addCriterion("us_user_info.hot <", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThanOrEqualTo(Integer value) {
            addCriterion("us_user_info.hot <=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotIn(List<Integer> values) {
            addCriterion("us_user_info.hot in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotIn(List<Integer> values) {
            addCriterion("us_user_info.hot not in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.hot between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotBetween(Integer value1, Integer value2) {
            addCriterion("us_user_info.hot not between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("us_user_info.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("us_user_info.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("us_user_info.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("us_user_info.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("us_user_info.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("us_user_info.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("us_user_info.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("us_user_info.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("us_user_info.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("us_user_info.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("us_user_info.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("us_user_info.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("us_user_info.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("us_user_info.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("us_user_info.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("us_user_info.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("us_user_info.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("us_user_info.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("us_user_info.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("us_user_info.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("us_user_info.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("us_user_info.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("us_user_info.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("us_user_info.update_time not between", value1, value2, "updateTime");
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
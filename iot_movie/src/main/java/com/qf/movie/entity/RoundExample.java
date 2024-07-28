package com.qf.movie.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoundExample() {
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

        public Criteria andRoundIdIsNull() {
            addCriterion("round_id is null");
            return (Criteria) this;
        }

        public Criteria andRoundIdIsNotNull() {
            addCriterion("round_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoundIdEqualTo(Integer value) {
            addCriterion("round_id =", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdNotEqualTo(Integer value) {
            addCriterion("round_id <>", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdGreaterThan(Integer value) {
            addCriterion("round_id >", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("round_id >=", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdLessThan(Integer value) {
            addCriterion("round_id <", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdLessThanOrEqualTo(Integer value) {
            addCriterion("round_id <=", value, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdIn(List<Integer> values) {
            addCriterion("round_id in", values, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdNotIn(List<Integer> values) {
            addCriterion("round_id not in", values, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdBetween(Integer value1, Integer value2) {
            addCriterion("round_id between", value1, value2, "roundId");
            return (Criteria) this;
        }

        public Criteria andRoundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("round_id not between", value1, value2, "roundId");
            return (Criteria) this;
        }

        public Criteria andHourseIdIsNull() {
            addCriterion("hourse_id is null");
            return (Criteria) this;
        }

        public Criteria andHourseIdIsNotNull() {
            addCriterion("hourse_id is not null");
            return (Criteria) this;
        }

        public Criteria andHourseIdEqualTo(Integer value) {
            addCriterion("hourse_id =", value, "hourseId");
            return (Criteria) this;
        }

        public Criteria andHourseIdNotEqualTo(Integer value) {
            addCriterion("hourse_id <>", value, "hourseId");
            return (Criteria) this;
        }

        public Criteria andHourseIdGreaterThan(Integer value) {
            addCriterion("hourse_id >", value, "hourseId");
            return (Criteria) this;
        }

        public Criteria andHourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hourse_id >=", value, "hourseId");
            return (Criteria) this;
        }

        public Criteria andHourseIdLessThan(Integer value) {
            addCriterion("hourse_id <", value, "hourseId");
            return (Criteria) this;
        }

        public Criteria andHourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("hourse_id <=", value, "hourseId");
            return (Criteria) this;
        }

        public Criteria andHourseIdIn(List<Integer> values) {
            addCriterion("hourse_id in", values, "hourseId");
            return (Criteria) this;
        }

        public Criteria andHourseIdNotIn(List<Integer> values) {
            addCriterion("hourse_id not in", values, "hourseId");
            return (Criteria) this;
        }

        public Criteria andHourseIdBetween(Integer value1, Integer value2) {
            addCriterion("hourse_id between", value1, value2, "hourseId");
            return (Criteria) this;
        }

        public Criteria andHourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hourse_id not between", value1, value2, "hourseId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(Integer value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(Integer value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(Integer value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(Integer value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(Integer value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<Integer> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<Integer> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(Integer value1, Integer value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andRoundStartIsNull() {
            addCriterion("round_start is null");
            return (Criteria) this;
        }

        public Criteria andRoundStartIsNotNull() {
            addCriterion("round_start is not null");
            return (Criteria) this;
        }

        public Criteria andRoundStartEqualTo(Date value) {
            addCriterion("round_start =", value, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundStartNotEqualTo(Date value) {
            addCriterion("round_start <>", value, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundStartGreaterThan(Date value) {
            addCriterion("round_start >", value, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundStartGreaterThanOrEqualTo(Date value) {
            addCriterion("round_start >=", value, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundStartLessThan(Date value) {
            addCriterion("round_start <", value, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundStartLessThanOrEqualTo(Date value) {
            addCriterion("round_start <=", value, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundStartIn(List<Date> values) {
            addCriterion("round_start in", values, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundStartNotIn(List<Date> values) {
            addCriterion("round_start not in", values, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundStartBetween(Date value1, Date value2) {
            addCriterion("round_start between", value1, value2, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundStartNotBetween(Date value1, Date value2) {
            addCriterion("round_start not between", value1, value2, "roundStart");
            return (Criteria) this;
        }

        public Criteria andRoundEndIsNull() {
            addCriterion("round_end is null");
            return (Criteria) this;
        }

        public Criteria andRoundEndIsNotNull() {
            addCriterion("round_end is not null");
            return (Criteria) this;
        }

        public Criteria andRoundEndEqualTo(Date value) {
            addCriterion("round_end =", value, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundEndNotEqualTo(Date value) {
            addCriterion("round_end <>", value, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundEndGreaterThan(Date value) {
            addCriterion("round_end >", value, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundEndGreaterThanOrEqualTo(Date value) {
            addCriterion("round_end >=", value, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundEndLessThan(Date value) {
            addCriterion("round_end <", value, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundEndLessThanOrEqualTo(Date value) {
            addCriterion("round_end <=", value, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundEndIn(List<Date> values) {
            addCriterion("round_end in", values, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundEndNotIn(List<Date> values) {
            addCriterion("round_end not in", values, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundEndBetween(Date value1, Date value2) {
            addCriterion("round_end between", value1, value2, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundEndNotBetween(Date value1, Date value2) {
            addCriterion("round_end not between", value1, value2, "roundEnd");
            return (Criteria) this;
        }

        public Criteria andRoundPriceIsNull() {
            addCriterion("round_price is null");
            return (Criteria) this;
        }

        public Criteria andRoundPriceIsNotNull() {
            addCriterion("round_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoundPriceEqualTo(BigDecimal value) {
            addCriterion("round_price =", value, "roundPrice");
            return (Criteria) this;
        }

        public Criteria andRoundPriceNotEqualTo(BigDecimal value) {
            addCriterion("round_price <>", value, "roundPrice");
            return (Criteria) this;
        }

        public Criteria andRoundPriceGreaterThan(BigDecimal value) {
            addCriterion("round_price >", value, "roundPrice");
            return (Criteria) this;
        }

        public Criteria andRoundPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("round_price >=", value, "roundPrice");
            return (Criteria) this;
        }

        public Criteria andRoundPriceLessThan(BigDecimal value) {
            addCriterion("round_price <", value, "roundPrice");
            return (Criteria) this;
        }

        public Criteria andRoundPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("round_price <=", value, "roundPrice");
            return (Criteria) this;
        }

        public Criteria andRoundPriceIn(List<BigDecimal> values) {
            addCriterion("round_price in", values, "roundPrice");
            return (Criteria) this;
        }

        public Criteria andRoundPriceNotIn(List<BigDecimal> values) {
            addCriterion("round_price not in", values, "roundPrice");
            return (Criteria) this;
        }

        public Criteria andRoundPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("round_price between", value1, value2, "roundPrice");
            return (Criteria) this;
        }

        public Criteria andRoundPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("round_price not between", value1, value2, "roundPrice");
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
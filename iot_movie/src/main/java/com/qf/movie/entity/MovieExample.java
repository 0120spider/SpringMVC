package com.qf.movie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieExample() {
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

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMoviePicIsNull() {
            addCriterion("movie_pic is null");
            return (Criteria) this;
        }

        public Criteria andMoviePicIsNotNull() {
            addCriterion("movie_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMoviePicEqualTo(String value) {
            addCriterion("movie_pic =", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicNotEqualTo(String value) {
            addCriterion("movie_pic <>", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicGreaterThan(String value) {
            addCriterion("movie_pic >", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicGreaterThanOrEqualTo(String value) {
            addCriterion("movie_pic >=", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicLessThan(String value) {
            addCriterion("movie_pic <", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicLessThanOrEqualTo(String value) {
            addCriterion("movie_pic <=", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicLike(String value) {
            addCriterion("movie_pic like", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicNotLike(String value) {
            addCriterion("movie_pic not like", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicIn(List<String> values) {
            addCriterion("movie_pic in", values, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicNotIn(List<String> values) {
            addCriterion("movie_pic not in", values, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicBetween(String value1, String value2) {
            addCriterion("movie_pic between", value1, value2, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicNotBetween(String value1, String value2) {
            addCriterion("movie_pic not between", value1, value2, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMovieStartIsNull() {
            addCriterion("movie_start is null");
            return (Criteria) this;
        }

        public Criteria andMovieStartIsNotNull() {
            addCriterion("movie_start is not null");
            return (Criteria) this;
        }

        public Criteria andMovieStartEqualTo(Date value) {
            addCriterion("movie_start =", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartNotEqualTo(Date value) {
            addCriterion("movie_start <>", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartGreaterThan(Date value) {
            addCriterion("movie_start >", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartGreaterThanOrEqualTo(Date value) {
            addCriterion("movie_start >=", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartLessThan(Date value) {
            addCriterion("movie_start <", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartLessThanOrEqualTo(Date value) {
            addCriterion("movie_start <=", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartIn(List<Date> values) {
            addCriterion("movie_start in", values, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartNotIn(List<Date> values) {
            addCriterion("movie_start not in", values, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartBetween(Date value1, Date value2) {
            addCriterion("movie_start between", value1, value2, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartNotBetween(Date value1, Date value2) {
            addCriterion("movie_start not between", value1, value2, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieEndIsNull() {
            addCriterion("movie_end is null");
            return (Criteria) this;
        }

        public Criteria andMovieEndIsNotNull() {
            addCriterion("movie_end is not null");
            return (Criteria) this;
        }

        public Criteria andMovieEndEqualTo(Date value) {
            addCriterion("movie_end =", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndNotEqualTo(Date value) {
            addCriterion("movie_end <>", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndGreaterThan(Date value) {
            addCriterion("movie_end >", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndGreaterThanOrEqualTo(Date value) {
            addCriterion("movie_end >=", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndLessThan(Date value) {
            addCriterion("movie_end <", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndLessThanOrEqualTo(Date value) {
            addCriterion("movie_end <=", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndIn(List<Date> values) {
            addCriterion("movie_end in", values, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndNotIn(List<Date> values) {
            addCriterion("movie_end not in", values, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndBetween(Date value1, Date value2) {
            addCriterion("movie_end between", value1, value2, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndNotBetween(Date value1, Date value2) {
            addCriterion("movie_end not between", value1, value2, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieLengthIsNull() {
            addCriterion("movie_length is null");
            return (Criteria) this;
        }

        public Criteria andMovieLengthIsNotNull() {
            addCriterion("movie_length is not null");
            return (Criteria) this;
        }

        public Criteria andMovieLengthEqualTo(Integer value) {
            addCriterion("movie_length =", value, "movieLength");
            return (Criteria) this;
        }

        public Criteria andMovieLengthNotEqualTo(Integer value) {
            addCriterion("movie_length <>", value, "movieLength");
            return (Criteria) this;
        }

        public Criteria andMovieLengthGreaterThan(Integer value) {
            addCriterion("movie_length >", value, "movieLength");
            return (Criteria) this;
        }

        public Criteria andMovieLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("movie_length >=", value, "movieLength");
            return (Criteria) this;
        }

        public Criteria andMovieLengthLessThan(Integer value) {
            addCriterion("movie_length <", value, "movieLength");
            return (Criteria) this;
        }

        public Criteria andMovieLengthLessThanOrEqualTo(Integer value) {
            addCriterion("movie_length <=", value, "movieLength");
            return (Criteria) this;
        }

        public Criteria andMovieLengthIn(List<Integer> values) {
            addCriterion("movie_length in", values, "movieLength");
            return (Criteria) this;
        }

        public Criteria andMovieLengthNotIn(List<Integer> values) {
            addCriterion("movie_length not in", values, "movieLength");
            return (Criteria) this;
        }

        public Criteria andMovieLengthBetween(Integer value1, Integer value2) {
            addCriterion("movie_length between", value1, value2, "movieLength");
            return (Criteria) this;
        }

        public Criteria andMovieLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("movie_length not between", value1, value2, "movieLength");
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
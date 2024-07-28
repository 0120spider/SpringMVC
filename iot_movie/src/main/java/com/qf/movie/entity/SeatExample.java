package com.qf.movie.entity;

import java.util.ArrayList;
import java.util.List;

public class SeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatExample() {
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

        public Criteria andSeatIdIsNull() {
            addCriterion("seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(Integer value) {
            addCriterion("seat_id =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(Integer value) {
            addCriterion("seat_id <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(Integer value) {
            addCriterion("seat_id >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_id >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(Integer value) {
            addCriterion("seat_id <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(Integer value) {
            addCriterion("seat_id <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<Integer> values) {
            addCriterion("seat_id in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<Integer> values) {
            addCriterion("seat_id not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(Integer value1, Integer value2) {
            addCriterion("seat_id between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_id not between", value1, value2, "seatId");
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

        public Criteria andSeatRowIsNull() {
            addCriterion("seat_row is null");
            return (Criteria) this;
        }

        public Criteria andSeatRowIsNotNull() {
            addCriterion("seat_row is not null");
            return (Criteria) this;
        }

        public Criteria andSeatRowEqualTo(Integer value) {
            addCriterion("seat_row =", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotEqualTo(Integer value) {
            addCriterion("seat_row <>", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowGreaterThan(Integer value) {
            addCriterion("seat_row >", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_row >=", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowLessThan(Integer value) {
            addCriterion("seat_row <", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowLessThanOrEqualTo(Integer value) {
            addCriterion("seat_row <=", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowIn(List<Integer> values) {
            addCriterion("seat_row in", values, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotIn(List<Integer> values) {
            addCriterion("seat_row not in", values, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowBetween(Integer value1, Integer value2) {
            addCriterion("seat_row between", value1, value2, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_row not between", value1, value2, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatClounmIsNull() {
            addCriterion("seat_clounm is null");
            return (Criteria) this;
        }

        public Criteria andSeatClounmIsNotNull() {
            addCriterion("seat_clounm is not null");
            return (Criteria) this;
        }

        public Criteria andSeatClounmEqualTo(Integer value) {
            addCriterion("seat_clounm =", value, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatClounmNotEqualTo(Integer value) {
            addCriterion("seat_clounm <>", value, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatClounmGreaterThan(Integer value) {
            addCriterion("seat_clounm >", value, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatClounmGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_clounm >=", value, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatClounmLessThan(Integer value) {
            addCriterion("seat_clounm <", value, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatClounmLessThanOrEqualTo(Integer value) {
            addCriterion("seat_clounm <=", value, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatClounmIn(List<Integer> values) {
            addCriterion("seat_clounm in", values, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatClounmNotIn(List<Integer> values) {
            addCriterion("seat_clounm not in", values, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatClounmBetween(Integer value1, Integer value2) {
            addCriterion("seat_clounm between", value1, value2, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatClounmNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_clounm not between", value1, value2, "seatClounm");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIsNull() {
            addCriterion("seat_type is null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIsNotNull() {
            addCriterion("seat_type is not null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeEqualTo(Integer value) {
            addCriterion("seat_type =", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotEqualTo(Integer value) {
            addCriterion("seat_type <>", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeGreaterThan(Integer value) {
            addCriterion("seat_type >", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_type >=", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeLessThan(Integer value) {
            addCriterion("seat_type <", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("seat_type <=", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIn(List<Integer> values) {
            addCriterion("seat_type in", values, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotIn(List<Integer> values) {
            addCriterion("seat_type not in", values, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeBetween(Integer value1, Integer value2) {
            addCriterion("seat_type between", value1, value2, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_type not between", value1, value2, "seatType");
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
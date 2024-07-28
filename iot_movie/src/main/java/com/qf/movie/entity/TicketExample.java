package com.qf.movie.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andTicketIdIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(Integer value) {
            addCriterion("ticket_id =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(Integer value) {
            addCriterion("ticket_id <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(Integer value) {
            addCriterion("ticket_id >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_id >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(Integer value) {
            addCriterion("ticket_id <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_id <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<Integer> values) {
            addCriterion("ticket_id in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<Integer> values) {
            addCriterion("ticket_id not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id not between", value1, value2, "ticketId");
            return (Criteria) this;
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

        public Criteria andTicketRowIsNull() {
            addCriterion("ticket_row is null");
            return (Criteria) this;
        }

        public Criteria andTicketRowIsNotNull() {
            addCriterion("ticket_row is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRowEqualTo(Integer value) {
            addCriterion("ticket_row =", value, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketRowNotEqualTo(Integer value) {
            addCriterion("ticket_row <>", value, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketRowGreaterThan(Integer value) {
            addCriterion("ticket_row >", value, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_row >=", value, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketRowLessThan(Integer value) {
            addCriterion("ticket_row <", value, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketRowLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_row <=", value, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketRowIn(List<Integer> values) {
            addCriterion("ticket_row in", values, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketRowNotIn(List<Integer> values) {
            addCriterion("ticket_row not in", values, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketRowBetween(Integer value1, Integer value2) {
            addCriterion("ticket_row between", value1, value2, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketRowNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_row not between", value1, value2, "ticketRow");
            return (Criteria) this;
        }

        public Criteria andTicketClounmIsNull() {
            addCriterion("ticket_clounm is null");
            return (Criteria) this;
        }

        public Criteria andTicketClounmIsNotNull() {
            addCriterion("ticket_clounm is not null");
            return (Criteria) this;
        }

        public Criteria andTicketClounmEqualTo(Integer value) {
            addCriterion("ticket_clounm =", value, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketClounmNotEqualTo(Integer value) {
            addCriterion("ticket_clounm <>", value, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketClounmGreaterThan(Integer value) {
            addCriterion("ticket_clounm >", value, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketClounmGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_clounm >=", value, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketClounmLessThan(Integer value) {
            addCriterion("ticket_clounm <", value, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketClounmLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_clounm <=", value, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketClounmIn(List<Integer> values) {
            addCriterion("ticket_clounm in", values, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketClounmNotIn(List<Integer> values) {
            addCriterion("ticket_clounm not in", values, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketClounmBetween(Integer value1, Integer value2) {
            addCriterion("ticket_clounm between", value1, value2, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketClounmNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_clounm not between", value1, value2, "ticketClounm");
            return (Criteria) this;
        }

        public Criteria andTicketStatusIsNull() {
            addCriterion("ticket_status is null");
            return (Criteria) this;
        }

        public Criteria andTicketStatusIsNotNull() {
            addCriterion("ticket_status is not null");
            return (Criteria) this;
        }

        public Criteria andTicketStatusEqualTo(String value) {
            addCriterion("ticket_status =", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotEqualTo(String value) {
            addCriterion("ticket_status <>", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusGreaterThan(String value) {
            addCriterion("ticket_status >", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_status >=", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusLessThan(String value) {
            addCriterion("ticket_status <", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusLessThanOrEqualTo(String value) {
            addCriterion("ticket_status <=", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusLike(String value) {
            addCriterion("ticket_status like", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotLike(String value) {
            addCriterion("ticket_status not like", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusIn(List<String> values) {
            addCriterion("ticket_status in", values, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotIn(List<String> values) {
            addCriterion("ticket_status not in", values, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusBetween(String value1, String value2) {
            addCriterion("ticket_status between", value1, value2, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotBetween(String value1, String value2) {
            addCriterion("ticket_status not between", value1, value2, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
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
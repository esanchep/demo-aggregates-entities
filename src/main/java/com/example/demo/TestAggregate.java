package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@ToString
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "TEST")
public class TestAggregate {

    private Id id;
    private Name name;

    public void setId(final Integer id) {
        this.id = new Id(id);
    }

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getId() {
        if (null == this.id) {
            return null;
        }
        return this.id.getId();
    }

    public void setName(final String name) {
        this.name = new Name(name);
    }

    public String getName() {
        return this.name.getName();
    }

    public static TestAggregateBuilder builder() {
        return new TestAggregateBuilder();
    }

    public static class TestAggregateBuilder {
        private Id id;
        private Name name;

        public TestAggregateBuilder id(final Integer id) {
            this.id = new Id(id);
            return this;
        }

        public TestAggregateBuilder name(final String name) {
            this.name = new Name(name);
            return this;
        }

        public TestAggregate build() {
            return new TestAggregate(id, name);
        }
    }

}

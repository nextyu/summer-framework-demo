package com.nextyu.demo.test;

import lombok.Data;

/**
 * created on 2017-06-29 18:11
 *
 * @author nextyu
 */
public class Person {
    public Long id;
    private Boolean isOut;

    private Person left;
    private Person right;

    public Person() {
    }

    public Person(Long id, Boolean isOut) {
        this.id = id;
        this.isOut = isOut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsOut() {
        return isOut;
    }

    public void setIsOut(Boolean isOut) {
        this.isOut = isOut;
    }

    public Person getLeft() {
        return left;
    }

    public void setLeft(Person left) {
        this.left = left;
    }

    public Person getRight() {
        return right;
    }

    public void setRight(Person right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", isOut=" + isOut +
                ", left=" + left.getId() +
                ", right=" + right.getId() +
                '}';
    }
}

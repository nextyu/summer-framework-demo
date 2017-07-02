package com.nextyu.demo.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created on 2017-06-29 18:11
 *
 * @author nextyu
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    public Long id;
    private Boolean isOut;

    private Person left;
    private Person right;


    public Person(Long id, Boolean isOut) {
        this.id = id;
        this.isOut = isOut;
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

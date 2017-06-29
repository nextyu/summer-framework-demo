package com.nextyu.demo.test;

import com.nextyu.summer.framework.util.ClassUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * created on 2017-06-23 14:20
 *
 * @author nextyu
 */
public class MyTest {

    @Test
    public void test() {
        Class<?> aClass = ClassUtil.loadClass("com.nextyu.summer.framework.helper.ClassHelper");
        System.out.println(aClass);
    }

    @Test
    public void test2() {
        int quantity = 6;
        List<Person> people = new ArrayList<>(quantity);
        for (long i = 0; i < quantity; i++) {
            Person person = new Person(i, false);
            people.add(person);
        }

        test23(people, quantity);

        for (Person person : people) {
            System.out.println(person);
        }

    }

    private void test24(List<Person> people, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Person person = people.get(i);
            int rightChance = quantity - 3;
            if (null != person.getRight() || null != person.getLeft()) {
                rightChance -= 1;
            }

        }
    }


    private void test23(List<Person> people, int quantity) {
        int jump = 2;
        for (int i = 0; i < quantity; i++) {
            Person p = people.get(i);
            int left;
            int right;

            if (i == 0) {
                left = quantity - 1;
                right = +1;
            } else if (i == quantity - 1) {
                left = i - 1;
                right = 0;
            } else {
                left = i - 1;
                right = i + 1;
            }


            for (Person person : people) {
                Long id = person.getId();
                if (p.getId().longValue() != id && left != id
                        && right != id) {

                    if (null == p.getLeft() || null == person.getRight()) {
                        if (null == p.getRight() && null == person.getLeft()) {
                            p.setRight(person);
                            person.setLeft(p);
                            break;
                        }
                    } else {
                        if (p.getLeft().getId() != person.getId()) {
                            p.setRight(person);
                            person.setLeft(p);
                            break;
                        }
                    }


                }
            }


//            System.out.println(i + "--" + left + "--" + right);
            // System.out.println(p);

        }
    }

    private void test22(List<Person> people, int quantity) {
        int jump = 2;
        for (int i = 0; i < quantity; i++) {


            int left = i - jump;
            if (left < 0) {
                left += quantity;
            }

            int right = i + jump;
            if (right >= quantity) {
                right -= quantity;
            }

            System.out.println(i + "--" + left + "--" + right);

        }
    }

    private void test21(List<Person> people, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Person person = people.get(i);
            Person left;
            Person right;
            if (i == 0) {
                left = people.get(quantity - 1);
                right = people.get(i + 1);
            } else if (i == quantity - 1) {
                left = people.get(i - 1);
                right = people.get(0);
            } else {
                left = people.get(i - 1);
                right = people.get(i + 1);
            }

            person.setLeft(left);
            person.setRight(right);

            System.out.println(person);
        }
    }
}

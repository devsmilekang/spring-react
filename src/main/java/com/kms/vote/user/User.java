package com.kms.vote.user;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Greg Turnquist
 */
// tag::code[]

@Entity // <1>
public class User {

    private @Id @GeneratedValue Long id; // <2>
    private String nickname;
    private int age;
    private Gender gender;
    private String email;

    public enum Gender {
        M, N
    }

    private User() {
    }

    public User(String nickname, int age, Gender gender, String email) {
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(nickname, user.nickname)
                && Objects.equals(gender, user.gender) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nickname, gender, email);
    }

    @Override
    public String toString() {
        /*
         * return "Employee{" + "id=" + id + ", firstName='" + firstName + '\'' + ",
         * lastName='" + lastName + '\'' + ", description='" + description + '\'' + }';
         */
        return id.toString();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
// end::code[]
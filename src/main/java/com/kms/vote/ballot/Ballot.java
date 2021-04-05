package com.kms.vote.ballot;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ballot {
    private @Id @GeneratedValue Long id;
    private Date startDate;
    private Date endDate;
    private String contents;

    private Ballot() {
    }

    public Ballot(Date startDate, Date endDate, String contents) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Ballot ballot = (Ballot) o;
        return Objects.equals(id, ballot.id) && Objects.equals(startDate, ballot.startDate)
                && Objects.equals(endDate, ballot.endDate) && Objects.equals(contents, ballot.contents);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, startDate, endDate, contents);
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

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
package com.unibook.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    private String person_name_ua;
    private String person_name_eng;
    private String person_surname_ua;
    private String person_surname_eng;
    private LocalDate person_birthday;
    private String person_phone;
    private String person_email;
    private String person_address_ua;
    private String person_address_eng;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerson_name_ua() {
        return person_name_ua;
    }

    public void setPerson_name_ua(String person_name_ua) {
        this.person_name_ua = person_name_ua;
    }

    public String getPerson_name_eng() {
        return person_name_eng;
    }

    public void setPerson_name_eng(String person_name_eng) {
        this.person_name_eng = person_name_eng;
    }

    public String getPerson_surname_ua() {
        return person_surname_ua;
    }

    public void setPerson_surname_ua(String person_surname_ua) {
        this.person_surname_ua = person_surname_ua;
    }

    public String getPerson_surname_eng() {
        return person_surname_eng;
    }

    public void setPerson_surname_eng(String person_surname_eng) {
        this.person_surname_eng = person_surname_eng;
    }

    public LocalDate getPerson_birthday() {
        return person_birthday;
    }

    public void setPerson_birthday(LocalDate person_birthday) {
        this.person_birthday = person_birthday;
    }

    public String getPerson_phone() {
        return person_phone;
    }

    public void setPerson_phone(String person_phone) {
        this.person_phone = person_phone;
    }

    public String getPerson_email() {
        return person_email;
    }

    public void setPerson_email(String person_email) {
        this.person_email = person_email;
    }

    public String getPerson_address_ua() {
        return person_address_ua;
    }

    public void setPerson_address_ua(String person_address_ua) {
        this.person_address_ua = person_address_ua;
    }

    public String getPerson_address_eng() {
        return person_address_eng;
    }

    public void setPerson_address_eng(String person_address_eng) {
        this.person_address_eng = person_address_eng;
    }
}

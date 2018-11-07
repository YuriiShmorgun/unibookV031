package com.unibook.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubjectType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subject_type_name_ua;
    private String subject_type_name_eng;

    public SubjectType() {
    }

    public SubjectType(String subject_type_name_ua, String subject_type_name_eng) {
        this.subject_type_name_ua = subject_type_name_ua;
        this.subject_type_name_eng = subject_type_name_eng;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject_type_name_ua() {
        return subject_type_name_ua;
    }

    public void setSubject_type_name_ua(String subject_type_name_ua) {
        this.subject_type_name_ua = subject_type_name_ua;
    }

    public String getSubject_type_name_eng() {
        return subject_type_name_eng;
    }

    public void setSubject_type_name_eng(String subject_type_name_eng) {
        this.subject_type_name_eng = subject_type_name_eng;
    }
}

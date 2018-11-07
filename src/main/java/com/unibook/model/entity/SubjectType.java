package com.unibook.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class SubjectType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subjectTypeNameUa;
    private String subjectTypeNameEng;
    private String subjectTypeNameShortUa;
    private String subjectTypeNameShortEng;

    public SubjectType() {
    }

    public SubjectType(String subjectTypeNameUa, String subjectTypeNameEng, String subjectTypeNameShortUa, String subjectTypeNameShortEng) {
        this.subjectTypeNameUa = subjectTypeNameUa;
        this.subjectTypeNameEng = subjectTypeNameEng;
        this.subjectTypeNameShortUa = subjectTypeNameShortUa;
        this.subjectTypeNameShortEng = subjectTypeNameShortEng;
    }

    public Long getId() {
        return id;
    }
}

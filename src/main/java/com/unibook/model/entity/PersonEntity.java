package com.unibook.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@Setter
public abstract class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private LocalDate birthDay;

    public PersonEntity() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonEntity)) return false;
        PersonEntity that = (PersonEntity) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(birthDay, that.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDay);
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}

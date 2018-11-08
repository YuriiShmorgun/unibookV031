package com.unibook.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@ToString(exclude = {"id"})
@EqualsAndHashCode(exclude = {"id"})
@NoArgsConstructor
@AllArgsConstructor
public class Faculty implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Long id;
    @Column(name = "faculty_name_ua", unique = true, length = 60, nullable = false)
    private String facultyNameUa;
    @Column(name = "faculty_name_eng", unique = true, length = 60, nullable = false)
    private String facultyNameEng;
}

package com.unibook.model.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = {"login", "password"})
@ToString(exclude = {"password"})
public class Security {

    @Id
    @Column(name = "login", unique = true, length = 50, nullable = false)
    private String login;
    @Column(name = "password",unique = true, length = 50, nullable = false)
    private String password;
}

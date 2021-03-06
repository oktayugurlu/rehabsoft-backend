package com.hacettepe.rehabsoft.entity;


import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "idgen", sequenceName = "roles_seq", initialValue = 1, allocationSize = 1)
public class Role extends BaseEntity {

    //Her role bir id'ye sahip: Simdilik iki ana rol var: Fizyoterapist ve Hasta


    @Column(name = "role_name", unique=true)
    private String name;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "role")
    private Collection<User> users;
}

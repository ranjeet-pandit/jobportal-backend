package com.ranjeet.jobportal.company.entity;

import com.ranjeet.jobportal.entity.BaseEntity;
import com.ranjeet.jobportal.entity.Job;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="companies")
@Getter
@Setter

public class Company extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    private Long id;


    @Column(name = "NAME", nullable=false, unique=true)
    private String name;

    @Column(name="LOGO", nullable=false, length = 500)
    private String logo;
    @Column(name="INDUSTRY", nullable=false, length = 100)
    private String industry;
    @Column(name="SIZE", nullable=false, length = 50)
    private String size;
    @Column(name="RATING", nullable=false, precision =  3, scale = 2)
    private BigDecimal rating;
    @Column(name = "EMPLOYEES")
    private Integer employees;
    @Column(name="FOUNDED", nullable=false)
    private Integer founded;

    @Column(name = "LOCATIONS", nullable = false)
    private String locations;
    @Lob
    @Column(name="DESCRIPTION")
    private String description;

    @Column(name = "WEBSITE",length=500)
    private String website;


    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Job> jobs = new ArrayList<>();

}

package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Entity
@Table(name = "base")
public class Base {
    @Id
    @Column(name = "base_id")
    private String id;
    @Column(name = "base_name")
    private String name;
    @Column(name = "base_description")
    private String description;
    @Column(name = "base_objectTypeId")
    private String objectTypeId;
    @Column(name = "base_customerId")
    private String customerId;
    @Column(name = "base_parentId")
    private String parentId;
}

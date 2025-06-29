package com.simplehrms.classes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.simplehrms.common.Auditable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Entity
@Getter
@Setter
@Table(name = "classes")
public class Class extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @NotNull
    @Length(min = 2, max = 50)
    private String name;

    @Length(min = 2, max = 200)
    private String description;
}
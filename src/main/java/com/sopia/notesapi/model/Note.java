package com.sopia.notesapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity //mark the class as a persistent Java class.
@Table(name = "notes")//provide the details of the table that this entity will be mapped to
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
/*NB: @JsonIgnoreProperties annotation is a Jackson annotation. Spring Boot uses Jackson for Serializing and Deserializing
Java objects to and from JSON
This annotation is used because we don’t want the clients of the rest api to supply the createdAt and updatedAt values.
If they supply these values then we’ll simply ignore them. However, we’ll include these values in the JSON response*/
public class Note implements Serializable {

    @Id //define the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define the primary key generation strategy
    private Long id;

    @NotBlank //validate that the annotated field is not null or empty
    private String title;

    @NotBlank //validate that the annotated field is not null or empty
    private String content;

    @Column(nullable = false, updatable = false)  /*define the properties of the column that
    will be mapped to the annotated field.
     */
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt; /*NB: a field named createdAt is mapped to a column named created_at
    in the database table. i.e. all camel cases are replaced with underscores*/

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) /*converts the date and time values from Java Object to compatible
     database type and vice versa.*/
    @LastModifiedDate
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

package com.sanghyun.api.todo.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity(name = "todo")
@DynamicInsert
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Integer userId;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer state;

    @ColumnDefault("null")
    private Date completeDated;

    @Column(nullable = false)
    @ColumnDefault("now()")
    private Date regDated;
}

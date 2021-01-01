package com.spring.mongodb.springmongodbdemo.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
//@Document(collection = "users")
@AllArgsConstructor
@Getter
@Setter
public class Users {

    @Id
    private Integer id;

    private String name;

    private String teamName;

    private Long salary;


}

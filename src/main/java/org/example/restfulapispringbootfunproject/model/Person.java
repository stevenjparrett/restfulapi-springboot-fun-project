package org.example.restfulapispringbootfunproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Person {
    private int id;
    private String name;
    private int age;

}

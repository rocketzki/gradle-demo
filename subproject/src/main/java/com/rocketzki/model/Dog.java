package com.rocketzki.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
public class Dog {
    private String name;
    private int age;
}

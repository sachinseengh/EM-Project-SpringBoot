package com.example.EMProject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private String email;

    // public void setName(String name) {
    //     this.name = name;
    // }
    // public void setEmail(String email) {
    //     this.email = email;
    // }
}

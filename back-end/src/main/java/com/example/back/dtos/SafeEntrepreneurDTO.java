package com.example.back.dtos;

import com.example.back.model.Entrepreneur;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SafeEntrepreneurDTO {


    private long id;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Entrepreneur toEntity(){
        Entrepreneur entrepreneur = new Entrepreneur();
        entrepreneur.setId(this.id);
        entrepreneur.setName(this.name);
        entrepreneur.setLastName(this.lastName);
        entrepreneur.setEmail(this.email);
        entrepreneur.setPhoneNumber(this.phoneNumber);
        return entrepreneur;
    }

}

package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.entities.User;

public class UserInsertDTO extends UserDTO {
    
    private String password;

    public UserInsertDTO (){}

    public UserInsertDTO(User entity) {
        super(entity);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
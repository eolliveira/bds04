package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.entities.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserDTO implements Serializable {

    private Long id;

    @NotBlank(message = "Email não pode ser vazio")
    private String email;

    @NotEmpty(message = "Usuário deve conter um Perfil")
    public List<RoleDTO> roles = new ArrayList<>();

    public UserDTO (){}

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.email = entity.getEmail();
        entity.getRoles().forEach(role -> roles.add(new RoleDTO(role)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<RoleDTO> getRoles() {
        return roles;
    }

}
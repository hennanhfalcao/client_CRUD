package com.devsuperior.clientcrud.dto;

import com.devsuperior.clientcrud.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

public class ClientDTO {


    private Long id;

    @NotBlank(message = "Nome não pode ser vazio")
    private String name;

    private String cpf;

    private Double income;

    @PastOrPresent(message = "A data de nascimento não pode ser uma data futura")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Client entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}

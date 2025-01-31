package com.devsuperior.clientcrud.dto;

import com.devsuperior.clientcrud.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class ClientDTO {


    private Long id;

    @NotBlank(message = "Nome não pode ser vazio")
    private String name;

    private String cpf;

    @PositiveOrZero(message = "A renda deve ser maior que zero")
    private Double income;

    @PastOrPresent(message = "A data de nascimento não pode ser uma data futura")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
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

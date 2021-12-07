package com.canturet.diabetestrackingsystemws.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tests")
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "'userId' alanı zorunludur.")
    private Long userId;

    @NotBlank(message = "'diabetesType' alanı zorunludur.")
    @Size(max = 20, message = "'diabetesType' alanı maksimum 20 karakterden oluşabilir.")
    private String diabetesType;

    private int glucose;

    private int diastolicBloodPressure;

    private int highBloodPressure;

    private String result;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime createdDate;
}

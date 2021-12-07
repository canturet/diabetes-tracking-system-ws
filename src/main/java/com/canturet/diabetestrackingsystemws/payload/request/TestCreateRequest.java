package com.canturet.diabetestrackingsystemws.payload.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
public class TestCreateRequest {
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
    private LocalDateTime createdDate = LocalDateTime.now();
}

package ru.smartcampus.smartcampus.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Data
public class ResponseDTO {

    private UUID id;

    private String text;

    private UUID intentId;

}

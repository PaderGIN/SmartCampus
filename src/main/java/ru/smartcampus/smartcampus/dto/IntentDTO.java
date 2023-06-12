package ru.smartcampus.smartcampus.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Data
public class IntentDTO {

    private UUID id;

    private String tag;

    private List<String> patterns;

    private List<String> responses;

    private List<String> contexts;

}
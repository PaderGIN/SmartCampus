package ru.smartcampus.smartcampus.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.smartcampus.smartcampus.interfaces.ModelService;

import java.net.URI;

@Service
public class ModelSrviceImpl implements ModelService {

    private final RestTemplate restTemplate;
    URI studUrl = URI.create("http://localhost:8000/stud");
    URI askUrl = URI.create("http://localhost:8000/answer?question=");

    public ModelSrviceImpl(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    @Override
    public void study() {
        restTemplate.getForObject(studUrl, void.class);
    }

    @Override
    public String getAnswer(String question) {
        return restTemplate.getForObject(askUrl+question, String.class);
    }
}

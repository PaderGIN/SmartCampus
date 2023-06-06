package ru.smartcampus.smartcampus.services;

import org.springframework.stereotype.Service;
import ru.smartcampus.smartcampus.dto.QuoteDto;
import ru.smartcampus.smartcampus.repositories.QuotesRepository;

import java.util.List;

@Service
public class QuotesService {

    private QuotesRepository quotesRepository;
    private QuotesMapper quotesMapper;


    public List<QuoteDto> findAllQuotes() {

        return quotesRepository.findAllQuotes();
    }
}

package ru.smartcampus.smartcampus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.smartcampus.smartcampus.dto.QuoteDto;

import java.util.List;
import java.util.UUID;


public interface QuotesRepository extends JpaRepository<UUID, QuoteDto> {

    List<QuoteDto> findAllQuotes();
}

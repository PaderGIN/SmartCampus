package ru.smartcampus.smartcampus.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.smartcampus.smartcampus.dto.QuoteDto;
import ru.smartcampus.smartcampus.services.QuotesService;
import ru.smartcampus.smartcampus.services.UserService;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final QuotesService quotesService;

    @GetMapping("/board")
    public String adminBoard(Model model) {
        List<QuoteDto> quotes = quotesService.findAllQuotes();
        model.addAttribute("quotes", quotes);
        return "board";
    }

    @PostMapping("/createQuote")
    public String createQuote(Model model,
                              @RequestParam("tag") String tag,
                              @RequestParam("patterns") List<String> patterns,
                              @RequestParam("responses") List<String> responses) {
        QuoteDto quoteDto = QuoteDto.builder()
                .tag(tag)
                .patterns(patterns)
                .responses(responses).build();

        quotesService.saveQuote(quoteDto);
        return "redirect:/board";
    }

//    @GetMapping("/studModel")
//    public String studModel(Model model) {
//        //TODO: fetch http://127.0.0.1:8000/stud
//
//        return "redirect:/board";
//    }

    @GetMapping("/tmp")
    public String tmp(Model model) {
        System.out.println(quotesService.getQuote(UUID.fromString("4626258f-87a5-49a7-ac66-ab3f5fcdc194")));
        return null;
    }
}
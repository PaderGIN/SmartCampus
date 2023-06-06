package ru.smartcampus.smartcampus.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.smartcampus.smartcampus.entity.Quote;
import ru.smartcampus.smartcampus.services.QuotesService;
import ru.smartcampus.smartcampus.services.UserService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final QuotesService quotesService;

    @GetMapping("/board")
    public String adminBoard(Model model){
        List<Quote> quotes = quotesService.findAllQuotes();
        model.addAttribute("quotes", quotes);
        return "board";
    }



}
//    @GetMapping("/table")
//    public String getTable(Model model) {
//        List<MyEntity> entities = repository.findAll();
//        model.addAttribute("entities", entities);
//        return "table";
//    }
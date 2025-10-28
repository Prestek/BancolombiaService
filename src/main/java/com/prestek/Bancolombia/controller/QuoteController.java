package com.prestek.Bancolombia.controller;


import com.prestek.Bancolombia.service.AbstractWeightedQuoteService;
import com.prestek.Bancolombia.dto.QuoteDto;
import com.prestek.Bancolombia.request.QuoteRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quotes")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "*")
public class QuoteController {
    private final AbstractWeightedQuoteService service;


    @PostMapping
    public QuoteDto quote(@RequestBody QuoteRequest req) {
        return service.quote(req);
    }
}

package com.prestek.Bancolombia.base;

import com.prestek.Bancolombia.dto.QuoteDto;
import com.prestek.Bancolombia.request.QuoteRequest;

public interface QuoteProvider {
    String code();                    // Identificador del banco
    QuoteDto quote(QuoteRequest req);// Calcula la cotización
}
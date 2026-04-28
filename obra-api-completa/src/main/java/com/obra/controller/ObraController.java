package com.obra.controller;

import org.springframework.web.bind.annotation.*;
import com.obra.dto.*;
import com.obra.service.ObraService;

@RestController
@RequestMapping("/api/obra")
public class ObraController {

    private final ObraService service;

    public ObraController(ObraService service) {
        this.service = service;
    }

    @PostMapping("/concreto")
    public ApiResponse<Double> calcularConcreto(@RequestBody ConcretoDTO dto) {
        double result = service.calcularConcreto(dto);
        return new ApiResponse<>(true, "Volume calculado com sucesso", result);
    }

    @PostMapping("/tijolos")
    public ApiResponse<Double> calcularTijolos(@RequestBody TijoloDTO dto) {
        double result = service.calcularTijolos(dto);
        return new ApiResponse<>(true, "Quantidade calculada com sucesso", result);
    }
}

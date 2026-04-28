package com.obra.service;

import org.springframework.stereotype.Service;
import com.obra.dto.*;

@Service
public class ObraService {

    public double calcularConcreto(ConcretoDTO dto) {
        double total = 0;
        for (var p : dto.paredes) {
            total += dto.largura * dto.altura * p.comprimento;
        }
        return total;
    }

    public double calcularTijolos(TijoloDTO dto) {
        double area = 0;
        for (var p : dto.paredes) {
            area += p.altura * p.comprimento;
        }
        double areaTijolo = dto.tijolo.altura * dto.tijolo.largura;
        return area / areaTijolo;
    }
}

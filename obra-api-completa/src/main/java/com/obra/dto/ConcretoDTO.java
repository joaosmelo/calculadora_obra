package com.obra.dto;

import java.util.List;

public class ConcretoDTO {
    public double altura;
    public double largura;
    public List<ParedeDTO> paredes;

    public static class ParedeDTO {
        public double comprimento;
    }
}

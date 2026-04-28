package com.obra.dto;

import java.util.List;

public class TijoloDTO {
    public List<ParedeDTO> paredes;
    public Tijolo tijolo;

    public static class ParedeDTO {
        public double altura;
        public double comprimento;
    }

    public static class Tijolo {
        public double altura;
        public double largura;
    }
}

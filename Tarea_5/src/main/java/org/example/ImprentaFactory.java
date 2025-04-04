package org.example;

public class ImprentaFactory {
    public static Imprenta getImprenta(int id) {
        return switch (id) {
            case Imprenta.libro_cementerio_de_animales ->
                    new Libros(374, "Cementerio de animales", "Stephen King", "De Bolsillo", 300);
            case Imprenta.libro_la_naranja_mecanica ->
                    new Libros(256, "La naranja mecanica", "Anthony Burgess", "Anagrama", 150);
            case Imprenta.libro_los_hijos_de_hurin ->
                    new Libros(352, "Los hijos de hurin", "J.R.R Tolkien", "Minotauro", 400);
            case Imprenta.periodico_la_jornada -> new Periodicos(32, "La Jornada", 04, 04, 2025, 15);
            case Imprenta.periodico_new_york_times -> new Periodicos(45, "New York Times", 03, 04, 2025, 40);
            case Imprenta.periodico_el_metro -> new Periodicos(42, "El metro", 02, 04, 2025, 10);
            case Imprenta.revista_national_geographic ->
                    new Revistas("National Geographic", "Nathan Lump", "Ciencia y aventura", 2024, 300);
            case Imprenta.revista_time ->
                    new Revistas("Time", "Edward Felsenthal", "Política, economía, ciencia", 2025, 350);
            case Imprenta.revista_vogue -> new Revistas("Vogue", "Anna Wintour", "Moda", 2025, 400);
            default -> null;
        };
    }
}
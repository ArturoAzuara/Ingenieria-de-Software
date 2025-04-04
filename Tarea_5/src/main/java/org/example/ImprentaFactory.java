package org.example;

public class ImprentaFactory {
    public static Imprenta getImprenta(int id) {
        return switch (id) {
            case Imprenta.LIBRO_CEMENTERIO_DE_ANIMALES ->
                    new Libros(374, "Cementerio de animales", "Una historia aterradora sobre la vida después de la muerte.", "Stephen King", 300, 300);
            case Imprenta.LIBRO_LA_NARANJA_MECANICA ->
                    new Libros(256, "La naranja mecanica", "Una novela distópica sobre la violencia y el control social.", "Anthony Burgess", 150, 150);
            case Imprenta.LIBRO_LOS_HIJOS_DE_HURIN ->
                    new Libros(352, "Los hijos de hurin", "Un relato épico de la obra de Tolkien sobre el destino trágico de los héroes.", "J.R.R Tolkien", 400, 400);
            case Imprenta.PERIODICO_LA_JORNADA -> new Periodicos(32, "La Jornada", "04/04/2025", 15);
            case Imprenta.PERIODICO_NEW_YORK_TIMES -> new Periodicos(45, "New York Times", "03/04/2025", 40);
            case Imprenta.PERIODICO_EL_METRO -> new Periodicos(42, "El metro", "02/04/2025", 10);
            case Imprenta.REVISTA_NATIONAL_GEOGRAPHIC ->
                    new Revistas(12345, "National Geographic", 2024, 300, "Mensual");
            case Imprenta.REVISTA_TIME ->
                    new Revistas(67890, "Time", 2025, 350, "Semanal");
            case Imprenta.REVISTA_VOGUE -> new Revistas(11121, "Vogue", 2025, 400, "Mensual");
            default -> throw new IllegalArgumentException("ID de producto no válido: " + id);
        };
    }
}
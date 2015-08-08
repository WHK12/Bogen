/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogen;

/**
 *
 * @author Werner
 */
public enum Klasse {

    HOLZPFEIL_KLASSE,
    KUNSTSTOFF_UND_METALL_KLASSE,
    PRIMITIVE_KLASSE,
    REITERBOGEN_KLASSE,
    OFFENE_KLASSE;

    public String toString() {
        switch (this) {
            case HOLZPFEIL_KLASSE:
                return "Holzpfeilklasse";
            case KUNSTSTOFF_UND_METALL_KLASSE:
                return "Kunststoff und Metallpfeilklasse";
            case REITERBOGEN_KLASSE:
                return "Reiterbogenklasse";
            case OFFENE_KLASSE:
                return "Offene Klasse";
            default:
                return null;
        }
    }
}

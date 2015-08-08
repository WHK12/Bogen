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
public enum Geschlecht {

    MANN, FRAU, JUNGEND, KIND;

    public String toString() {
        switch (this) {
            case MANN:
                return "männlich";
            case FRAU:
                return "weiblich";
            case JUNGEND:
                return "Jugend";
            case KIND:
                return "Kind";
            default:
                return null;
        }
    }
}

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
public class Person {
    private String vname;
    private String nname;
    private Geschlecht geschlecht;
    private String geburtsdatum;
    private String ort;
    private String plz;
    private String verein;
    private Klasse klasse;
    private Pfeile pfeile;

    public Person(String vname, 
            String nname, 
            Geschlecht geschlecht, 
            String geburtsdatum, 
            String ort, 
            String plz, 
            String verein, 
            Klasse klasse, 
            Pfeile pfeile) {
        this.vname = vname;
        this.nname = nname;
        this.geschlecht = geschlecht;
        this.geburtsdatum = geburtsdatum;
        this.ort = ort;
        this.plz = plz;
        this.verein = verein;
        this.klasse = klasse;
        this.pfeile = pfeile;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getVerein() {
        return verein;
    }

    public void setVerein(String verein) {
        this.verein = verein;
    }

    public Klasse getKlasse() {
        return klasse;
    }

    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }

    public Pfeile getPfeile() {
        return pfeile;
    }

    public void setPfeile(Pfeile pfeile) {
        this.pfeile = pfeile;
    }
}

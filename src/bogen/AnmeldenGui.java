/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogen;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Werner
 */
public class AnmeldenGui extends BorderPane {

    private ComboBox cbVname;
    private ComboBox cbNname;
    private ComboBox cbOrt;
    private ComboBox cbVerein;
    private ComboBox cbGeburtsdatum;
    private ComboBox cbPlz;
    private ComboBox cbKlasse;
    private ComboBox cbGeschlecht;
    private ComboBox cbEmail;
    private CheckBox chkTage;
    private Button btAnmelden;
    private Button btAbbrechen;
    private Label lbVname;
    private Label lbNname;
    private Label lbOrt;
    private Label lbVerein;
    private Label lbGeburtsdatum;
    private Label lbPlz;
    private Label lbKlasse;
    private Label lbGeschlecht;
    private Label lbEmail;
    private Label lbTage;
    private BorderPane bp;
    private GridPane gp;

    public AnmeldenGui() {

    }

    public void initGui() {
        bp = new BorderPane();
        gp = new GridPane();
        lbVname = new Label("Vorname");
        cbVname = new ComboBox(null);
        lbNname = new Label("Nachname");
        cbNname = new ComboBox(null);
        lbPlz = new Label("Plz");
        cbPlz = new ComboBox(null);
        lbOrt = new Label("Ort");
        cbOrt = new ComboBox(null);
        lbGeburtsdatum = new Label("Geburtsdatum");
        cbGeburtsdatum = new ComboBox(null);
        lbVerein = new Label("Verein");
        cbVerein = new ComboBox(null);
        lbKlasse = new Label("Klasse");
        cbKlasse = new ComboBox(null);
        lbGeschlecht = new Label("Geschlecht");
        cbGeschlecht = new ComboBox(null);

        gp.add(lbVname, 0, 0);
        gp.add(lbNname, 1, 0);
        gp.add(cbVname, 0, 1);
        gp.add(cbNname, 1, 1);
        gp.add(lbPlz, 0, 2);
        gp.add(lbOrt, 1, 2);
        gp.add(cbPlz, 0, 3);
        gp.add(cbOrt, 1, 3);
        gp.add(lbGeburtsdatum, 0, 4);
        gp.add(cbGeburtsdatum, 0, 5);
        gp.add(lbVerein, 1, 4);
        gp.add(cbVerein, 1, 5);
        gp.add(lbKlasse, 0, 6);
        gp.add(cbKlasse, 0, 7);
        gp.add(lbGeschlecht, 1, 6);
        gp.add(cbGeschlecht, 1, 7);
    }

    public ComboBox getCbNname() {
        return cbNname;
    }

    public void setCbNname(ComboBox cbNname) {
        this.cbNname = cbNname;
    }

    public ComboBox getCbVname() {
        return cbVname;
    }

    public void setCbVname(ComboBox cbVname) {
        this.cbVname = cbVname;
    }

    public ComboBox getCbOrt() {
        return cbOrt;
    }

    public void setCbOrt(ComboBox cbOrt) {
        this.cbOrt = cbOrt;
    }

    public ComboBox getCbVerein() {
        return cbVerein;
    }

    public void setCbVerein(ComboBox cbVerein) {
        this.cbVerein = cbVerein;
    }

    public ComboBox getCbGeburtsdatum() {
        return cbGeburtsdatum;
    }

    public void setCbGeburtsdatum(ComboBox cbGeburtsdatum) {
        this.cbGeburtsdatum = cbGeburtsdatum;
    }

    public ComboBox getCbPlz() {
        return cbPlz;
    }

    public void setCbPlz(ComboBox cbPlz) {
        this.cbPlz = cbPlz;
    }

    public ComboBox getCbKlasse() {
        return cbKlasse;
    }

    public void setCbKlasse(ComboBox cbKlasse) {
        this.cbKlasse = cbKlasse;
    }

    public ComboBox getCbGeschlecht() {
        return cbGeschlecht;
    }

    public void setCbGeschlecht(ComboBox cbGeschlecht) {
        this.cbGeschlecht = cbGeschlecht;
    }

    public ComboBox getCbEmail() {
        return cbEmail;
    }

    public void setCbEmail(ComboBox cbEmail) {
        this.cbEmail = cbEmail;
    }

    public CheckBox getChkTage() {
        return chkTage;
    }

    public void setChkTage(CheckBox chkTage) {
        this.chkTage = chkTage;
    }

    public Button getBtAnmelden() {
        return btAnmelden;
    }

    public void setBtAnmelden(Button btAnmelden) {
        this.btAnmelden = btAnmelden;
    }

    public Button getBtAbbrechen() {
        return btAbbrechen;
    }

    public void setBtAbbrechen(Button btAbbrechen) {
        this.btAbbrechen = btAbbrechen;
    }

    public Label getLbName() {
        return lbName;
    }

    public void setLbName(Label lbName) {
        this.lbName = lbName;
    }

    public Label getLbOrt() {
        return lbOrt;
    }

    public void setLbOrt(Label lbOrt) {
        this.lbOrt = lbOrt;
    }

    public Label getLbVerein() {
        return lbVerein;
    }

    public void setLbVerein(Label lbVerein) {
        this.lbVerein = lbVerein;
    }

    public Label getLbGeburtsdatum() {
        return lbGeburtsdatum;
    }

    public void setLbGeburtsdatum(Label lbGeburtsdatum) {
        this.lbGeburtsdatum = lbGeburtsdatum;
    }

    public Label getLbPlz() {
        return lbPlz;
    }

    public void setLbPlz(Label lbPlz) {
        this.lbPlz = lbPlz;
    }

    public Label getLbKlasse() {
        return lbKlasse;
    }

    public void setLbKlasse(Label lbKlasse) {
        this.lbKlasse = lbKlasse;
    }

    public Label getLbGeschlecht() {
        return lbGeschlecht;
    }

    public void setLbGeschlecht(Label lbGeschlecht) {
        this.lbGeschlecht = lbGeschlecht;
    }

    public Label getLbEmail() {
        return lbEmail;
    }

    public void setLbEmail(Label lbEmail) {
        this.lbEmail = lbEmail;
    }

    public Label getLbTage() {
        return lbTage;
    }

    public void setLbTage(Label lbTage) {
        this.lbTage = lbTage;
    }
}

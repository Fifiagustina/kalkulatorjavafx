/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavafx;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Fifi Agustina
 */
public class FXMLKalkulatorSederhanaController implements Initializable {

    @FXML
    private TextField bilangan1;
    @FXML
    private TextField bilangan2;
    @FXML
    private Button buttonTambah;
    @FXML
    private Button buttonKurang;
    @FXML
    private Button buttonKali;
    @FXML
    private Button buttonBagi;
    @FXML
    private JFXTextField hasiloperasi;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Penjumlahan(ActionEvent event) {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasilpenjumlahan = bil1+bil2;
        
        //menampilkan hasil
        hasiloperasi.setText(String.valueOf(hasilpenjumlahan));
    }

    @FXML
    private void Pengurangan(ActionEvent event) {
    }

    @FXML
    private void Perkalian(ActionEvent event) {
    }

    @FXML
    private void Pembagian(ActionEvent event) {
    }
    
}

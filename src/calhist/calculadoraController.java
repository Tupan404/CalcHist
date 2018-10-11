/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calhist;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author 03850980227
 */
public class calculadoraController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private JFXTextField txtNumero1;
    @FXML
    private JFXTextField txtNumero2;
    @FXML
    private JFXButton btnsoma;
    @FXML
    private JFXButton btnsub;
    @FXML
    private JFXButton btndiv;
    @FXML
    private JFXButton btnmult;
    @FXML
    private JFXTextField txtResul;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void somar(ActionEvent event) {
    
    double num1 = Double . parseDouble ( txtNumero1 . getText ());
       
    double num2 = Double . parseDouble ( txtNumero2 . getText ()); 
    
    double somar = num1 + num2 ;
    
    txtResul . setText ( somar + "" );
    }

    @FXML
    private void subtrair(ActionEvent event) {
     
    double num1 = Double.parseDouble(txtNumero1 . getText());
      
    double num2 = Double.parseDouble(txtNumero2 . getText()); 
    
    double subtrair  = num1 - num2 ;
    
    txtResul . setText ( subtrair + "" );
    }

    @FXML
    private void dividir(ActionEvent event) {
        double num1 = Double . parseDouble ( txtNumero1 . getText ());
      
    double num2 = Double . parseDouble ( txtNumero2 . getText ()); 
    
    
    double dividir  = num1 / num2 ;
    
    txtResul . setText ( dividir + "" );
    }

    @FXML
    private void multiplicar(ActionEvent event) {
        double num1 = Double . parseDouble ( txtNumero1 . getText ());
    
  
     
    
    double num2 = Double . parseDouble ( txtNumero2 . getText ()); 
    
    double multplicar = num1 * num2 ;
    
    txtResul . setText ( multplicar + "" );
    }
    
}

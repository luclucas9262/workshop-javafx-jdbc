/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainviewController implements Initializable {

    @FXML
    private MenuItem menuItemVendedor;
    
    @FXML
    private MenuItem menuitemDepartamento;
    
    @FXML
    private MenuItem menuitemAbout;
    
    @FXML
    public void onMenuItemVendedorAction(){
        System.out.println("Menu de vendedor");
    }
    
    @FXML
    public void onMenuItemDepartamentoAction(){
        System.out.println("Menu de departamento");
    }
    
    @FXML
    public void onMenuItemAboutAction(){
        System.out.println("Menu de About");
    }
    
    
    @Override
    public void initialize(URL uri, ResourceBundle rb) {

    }

}

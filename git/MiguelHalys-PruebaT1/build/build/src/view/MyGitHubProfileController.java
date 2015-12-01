package view;

import java.io.IOException;

import control.MyGitHubProfile;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Controlador de la clase MyGitHubProfile.
 * 
 * @author Miguel Halys
 * @author https://github.com/migueldam91
 * @version 1.0
 */
public class MyGitHubProfileController {
	MyGitHubProfile mygithubProfile;
	private Stage dialogStage;
	
	@FXML
    private BorderPane mainBorderPane;
	
	@FXML
    private ImageView imagenPerfil;
	
	
	@FXML
    private void initialize() {
    	
    }
	
	/**
	 * Abre una nueva ventana con la información del perfil antes de ser enviada
	 *  
	 */
	@FXML
    private void handleSend() {
		System.out.println("hola");
        mygithubProfile.showProfileDetails();      
    }

	/**
	 * Permite al controlador acceder a elementos de la IU
	 * @param myGitHub nuestra clase que contiene los elementos de la ui
	 */
	public void setMyGitHubProfile(MyGitHubProfile myGitHub) {
		this.mygithubProfile = myGitHub;
	}
	/**
	 * Carga la escena (elementos del layout de SceneBuilder) en la stage generada
	 * @param dialogStage
	 */
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
        this.dialogStage.centerOnScreen();
        this.dialogStage.setResizable(false);
        
    }
}

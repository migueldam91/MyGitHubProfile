package control;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import view.MyGitHubProfileController;

/**
 * La aplicaci�n va a permitir al usuario customizar su perfil en GitHub
 * @author Miguel
 * @version 1.0
 *
 */

public class MyGitHubProfile extends Application {
	private Stage primaryStage;
	private AnchorPane rootLayout;
	
	public MyGitHubProfile() {}

	public static void main(String[] args) {
		launch(args);

	}
	
	/**
	 * Arranca la aplicacion
	 * 
	 * @param primaryStage se le tiene que pasar una ventana
	 * 
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;

		this.primaryStage.setTitle("Github Profile");
		//this.primaryStage.getIcons().add(new Image("file:resources/images/AddressApp.png"));

		initRootLayout();
		primaryStage.setMaximized(false);
		
	}
	
	/**
	 * Genera el interfaz de JavaFx a trav�s del Objeto de la libreria FX FXMLLoader, 
	 * y lo carga posteriormente en el primaryStage de la clase
	 * 
	 * @throws InvocationTargetException
	 * 
	 */
	public void initRootLayout() throws InvocationTargetException {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyGitHubProfile.class.getResource("/view/MyGitHubProfile.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setScene(scene);

			
			// Give the controller access to the main app.
			MyGitHubProfileController controller = loader.getController();
			controller.setMyGitHubProfile(this);
						
			primaryStage.show();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Carga y lanza la pantalla de detalles
	 * 
	 * @throws InvocationTargetException
	 * 
	 */
	public void showProfileDetails() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyGitHubProfile.class.getResource("/view/ProfileDetail.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			// Create the dialog Stage.
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Edit Person");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			//dialogStage.initOwner(primaryStage);
			dialogStage.setResizable(false);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			dialogStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}

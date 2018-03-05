package application.scroll;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScrollPopUp {
	
	
	public void start() {
		try {
			
			System.out.println("Starting Scroll Pop Up");
			Stage stage = new Stage();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("ScrollPopUp.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setTitle("Add New Magic Scroll");
			stage.setScene(scene);
			stage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

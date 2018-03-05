package application;

import application.junkitem.JunkItemPopUp;
import application.scroll.ScrollPopUp;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

	@FXML
	Button scrollBtn = new Button();
	@FXML
	Button junkBtn = new Button();

	public void initialize() {

		scrollBtn.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				System.out.println("Scroll Button Pressed");
				ScrollPopUp scroll = new ScrollPopUp();
				scroll.start();
			}
		});
		
		junkBtn.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				System.out.println("Junk Item Pressed");
				JunkItemPopUp junkitem = new JunkItemPopUp();
				junkitem.start();
			}
		});
	}

	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

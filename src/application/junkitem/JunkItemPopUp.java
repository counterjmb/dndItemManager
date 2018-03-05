package application.junkitem;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JunkItemPopUp {
	
	@FXML
	Button addButton = new Button();
	JunkItem junk = new JunkItem();
	
	public void initialize() {

		addButton.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				System.out.println("Adding New Item" + junk.getName());
				List<String> lines = Arrays.asList("First", "Second");
				Path file = Paths.get("items.txt");
				try {
					Files.write(file, lines, Charset.forName("UTF-8"));
				} catch (IOException e) {
					
					e.printStackTrace();
				}

			}
		});
	}
	
	public void start() {
		try {
			
			System.out.println("Creating New Junk Item");
			Stage stage = new Stage();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("JunkItemPopUp.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setTitle("Add New Junk Item");
			stage.setScene(scene);
			stage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

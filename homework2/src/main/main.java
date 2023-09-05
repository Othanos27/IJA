package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        primaryStage.setTitle("Skladiste");
        primaryStage.setScene(new Scene(root, 1600.0D, 900.0D));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

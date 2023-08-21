package lk.ijse.dep11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.animation.PauseTransition;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane root=FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene mainScene =new Scene(root);

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("UNDECORATED WINDOWS");

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        root.setBackground(Background.fill(Color.TRANSPARENT));
        mainScene.setFill(Color.TRANSPARENT);

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Splash Screen");
        primaryStage.centerOnScreen();
        primaryStage.show();



        AnchorPane root2=FXMLLoader.load(getClass().getResource("/view/Scene1.fxml"));
        Scene mainScene2 =new Scene(root2);
        primaryStage.setScene(mainScene2);
        primaryStage.setTitle("Scene2");
        primaryStage.centerOnScreen();
        primaryStage.show();



    }
}

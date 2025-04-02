package main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import config.AppModul;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Starter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Injector injector = Guice.createInjector(new AppModul());

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/Welcome.fxml"));
        fxmlLoader.setControllerFactory(injector::getInstance);

        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
}

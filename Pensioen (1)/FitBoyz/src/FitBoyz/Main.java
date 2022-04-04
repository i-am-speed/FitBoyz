package FitBoyz;

import FitBoyz.model.FitBoyz;
import FitBoyz.view.FitBoyzPresenter;
import FitBoyz.view.FitBoyzView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FitBoyz model = new FitBoyz();
        FitBoyzView view = new FitBoyzView();
        FitBoyzPresenter presenter = new FitBoyzPresenter(model, view);
        //TODO header

        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/FitBoyz/view.idk.fxml");
        loader.setLocation(xmlUrl);
        Scene scene = new Scene(presenter.getView());
        primaryStage.setTitle("");
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}



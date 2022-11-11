import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import userinterface.UIContract;
import userinterface.UIImplementation;

import java.io.IOException;

public class SudokuApplication extends Application {
    private UIContract.View uiImpl;


    @Override
    public void start(Stage primaryStage) throws Exception {
        uiImpl = new UIImplementation(primaryStage);

        try {
            SudokuBuildLogic.build(uiImpl);
        }
        catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}

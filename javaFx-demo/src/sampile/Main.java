package sampile;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sampile.common.constants.GlobalConstants;

public class Main extends Application {

    private  final StageManager stageManager = StageManager.getInstance();

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        Parent root = FXMLLoader.load(getClass().getResource("loading.fxml"));
        primaryStage.setTitle("测试");
        primaryStage.setScene(new Scene(root, 600, 375));
        primaryStage.initStyle(StageStyle.UNDECORATED);//设定窗口无边框
        primaryStage.show();
*/
        stageManager.addStage(GlobalConstants.WINDOW.LOADING, 600, 375);
        stageManager.addStage(GlobalConstants.WINDOW.MAIN, 1200, 600);
        stageManager.addStage(GlobalConstants.WINDOW.IP_CONFIG, 820, 300);

        primaryStage  = stageManager.getStage(GlobalConstants.WINDOW.LOADING);
        primaryStage.setTitle("测试");
        primaryStage.initStyle(StageStyle.UNDECORATED);//设定窗口无边框
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

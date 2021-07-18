package sampile;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import sampile.main.MainController;
import sampile.common.utils.AlertUtil;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoadingController implements Initializable {

    @FXML
    private ImageView loadingImageView;
    @FXML
    private Button startButton;

    private Stage mainStage ;

    private  MainController mainController = new MainController();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //File file = new File("images/icon/logo.jpg");
        //System.out.println(file.getPath());
        //Image logoImage = new Image(file.toURI().toString());
        //loadingImageView.setImage(logoImage);
    }

    public void startButtonOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) startButton.getScene().getWindow();
        stage.close();


        Parent main = null;
        try {
            main = FXMLLoader.load(getClass().getResource("main/mainView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainStage = new Stage();
        mainStage.setTitle("张小菜");
        mainStage.setScene(new Scene(main, 1000, 500));
        //设定默认窗口边框
        mainStage.initStyle(StageStyle.DECORATED);

        mainStage.setOnCloseRequest(new EventHandler<WindowEvent>(){
            public void handle(WindowEvent event) {

                boolean bool = AlertUtil.AlertConfirmDialog(mainStage, "退出软件提示", "确认关闭软件吗？");
                if (bool){
                    Platform.exit();
                }else{
                    event.consume();
                }
            }
        });

        mainStage.show();
    }
}

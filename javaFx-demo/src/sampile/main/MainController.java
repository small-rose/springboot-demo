package sampile.main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import sampile.StageManager;
import sampile.common.constants.GlobalConstants;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/18 22:16
 * @version: v1.0
 */
public class MainController implements Initializable {

    private StageManager stageManager = StageManager.getInstance();
    @FXML
    private MenuItem ipConfigMenuItem;
    @FXML
    private MenuItem xmlFormatMenuItem;
    @FXML
    private MenuItem jsonFormatMenuItem;

    @FXML
    private MenuItem mysqlMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    private Stage mainStage ;

    // 功能窗口
    private Stage funcStage ;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void ipConfigOnAction(ActionEvent actionEvent) throws IOException {
        //((Node) e.getSource()).getScene().getWindow();

        Parent function = FXMLLoader.load(getClass().getResource("../function/IpConfigView.fxml"));
        /*
        funcStage = new Stage();
        funcStage.setTitle("IpConfig");
        funcStage.setScene(new Scene(function, 500, 300));
        funcStage.initStyle(StageStyle.DECORATED);
        funcStage.setFullScreen(false);
        funcStage.setMinWidth(200);
        funcStage.setMinHeight(100);

        funcStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {

                funcStage.close();
            }
        });
        funcStage.show();
        */

        if (funcStage == null ) {
            funcStage = stageManager.getStage(GlobalConstants.WINDOW.IP_CONFIG);
            funcStage.setTitle("IpConfig");
            funcStage.initStyle(StageStyle.DECORATED);
            funcStage.setFullScreen(false);
            funcStage.setMinWidth(200);
            funcStage.setMinHeight(100);

            funcStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {

                    funcStage.hide();
                }
            });
            funcStage.show();
        }else{
            funcStage.show();
        }

    }
}

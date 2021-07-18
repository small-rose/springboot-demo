package sampile;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/19 0:15
 * @version: v1.0
 */
public class StageManager {

    private final static StageManager INSTANCE = new StageManager();

    public static StageManager getInstance(){
        return INSTANCE;
    }



    private static HashMap hashMapStage = new HashMap();


    public void addStage(String fxmlName){
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlName));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            hashMapStage.put(fxmlName, stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void addStage(String fxmlName, int sceneWidth, int sceneHeight){
        try {
            System.out.println("fxmlName : "+fxmlName);
            Parent root = FXMLLoader.load(getClass().getResource(fxmlName));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, sceneWidth, sceneHeight));
            hashMapStage.put(fxmlName, stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getStage(String name){
        return (Stage) hashMapStage.get(name);
    }


    public boolean showWindow(String resource) throws IOException {
        try {
            getStage(resource).show();
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public boolean closeWindow(String resource){
        getStage(resource).close();
        return true;

    }

}

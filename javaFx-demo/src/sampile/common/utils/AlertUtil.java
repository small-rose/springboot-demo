package sampile.common.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/18 23:29
 * @version: v1.0
 */
public class AlertUtil {

    private static final Alert alert = new Alert(Alert.AlertType.CONFIRMATION,  null , new ButtonType("取消", ButtonBar.ButtonData.NO),
            new ButtonType("确定", ButtonBar.ButtonData.YES));

    private static final Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);

    private static final Alert errorAlert = new Alert(Alert.AlertType.ERROR);

    /**
     * 弹出一个通用的确定对话框
     * @param p_header 对话框的信息标题
     * @param p_message 对话框的信息
     * @return 用户点击了是或否
     */
    public static boolean AlertConfirmDialog(Stage d_stage, String p_header, String p_message){

        //Alert alert = new Alert(Alert.AlertType.CONFIRMATION,  p_message , new ButtonType("取消", ButtonBar.ButtonData.NO),
        //        new ButtonType("确定", ButtonBar.ButtonData.YES));
        //        按钮部分可以使用预设的也可以像这样自己 new 一个

        //        设置窗口的标题
        alert.setTitle("确认提示");
        alert.setHeaderText(p_header);
        alert.setContentText(p_message);
        //        设置对话框的 icon 图标，参数是主窗口的 stage
        if (d_stage!=null){
            alert.initOwner(d_stage);
        }
        
        //        showAndWait() 将在对话框消失以前不会执行之后的代码
        Optional<ButtonType> _buttonType = alert.showAndWait();
        //        根据点击结果返回
        if(_buttonType.get().getButtonData().equals(ButtonBar.ButtonData.YES)){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 弹出一个信息对话框
     * @param d_stage
     * @param p_header
     * @param p_message
     */
    public static void  AlertInfoDialog(Stage d_stage, String p_header, String p_message){
        // Alert alert = new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setTitle("信息");
        infoAlert.setHeaderText(p_header);
        infoAlert.setContentText(p_message);
        if (d_stage!=null){
            infoAlert.initOwner(d_stage);
        }
        infoAlert.showAndWait();
    }

    /**
     *  弹出一个信息对话框
     * @param d_stage
     * @param p_header
     * @param p_message
     */
    public static void alertErrorDialog(Stage d_stage, String p_header, String p_message){

        errorAlert.setTitle("错误信息");
        errorAlert.setHeaderText(p_header);
        errorAlert.setContentText(p_message);
        if (d_stage!=null){
            errorAlert.initOwner(d_stage);
        }
        errorAlert.showAndWait();
    }
}

package fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Sample FX");
        primaryStage.show();

        VBox vBox = new VBox(10);

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu1");
        MenuItem menuItem = new Menu("Item1");
        MenuItem menuItem2 = new Menu("Item2");
        Menu menu1 = new Menu("SubMenu");
        MenuItem subItem1 = new Menu("SUbItem1");
        menu1.getItems().addAll(subItem1);
        menu.getItems().addAll(menuItem, menuItem2, menu1);

        menuBar.getMenus().addAll(menu);

        HBox nameBox = new HBox(1);
        nameBox.getChildren().addAll(new Label("Name: "), new TextField());
        HBox addressBox = new HBox(1);
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton ktm = new RadioButton("KTM");
        ktm.setToggleGroup(toggleGroup);
        RadioButton pkr = new RadioButton("PKR");
        pkr.setToggleGroup(toggleGroup);
        addressBox.getChildren().addAll(new Label("Address: "), ktm, pkr);

        HBox cBox = new HBox(1);
        cBox.getChildren().addAll(new Label("Hobby"), new CheckBox("A"), new CheckBox("B"));

        HBox buttonBox = new HBox(1);
        buttonBox.getChildren().addAll(new Button("Save"));

        Hyperlink hyperlink = new Hyperlink("www.google.com");


        vBox.getChildren().addAll(
                menuBar, nameBox, addressBox, buttonBox, cBox, hyperlink
        );

        Scene scene = new Scene(vBox, 200, 200);

        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

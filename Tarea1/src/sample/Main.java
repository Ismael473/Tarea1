package sample;

import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;



public class Main extends Application {

    public static void main(String[] args) {

        launch(args);

    }
    @Override
    public void start(Stage stage) throws Exception{

        Group root = new Group();

        Scene scene = new Scene(root, Color.LIGHTGREEN);

        //Imagen de icono
        Image icono = new Image("guasap.png");

        //Scene Setup
        Text texto = new Text();
        texto.setText("Acá va una variable que trabaje en función del servidor y el otro cliente");
        texto.setY(50);
        texto.setX(50);
        root.getChildren().add(texto);
        texto.setFont(Font.font("Arial",20));
        texto.setFill(Color.RED);
        //Stage Setup
        stage.setTitle("Servichat");
        stage.getIcons().add(icono);
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setResizable(false);
            //Se pasa la scene al stage
        stage.setScene(scene);
            // el.show siempre va al final
        stage.show();
    }
}

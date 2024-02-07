package lab1;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import javafx.scene.shape.Rectangle;

        

/**
 * JavaFX App
 */
//full red

public class App extends Application {
Text t = new Text();
Rectangle r= new Rectangle();
Image i= new Image("https://i.pinimg.com/originals/18/88/24/188824ba6358b237db286383e19f7165.png");

    @Override
    public void start(Stage stage) throws Exception{
          
        r.setX(200);
        r.setY(100);
        r.setWidth(240);
        r.setHeight(240);
        r.setStroke(Color.CORNFLOWERBLUE);
        r.setFill(Color.ALICEBLUE);
      
        //Image
        ImageView iv=new ImageView(i);
        iv.setX(158);
        iv.setY(80);
        iv.setFitHeight(260);
        iv.setFitWidth(190);
        iv.setPreserveRatio(true);
        
        //Circle
        Circle c=new Circle();
        c.setCenterX(430);
        c.setCenterY(330);
        c.setRadius(60);
        c.setStroke(Color.CORNFLOWERBLUE);
        //c.setFill(Color.WHITE);
        Image i2= new Image("https://i.pinimg.com/originals/d7/b6/db/d7b6dbf3427ffacc15bb435c6c7ad413.jpg");
        ImagePattern ip= new ImagePattern(i2,128,227,200,200,false);
        c.setFill(ip);
        
       //Text
       Text t= new Text();
       t.setText("LIMITED");
       t.setX(300);
       t.setY(160);
       t.setFont(Font.font("Helvetica",FontWeight.BLACK,FontPosture.REGULAR,60));
       t.setFill(Color.LIGHTBLUE);
       //
       Text t2= new Text();
       t2.setText("Edition");
       t2.setX(320);
       t2.setY(210);
       t2.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.REGULAR,60));
       t2.setFill(Color.CORNFLOWERBLUE);
       //
       Text t3= new Text();
       t3.setText("Bright Fashion     12-6,2023\n      Store");
       t3.setX(308);
       t3.setY(240);
       t3.setFont(Font.font("Helvetica",FontWeight.BLACK,FontPosture.REGULAR,10));
       t3.setFill(Color.BLACK);
       //
       Text t4= new Text();
       t4.setText("@074Rey");
       t4.setX(330);
       t4.setY(330);
       t4.setFont(Font.font("Helvetica",FontWeight.BLACK,FontPosture.REGULAR,8));
       t4.setFill(Color.CORNFLOWERBLUE);
       //Line
       Line l=new Line();
       l.setStartX(380);
       l.setStartY(230);
       l.setEndX(380);
       l.setEndY(250);
       
       //Group
        Group g =new Group (r,iv,c,t,t2,l,t3,t4);
        Scene s = new Scene(g, 700, 520);
        stage.setTitle("Reema Ali -Lab1");
      stage.setScene(s);
       stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}


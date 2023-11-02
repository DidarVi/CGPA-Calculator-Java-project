package application;
	
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {
	String val1;
	double val2;
	String val3;
	String val4;
	double val5;
	String val6;
	String val7;
	double val8;
	String val9;
	String val10;
	double val11;
	String val12;
	String val13;
	double val14;
	String val15;
	double cgpa,credit,cgpa1,cgpa2,cgpa3,cgpa4,cgpa5;
	@Override
	public void start(Stage primaryStage) {
		
		
		//element part
		
		Text text=new Text();
		text.setText("CGPA Calculator");
		
		
		// this is for the name
		Label lb=new Label("Enter Your Name: ");
		TextField tf1=new TextField();
		
		//this is for the course 1
		
		Label lb1=new Label("Course 1 : ");
		
		ComboBox<String> com1=new ComboBox<>();
	    com1.getItems().addAll("ENG 102","ENG 103","ENG 111","PHI 101","PHI104","LBA 101","LBA 102","POL 101","POL 104","ECO 101","ECO 104","SOC 101","ENV 203","GEO 205","ANT 101","BIO 103","MAT 116","MAT 125","MAT 130","MAT 250","MAT 350","MAT 361","PHY 107","PHY 108","CHE 101","EEE 452"+"CEE 110","CSE 115","CSE 115L","CSE 215","CSE 215L","CSE 173","CSE 225","CSE 225L","CSE 231","CSE 231L","CSE 299","EEE 141","EEE 141L","EEE 111","ETE 111","EEE 111L","ETE 111L","CSE 311","CSE 311L","CSE 323","CSE 327","CSE 331","CSE 331L","CSE 332","CSE 373","CSE 325","CSE 45","CSE 498","EEE 498","ETE 498","CSE 499A","EEE 499A","ETE 499A","CSE 499B","EEE 499B","ETE 499B","CSE 417","CSE 401","CSE 418","CSE 426","CSE 473","CSE 491","CSE 411","CSE 424","CSE 427","CSE 428","CSE 429","CSE 492","CSE 422","CSE 438","CSE 482","CSE 485","CSE 486","CSE 493","CSE 433","CSE 435","CSE 413","CSE 414","CSE 494","CSE 419","CSE 440","CSE 445","CSE 465","CSE 467","CSE 468","CSE 470","CSE 495","CSE 446","CSE 447","CSE 448","CSE 449","CSE 496");
	    com1.setPromptText("Select Course");
		com1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				 val1=com1.getValue();
			}
		});
		ComboBox<Double> com2=new ComboBox<>();
		com2.getItems().addAll(3.0,1.0,1.5);
	    com2.setPromptText("Credit");
	    com2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				 val2 = com2.getValue();
			}
		});
		ComboBox<String> com3=new ComboBox<>();
        com3.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
	    com3.setPromptText("Grade");
	    com3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val3 = com3.getValue();
			}
		});
		//this is for the course 2

	    Label lb2=new Label("Course 2 : ");
	    
	    ComboBox<String> com4=new ComboBox<>();
	    com4.getItems().addAll("ENG 102","ENG 103","ENG 111","PHI 101","PHI104","LBA 101","LBA 102","POL 101","POL 104","ECO 101","ECO 104","SOC 101","ENV 203","GEO 205","ANT 101","BIO 103","MAT 116","MAT 125","MAT 130","MAT 250","MAT 350","MAT 361","PHY 107","PHY 108","CHE 101","EEE 452"+"CEE 110","CSE 115","CSE 115L","CSE 215","CSE 215L","CSE 173","CSE 225","CSE 225L","CSE 231","CSE 231L","CSE 299","EEE 141","EEE 141L","EEE 111","ETE 111","EEE 111L","ETE 111L","CSE 311","CSE 311L","CSE 323","CSE 327","CSE 331","CSE 331L","CSE 332","CSE 373","CSE 325","CSE 45","CSE 498","EEE 498","ETE 498","CSE 499A","EEE 499A","ETE 499A","CSE 499B","EEE 499B","ETE 499B","CSE 417","CSE 401","CSE 418","CSE 426","CSE 473","CSE 491","CSE 411","CSE 424","CSE 427","CSE 428","CSE 429","CSE 492","CSE 422","CSE 438","CSE 482","CSE 485","CSE 486","CSE 493","CSE 433","CSE 435","CSE 413","CSE 414","CSE 494","CSE 419","CSE 440","CSE 445","CSE 465","CSE 467","CSE 468","CSE 470","CSE 495","CSE 446","CSE 447","CSE 448","CSE 449","CSE 496");
	    com4.setPromptText("Select Course");
	    com4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val4 = com4.getValue();
			}
		});
		ComboBox<Double> com5=new ComboBox<>();
		com5.getItems().addAll(3.0,1.0,1.5);
	    com5.setPromptText("Credit");
	    com5.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val5 = com5.getValue();
			}
		});
		ComboBox<String> com6=new ComboBox<>();
        com6.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
	    com6.setPromptText("Grade");
	    com6.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val6 = com6.getValue();
			}
		});
		
		//this is for the course 3
	    Label lb3=new Label("Course 3 : ");	    
	    ComboBox<String> com7=new ComboBox<>();
	    com7.getItems().addAll("ENG 102","ENG 103","ENG 111","PHI 101","PHI104","LBA 101","LBA 102","POL 101","POL 104","ECO 101","ECO 104","SOC 101","ENV 203","GEO 205","ANT 101","BIO 103","MAT 116","MAT 125","MAT 130","MAT 250","MAT 350","MAT 361","PHY 107","PHY 108","CHE 101","EEE 452"+"CEE 110","CSE 115","CSE 115L","CSE 215","CSE 215L","CSE 173","CSE 225","CSE 225L","CSE 231","CSE 231L","CSE 299","EEE 141","EEE 141L","EEE 111","ETE 111","EEE 111L","ETE 111L","CSE 311","CSE 311L","CSE 323","CSE 327","CSE 331","CSE 331L","CSE 332","CSE 373","CSE 325","CSE 45","CSE 498","EEE 498","ETE 498","CSE 499A","EEE 499A","ETE 499A","CSE 499B","EEE 499B","ETE 499B","CSE 417","CSE 401","CSE 418","CSE 426","CSE 473","CSE 491","CSE 411","CSE 424","CSE 427","CSE 428","CSE 429","CSE 492","CSE 422","CSE 438","CSE 482","CSE 485","CSE 486","CSE 493","CSE 433","CSE 435","CSE 413","CSE 414","CSE 494","CSE 419","CSE 440","CSE 445","CSE 465","CSE 467","CSE 468","CSE 470","CSE 495","CSE 446","CSE 447","CSE 448","CSE 449","CSE 496");
	    com7.setPromptText("Select Course");
	    com7.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val7 = com7.getValue();
			}
		});
		ComboBox<Double> com8=new ComboBox<>();
		com8.getItems().addAll(3.0,1.0,1.5);
	    com8.setPromptText("Credit");
	    com8.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val8 = com8.getValue();
			}
		});
		ComboBox<String> com9=new ComboBox<>();
        com9.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
	    com9.setPromptText("Grade");
	    com9.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val9 = com9.getValue();
			}
		});
		//this is for the course 4
		Label lb4=new Label("Course 4 : ");
	    ComboBox<String> com10=new ComboBox<>();
	    com10.getItems().addAll("ENG 102","ENG 103","ENG 111","PHI 101","PHI104","LBA 101","LBA 102","POL 101","POL 104","ECO 101","ECO 104","SOC 101","ENV 203","GEO 205","ANT 101","BIO 103","MAT 116","MAT 125","MAT 130","MAT 250","MAT 350","MAT 361","PHY 107","PHY 108","CHE 101","EEE 452"+"CEE 110","CSE 115","CSE 115L","CSE 215","CSE 215L","CSE 173","CSE 225","CSE 225L","CSE 231","CSE 231L","CSE 299","EEE 141","EEE 141L","EEE 111","ETE 111","EEE 111L","ETE 111L","CSE 311","CSE 311L","CSE 323","CSE 327","CSE 331","CSE 331L","CSE 332","CSE 373","CSE 325","CSE 45","CSE 498","EEE 498","ETE 498","CSE 499A","EEE 499A","ETE 499A","CSE 499B","EEE 499B","ETE 499B","CSE 417","CSE 401","CSE 418","CSE 426","CSE 473","CSE 491","CSE 411","CSE 424","CSE 427","CSE 428","CSE 429","CSE 492","CSE 422","CSE 438","CSE 482","CSE 485","CSE 486","CSE 493","CSE 433","CSE 435","CSE 413","CSE 414","CSE 494","CSE 419","CSE 440","CSE 445","CSE 465","CSE 467","CSE 468","CSE 470","CSE 495","CSE 446","CSE 447","CSE 448","CSE 449","CSE 496");
	    com10.setPromptText("Select Course");
	    com10.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val10 = com10.getValue();
			}
		});
		ComboBox<Double> com11=new ComboBox<>();
		com11.getItems().addAll(3.0,1.0,1.5);
	    com11.setPromptText("Credit");
	    com11.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val11 = com11.getValue();
			}
		});
		ComboBox<String> com12=new ComboBox<>();
        com12.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
	    com12.setPromptText("Grade");
	    com12.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val12 = com12.getValue();
			}
		});
		//this is for the course 5
		Label lb5=new Label("Course 5 : ");

	    ComboBox<String> com13=new ComboBox<>();
	   com13.getItems().addAll("ENG 102","ENG 103","ENG 111","PHI 101","PHI104","LBA 101","LBA 102","POL 101","POL 104","ECO 101","ECO 104","SOC 101","ENV 203","GEO 205","ANT 101","BIO 103","MAT 116","MAT 125","MAT 130","MAT 250","MAT 350","MAT 361","PHY 107","PHY 108","CHE 101","EEE 452"+"CEE 110","CSE 115","CSE 115L","CSE 215","CSE 215L","CSE 173","CSE 225","CSE 225L","CSE 231","CSE 231L","CSE 299","EEE 141","EEE 141L","EEE 111","ETE 111","EEE 111L","ETE 111L","CSE 311","CSE 311L","CSE 323","CSE 327","CSE 331","CSE 331L","CSE 332","CSE 373","CSE 325","CSE 45","CSE 498","EEE 498","ETE 498","CSE 499A","EEE 499A","ETE 499A","CSE 499B","EEE 499B","ETE 499B","CSE 417","CSE 401","CSE 418","CSE 426","CSE 473","CSE 491","CSE 411","CSE 424","CSE 427","CSE 428","CSE 429","CSE 492","CSE 422","CSE 438","CSE 482","CSE 485","CSE 486","CSE 493","CSE 433","CSE 435","CSE 413","CSE 414","CSE 494","CSE 419","CSE 440","CSE 445","CSE 465","CSE 467","CSE 468","CSE 470","CSE 495","CSE 446","CSE 447","CSE 448","CSE 449","CSE 496");
	   com13.setPromptText("Select Course");
	   com13.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val13 = com13.getValue();
			}
		});
	   ComboBox<Double> com14=new ComboBox<>();
	   com14.getItems().addAll(3.0,1.0,1.5);
	   com14.setPromptText("Credit");
	   com14.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val14 = com14.getValue();
			}
		});
	   ComboBox<String> com15=new ComboBox<>();
	   com15.getItems().addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","F");
       com15.setPromptText("Grade");
       com15.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				val15 = com15.getValue();
			}
		});
       //this for the calculate batton
       Button btn=new Button("Calculate");
       
       btn.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {

			String name=tf1.getText().toString();
			String value="";
			File obj=new File("UserInfo.txt");
			try {
				
				//this is for the course 1 cgpa
				if(val3.contains("A"))
				{
					cgpa1=4;
				}
				else if(val3.contains("A-"))
				{
					cgpa1=3.7;
				}
				else if(val3.contains("B+"))
				{
					cgpa1=3.3;
				}else if(val3.contains("B"))
				{
					cgpa1=3;
				}else if(val3.contains("B-"))
				{
					cgpa1=2.7;
				}else if(val3.contains("C+"))
				{
					cgpa1=2.3;
				}else if(val3.contains("C"))
				{
					cgpa1=2.0;
				}else if(val3.contains("C-"))
				{
					cgpa1=1.7;
				}else if(val3.contains("D+"))
				{
					cgpa1=1.3;
				}else if(val3.contains("D"))
				{
					cgpa1=1;
				}else if(val3.contains("F"))
				{
					cgpa1=0;
				}
				
				//this is for the course 2 cgpa
				if(val6.contains("A"))
				{
					cgpa2=4;
				}
				else if(val3.contains("A-"))
				{
					cgpa2=3.7;
				}
				else if(val3.contains("B+"))
				{
					cgpa2=3.3;
				}else if(val3.contains("B"))
				{
					cgpa2=3;
				}else if(val3.contains("B-"))
				{
					cgpa2=2.7;
				}else if(val3.contains("C+"))
				{
					cgpa2=2.3;
				}else if(val3.contains("C"))
				{
					cgpa2=2.0;
				}else if(val3.contains("C-"))
				{
					cgpa2=1.7;
				}else if(val3.contains("D+"))
				{
					cgpa2=1.3;
				}else if(val3.contains("D"))
				{
					cgpa2=1;
				}else if(val3.contains("F"))
				{
					cgpa2=0;
				}
				
				//this is for the course 3 cgpa
				if(val9.contains("A"))
				{
					cgpa3=4;
				}
				else if(val3.contains("A-"))
				{
					cgpa3=3.7;
				}
				else if(val3.contains("B+"))
				{
					cgpa3=3.3;
				}else if(val3.contains("B"))
				{
					cgpa3=3;
				}else if(val3.contains("B-"))
				{
					cgpa3=2.7;
				}else if(val3.contains("C+"))
				{
					cgpa3=2.3;
				}else if(val3.contains("C"))
				{
					cgpa3=2.0;
				}else if(val3.contains("C-"))
				{
					cgpa3=1.7;
				}else if(val3.contains("D+"))
				{
					cgpa3=1.3;
				}else if(val3.contains("D"))
				{
					cgpa3=1;
				}else if(val3.contains("F"))
				{
					cgpa3=0;
				}
				
				//this is for the course 4 cgpa
				if(val12.contains("A"))
				{
					cgpa4=4;
				}
				else if(val3.contains("A-"))
				{
					cgpa4=3.7;
				}
				else if(val3.contains("B+"))
				{
					cgpa4=3.3;
				}else if(val3.contains("B"))
				{
					cgpa4=3;
				}else if(val3.contains("B-"))
				{
					cgpa4=2.7;
				}else if(val3.contains("C+"))
				{
					cgpa4=2.3;
				}else if(val3.contains("C"))
				{
					cgpa4=2.0;
				}else if(val3.contains("C-"))
				{
					cgpa4=1.7;
				}else if(val3.contains("D+"))
				{
					cgpa4=1.3;
				}else if(val3.contains("D"))
				{
					cgpa4=1;
				}else if(val3.contains("F"))
				{
					cgpa4=0;
				}
				//this is for the course 5 cgpa
				if(val15.contains("A"))
				{
					cgpa5=4;
				}
				else if(val3.contains("A-"))
				{
					cgpa5=3.7;
				}
				else if(val3.contains("B+"))
				{
					cgpa5=3.3;
				}else if(val3.contains("B"))
				{
					cgpa5=3;
				}else if(val3.contains("B-"))
				{
					cgpa5=2.7;
				}else if(val3.contains("C+"))
				{
					cgpa5=2.3;
				}else if(val3.contains("C"))
				{
					cgpa5=2.0;
				}else if(val3.contains("C-"))
				{
					cgpa5=1.7;
				}else if(val3.contains("D+"))
				{
					cgpa5=1.3;
				}else if(val3.contains("D"))
				{
					cgpa5=1;
				}else if(val3.contains("F"))
				{
					cgpa5=0;
				}
				
				//this is the code for calculate the cgpa
				credit=val2+val5+val8+val11+val14;
				cgpa=((val2*cgpa1)+(val5*cgpa2)+(val8*cgpa3)+(val11*cgpa4)+(val14*cgpa5))/credit;
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				obj.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				FileWriter fw=new FileWriter("UserInfo.txt");
				fw.write(name+"\n\nCourse 1 :   "+val1+"  "+val2+"  "+val3+"\nCourse 2 :   "
						+val4+"  "+val5+"  "+val6+"\nCourse 3 :   "+val7+"  "+val8+
						"  "+val9+"\nCourse 4 :   "+val10+"  "+val11+"  "+val12+"\nCourse 5 :   "+
						val13+"  "+val14+"  "+val15+"\n\nCGPA     :  "+cgpa);
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();

			}
			try {
				FileReader fr=new FileReader("UserInfo.txt");
				
				Scanner sc=new Scanner(fr);
				while(sc.hasNextLine())
				{
					value=sc.nextLine();
					
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
			Label lb=new Label(name+"\n\nCourse 1 :   "+val1+"   "+val2+"   "+val3+"\nCourse 2 :   "
					+val4+"   "+val5+"   "+val6+"\nCourse 3 :   "+val7+"   "+val8+
					"   "+val9+"\nCourse 4 :   "+val10+"   "+val11+"   "+val12+"\nCourse 5 :   "+
					val13+"   "+val14+"   "+val15+"\n\nCGPA      :   "+cgpa);
			HBox hb=new HBox(10,lb);
			hb.setAlignment(Pos.CENTER);
			Scene sc=new Scene(hb,400,400);

	    	primaryStage.setTitle("Output");
			primaryStage.setScene(sc);
		    primaryStage.show();
		}
	});
       
		//layouts part
		
		
		HBox hb=new HBox(10,text);
		hb.setAlignment(Pos.TOP_CENTER);
		HBox hb1=new HBox(10,lb,tf1);
		HBox hb2=new HBox(10,lb1,com1,com2,com3);
		HBox hb3=new HBox(10,lb2,com4,com5,com6);
		HBox hb4=new HBox(10,lb3,com7,com8,com9);
		HBox hb5=new HBox(10,lb4,com10,com11,com12);
		HBox hb6=new HBox(10,lb5,com13,com14,com15);
		HBox hb7=new HBox(10,btn);
		hb7.setAlignment(Pos.TOP_CENTER);

		VBox vb=new VBox(10,hb,hb1,hb2,hb3,hb4,hb5,hb6,hb7);
		
		//scene part
		
		Scene sc=new Scene(vb,450,350);
		
		//stage part
		
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

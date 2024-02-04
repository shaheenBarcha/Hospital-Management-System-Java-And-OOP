package Hospital;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class PatientBillScreen {


public static void displayScreen(Patient p){

 Label lbl = new Label();

 lbl.setText("Patient id : "+ p.pid
 +"\nPatient name: "+ p.pname
 +"\nPatient room: "+ p.roomno
 +"\nPatient Fee : 2000");
 // create button to pay bill
 Button btnpay = new Button("PayBill");
 Button btnback = new Button("patient detail");
 Button btnbac = new Button("bill detail");

 VBox v = new VBox(20, lbl, btnpay,btnback,btnbac);
 Stage stage = new Stage();
 Scene s = new Scene(v, 300, 300);
 stage.setScene(s);
 stage.show();

 btnpay.setOnAction(new EventHandler<ActionEvent>() {

 @Override
 public void handle(ActionEvent event) {
 p.payBill(12, 2000);

 Filing.patientdata = "C:patientdata.txt";
 try {
 // tostring method is used to write patient data in string form 
 Filing.writeData(p.toString());
 } catch (IOException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 AddPatientScreen.displayScreen(p);
 }
 }
 });

 btnback.setOnAction(new EventHandler<ActionEvent>() {

 @Override
 public void handle(ActionEvent event) {


 Filing.patientdata = "C:patientdata.txt";
 try {
 // tostring method is used to write patient data in string form
 Filing.writeData(p.toString());
 } catch (IOException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 AddPatientScreen.displayScreen(p);
 }
 }
 });

}
} 
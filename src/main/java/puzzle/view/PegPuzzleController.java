package puzzle.view;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import puzzle.PuzzleLauncher;

public class PegPuzzleController {
	private PuzzleLauncher app;
	
	@FXML
	Circle peg1;
	@FXML
	Circle peg2;
	@FXML
	Circle peg3;
	@FXML
	Circle peg4;
	@FXML
	Circle peg5;
	@FXML
	Circle peg6;
	@FXML
	Circle peg7;
	@FXML
	Circle peg8;
	@FXML
	Circle peg9;
	@FXML
	Circle peg10;
	@FXML
	Circle peg11;
	@FXML
	Circle peg12;
	@FXML
	Circle peg13;
	@FXML
	Circle peg14;
	@FXML
	Circle peg15;
	@FXML
	Button refreshButton;
	
	ArrayList<Circle> pegList = new ArrayList<Circle>();
	
	@FXML
	private void initialize() {	
		if(pegList.isEmpty()) {
			pegList.add(peg1);
			pegList.add(peg2);
			pegList.add(peg3);
			pegList.add(peg4);
			pegList.add(peg5);
			pegList.add(peg6);
			pegList.add(peg7);
			pegList.add(peg8);
			pegList.add(peg9);
			pegList.add(peg10);
			pegList.add(peg11);
			pegList.add(peg12);
			pegList.add(peg13);
			pegList.add(peg14);
			pegList.add(peg15);
		}
		
		int randPeg = (int)(Math.random() * 15);
		
		pegList.get(randPeg).setFill(Color.WHITE);
	}
	
	@FXML
	private void closeApp() {
		app.getPrimaryStage().close();
	}
	
	@FXML
	private void refresh() {
		for(Circle c: pegList) {
			c.setFill(Color.GREEN);
		}
		
		int randPeg = (int)(Math.random() * 15);
		
		pegList.get(randPeg).setFill(Color.WHITE);
	}
	
	
}

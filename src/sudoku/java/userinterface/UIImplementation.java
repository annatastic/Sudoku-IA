package userinterface;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.Group;
import problemdomain.Coordinates;
import problemdomain.SudokuGame;

import java.util.HashMap;

public class UIImplementation implements UIContract.View,
        EventHandler<KeyEvent> {

    private /*final*/ Stage stage;
    private /*final*/ Group root;
    private HashMap<Coordinates, TextField> textFieldCoords;  //hashmap to store the text field of each tile on the board
    private UIContract.EventListener listener;

    public UIImplementation(Stage stage) {
        this.stage = stage;
        this.root = new Group();
        this.textFieldCoords = new HashMap<>();
        initializeUI();
    }

    private void initializeUI() {
    }

    @Override
    public void handle(KeyEvent keyEvent) {

    }

    @Override
    public void setListener(UIContract.EventListener listener) {

    }

    @Override
    public void updateSquare(int x, int y, int input) {

    }

    @Override
    public void updateBoard(SudokuGame game) {

    }

    @Override
    public void showDialog(String s) {

    }
}

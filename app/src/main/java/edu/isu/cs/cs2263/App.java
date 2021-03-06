/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.isu.cs.cs2263;

import edu.isu.cs.cs2263.Department;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Arrays;
import java.util.List;

public class App extends Application{
    ComboBox selectDept;

    ListView<Department> departments = new ListView<Department>();
    final ObservableList<Department> data =
            FXCollections.observableArrayList(
                    new Department("Computer Science"),
                    new Department("Chemistry"),
                    new Department("Physics"),
                    new Department("Mathematics"),
                    new Department("Botany"),
                    new Department("Zoology")
            );

    public static void main(String[] args) {
        Application.launch();
    }

    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages.
     * @throws Exception if something goes wrong
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set the stage here!
        primaryStage.setTitle("Add/ Update/ View Courses");

        BorderPane main = new BorderPane();
        main.setPadding(new Insets(10, 10, 10, 10));

        // Department selection list section. Main, left.
        BorderPane selectDeptBtnPane = new BorderPane();

        selectDept = new ComboBox(data);
        selectDept.setPromptText("Select Department");
        selectDeptBtnPane.setLeft(selectDept);
        main.setLeft(selectDeptBtnPane);

        selectDept.getSelectionModel().selectedItemProperty().addListener(Listener -> {

        });

        // Text input fields
        BorderPane getUserInput = new BorderPane();
        TextField courseInfo = new TextField();
        courseInfo.setPromptText("Course Number");
        courseInfo.getText();
        getUserInput.setCenter(courseInfo);
        main.setCenter(getUserInput);

        // Display all button section. Top, right.
        // Displays all courses and the course dept.
        // Allows for scrolling.
        BorderPane displayAllBtnPane = new BorderPane();
        //displayAllBtnPane.setPadding(new Insets(10, 10, 10, 10));
        Button displayAllBtn = new Button("Display (all)");
        displayAllBtnPane.setRight(displayAllBtn);
        main.setTop(displayAllBtnPane);

        // Display Dept button section. Middle, right.
        // Combo box to display courses of selected department.
        BorderPane displayDeptBtnPane = new BorderPane();
        // Have to add choices. Department objects
        ComboBox displayDept = new ComboBox();
        displayDept.setPromptText("Display Department");
        displayDeptBtnPane.setRight(displayDept);
        main.setRight(displayDeptBtnPane);

        // Exit button section. Bottom, right.
        // needs confirmation message.
        BorderPane exitBtnPane = new BorderPane();
        Button exitBtn = new Button("Exit");
        exitBtnPane.setRight(exitBtn);
        main.setBottom(exitBtnPane);

        Scene scene = new Scene(main, 500, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void updateCourses(int num, String name, int credits){
       int index = selectDept.getSelectionModel().getSelectedIndex();
       Department selected = departments.getItems().get(index);

       Course course = new Course(num, name, credits);
       //selected.setCourses(course);
    }
}


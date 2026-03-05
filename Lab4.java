import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Aman Kaur - Lab 4 - IT2660
 * JavaFX display for the Lab 4 questions/answers.
 */
public class Lab4 extends Application {

    @Override
    public void start(Stage stage) {
        Label title = new Label("Aman Kaur — Lab 4 — IT2660 — Questions");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Label q1 = new Label("1) If you were implementing a sort algorithm for a new language, which sort would you use and why?");
        Label a1 = new Label("If we are implementing a sort of algorithm for a new language, the sort I would be using is insertion sort. "
                + "This is because it is way easier to insert and place into, as well as not needing as much storage. "
                + "Putting arrays/lists.");
        a1.setWrapText(true);

        Label q2 = new Label("2) Was there a difference in the time it took for the bubble and insertion sort to run? "
                + "Does this make sense given the time complexities for these sorting algorithms? Explain");
        Label a2 = new Label("Yes, there is a difference between bubble and insertion sort for how long it ran. "
                + "This does make sense because with bubble sort kind of moves around everywhere and even if it's put together and sorted "
                + "it will still find its way to move around. Insertion sort was more of an ordered side where it does a lot more less shifts. "
                + "Overall insertion sort works more beneficial because it seems to be more efficient.");
        a2.setWrapText(true);

        Label q3 = new Label("3) Which sort algorithm has an easier implementation (in terms of understanding) for you and why?");
        Label a3 = new Label("Bubble sort algorithm has a much easier implementation this is because it gets straight to the point as well as has these repeated "
                + "patterns. Also having bigger values to them makes it a lot more less challenging to move and sort through the list.");
        a3.setWrapText(true);

        VBox box = new VBox(
                title,
                new Separator(),
                q1, a1,
                new Separator(),
                q2, a2,
                new Separator(),
                q3, a3
        );
        box.setSpacing(10);
        box.setPadding(new Insets(16));

        ScrollPane root = new ScrollPane(box);
        root.setFitToWidth(true);

        Scene scene = new Scene(root, 900, 600);
        stage.setTitle("Lab 4 - IT2660 (JavaFX)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

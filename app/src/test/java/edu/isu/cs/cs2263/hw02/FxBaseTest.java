//package edu.isu.cs.cs2263.hw02;
//
//import javafx.scene.input.KeyCode;
//import javafx.scene.input.MouseButton;
//import javafx.stage.Stage;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.testfx.api.FxToolkit;
//import org.testfx.framework.junit5.ApplicationTest;
//
//import java.util.concurrent.TimeoutException;
//
//public abstract class FxBaseTest extends ApplicationTest {
//
//    @BeforeEach
//    public void setUpClass() throws Exception {
//        ApplicationTest.launch(App.class);
//    }
//
//    @Override public void start(Stage stage) throws Exception {
//        stage.show();
//    }
//
//    @AfterEach
//    public void afterEachTest() throws TimeoutException {
//        FxToolkit.hideStage();
//        release(new KeyCode[]{});
//        release(new MouseButton[]{});
//    }
//}

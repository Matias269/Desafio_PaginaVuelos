package Test;

import Pages.Landing;
import Utils.Base;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class TrainTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private ArrayList<String> data;

    private Landing landing;

    @BeforeEach
    public void setup() {
        String browser="chrome";
        driver = Base.setupDriver(browser);
        landing = new Landing(driver);
        landing.loadPage("https://www.rumbo.es/");
    }

    @Test
    public void TC001(){
        landing.closeCookies();

    }

    @AfterEach
    public void postConditions(){
        landing.closeBrowser();
    }

}

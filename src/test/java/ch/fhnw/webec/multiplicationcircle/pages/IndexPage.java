package ch.fhnw.webec.multiplicationcircle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IndexPage {

    private static final String URL = "http://localhost:%d";

    private final WebDriver driver;

    @FindBy(id = "segment-count")
    private WebElement segmentCount;

    @FindBy(id = "multiplier")
    private WebElement multiplier;

    @FindBy(tagName = "button")
    private WebElement sendButton;

    @FindBy(tagName = "line")
    private List<WebElement> lines;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillOutForm(int segmentCountValue, int multiplierValue) {

        // TODO: Add code to also set the segmentCount
        segmentCount.clear();
        segmentCount.sendKeys(Integer.toString(segmentCountValue));

        multiplier.clear();
        multiplier.sendKeys(Integer.toString(multiplierValue));
        sendButton.click();
    }

    public int getLineCount() {
        return lines.size();
    }

    public static IndexPage to(WebDriver driver, int port) {
        driver.get(String.format(URL, port));
        return PageFactory.initElements(driver, IndexPage.class);
    }
}

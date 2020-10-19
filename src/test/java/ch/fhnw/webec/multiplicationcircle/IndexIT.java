package ch.fhnw.webec.multiplicationcircle;

import ch.fhnw.webec.multiplicationcircle.pages.IndexPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IndexIT {

    @LocalServerPort
    private int port;

    private final WebDriver driver = new HtmlUnitDriver();

    @Test
    void initialPageShouldNotShowLines() {
        // when
        final IndexPage page = IndexPage.to(driver, port);

        // then
        assertThat(page.getLineCount()).isZero();
    }

    // TODO: Write a test to ensure that the number of <line>-elements is equal to the provided segment count
    @Test
    void segmentCountTenShouldShowTenLines() {
        // given
        final IndexPage page = IndexPage.to(driver, port);

        // when
        page.fillOutForm(10, 2);

        // then
        assertThat(page.getLineCount()).isEqualTo(10);
    }
}

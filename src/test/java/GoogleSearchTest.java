import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {
    @Test
    void selenideSearchTest() {
        open("https://google.com");
        $(byName("q")).val("selenide").pressEnter();
        $("#search").shouldHave(text("selenide.org"));
    }
}

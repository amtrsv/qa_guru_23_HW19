import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class GitHubTest extends TestBase {
    @Test
    @DisplayName("Проверяем заголовок страницы")
    public void gitHubTitleTest() {
        assertThat(title()).contains("GitHub: Let’s build from here · GitHub");

    }
}



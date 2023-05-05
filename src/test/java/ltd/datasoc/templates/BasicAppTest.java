package ltd.datasoc.templates;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class BasicAppTest {
  @Value("${app.mode}")
  private String mode;

  @Test
  void basicTest() {
    String expectedMode = "UT";
    assertThat(mode).isEqualTo(expectedMode);
  }

}
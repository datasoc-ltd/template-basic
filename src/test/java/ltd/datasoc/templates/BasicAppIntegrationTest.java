package ltd.datasoc.templates;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
@ActiveProfiles("int")
public class BasicAppIntegrationTest {
  @Value("${app.mode}")
  private String mode;

  @Test
  void basicTest() {
    String expectedMode = "IT";
    assertThat(mode).isEqualTo(expectedMode);
  }
}

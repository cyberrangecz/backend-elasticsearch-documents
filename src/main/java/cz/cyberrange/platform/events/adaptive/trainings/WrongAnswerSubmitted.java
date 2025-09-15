package cz.cyberrange.platform.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** The type Wrong answer submitted. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@Schema(name = "Wrong Answer Submitted", description = "Type of event from trainings.")
@JsonRootName("event")
public class WrongAnswerSubmitted extends AbstractAuditAdaptivePOJO {

  @Schema(description = "Answer content.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "answer_content", required = true)
  private String answerContent;

  @Schema(
      description = "The number of wrong try (indicates the sequence number of the wrong answer).",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "count", required = true)
  private int count;
}

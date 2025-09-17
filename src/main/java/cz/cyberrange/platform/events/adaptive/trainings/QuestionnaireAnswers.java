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

/** The type Assessment answers. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@Schema(name = "Questionnaire Answers", description = "Type of event from trainings.")
@JsonRootName("event")
public class QuestionnaireAnswers extends AbstractAuditAdaptivePOJO {

  @Schema(
      description = "Only on assessment level type, data format is JSON.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("answers")
  private Object answers;
}

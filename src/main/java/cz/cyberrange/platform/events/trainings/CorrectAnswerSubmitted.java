package cz.cyberrange.platform.events.trainings;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.cyberrange.platform.events.AbstractAuditPOJO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** The type Correct Answer Submitted. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@JsonRootName("event")
public class CorrectAnswerSubmitted extends AbstractAuditPOJO {

  @Schema(description = "Answer Content.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "answer_content", required = true)
  @JsonAlias("flag_content")
  private String answerContent;
}

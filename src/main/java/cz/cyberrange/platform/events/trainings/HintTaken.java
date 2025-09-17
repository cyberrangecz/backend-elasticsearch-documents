package cz.cyberrange.platform.events.trainings;

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

/** The type Hint taken. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@Schema(name = "Hint Taken", description = "Type of event from trainings.")
@JsonRootName("event")
public class HintTaken extends AbstractAuditPOJO {

  @Schema(
      description = "Id of hint that is being taken",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "hint_id", required = true)
  private long hintId;

  @Schema(description = "Hint penalty points.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "hint_penalty_points", required = true)
  private int hintPenaltyPoints;

  @Schema(description = "Hint title.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "hint_title", required = true)
  private String hintTitle;
}

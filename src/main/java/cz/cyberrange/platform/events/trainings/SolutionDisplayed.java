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

/** The type Solution displayed. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@Schema(name = "Solution Displayed", description = "Type of event from trainings.")
@JsonRootName("event")
public class SolutionDisplayed extends AbstractAuditPOJO {

  @Schema(
      name = "Penalty points",
      description = "Solution displayed penalty points.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "penalty_points", required = true)
  private int penaltyPoints;
}

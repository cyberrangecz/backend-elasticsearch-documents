package cz.cyberrange.platform.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.cyberrange.platform.events.adaptive.trainings.enums.PhaseType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** The type Level started. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@Schema(
    name = "Phase Started",
    description = "Type of event from trainings (when phase is started).")
@JsonRootName("event")
public class PhaseStarted extends AbstractAuditAdaptivePOJO {

  @Schema(description = "Phase Type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "phase_type", required = true)
  private PhaseType phaseType;

  @Schema(description = "Level title.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "phase_title", required = true)
  private String phaseTitle;
}

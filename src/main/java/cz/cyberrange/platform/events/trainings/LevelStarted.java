package cz.cyberrange.platform.events.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.cyberrange.platform.events.AbstractAuditPOJO;
import cz.cyberrange.platform.events.trainings.enums.LevelType;
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
    name = "Level Started",
    description = "Type of event from trainings (when level is started).")
@JsonRootName("event")
public class LevelStarted extends AbstractAuditPOJO {

  @Schema(description = "Level Type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "level_type", required = true)
  private LevelType levelType;

  @Schema(description = "Max Score.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "max_score", required = true)
  private int maxScore;

  @Schema(description = "Level title.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "level_title", required = true)
  private String levelTitle;
}

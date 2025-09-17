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

/** The type Training run ended. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@Schema(name = "Training Run Ended", description = "Type of event from trainings.")
@JsonRootName("event")
public class TrainingRunEnded extends AbstractAuditAdaptivePOJO {

  @Schema(description = "Training run start time.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "start_time", required = true)
  private long startTime;

  @Schema(description = "Training run end time.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "end_time", required = true)
  private long endTime;
}

package cz.cyberrange.platform.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * This class have to be extended when some event should be saved to Elasticsearch. It provides 2
 * member variables 'timestamp' and 'type': 'timestamp' is generated based on current time 'type' is
 * generated based on your pojoClass (name of package + class name)
 */
@Schema(
    name = "Parent class for all audit POJO classes",
    description =
        "This class have to be extended when some event should be saved to Elasticsearch."
            + " It provides 2 member variables 'timestamp' and 'type': 'timestamp' is generated based on current time 'type'"
            + " is generated based on your pojoClass (name of package + class name).")
@JsonPropertyOrder({"type", "timestamp"})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(
      value = QuestionnaireAnswers.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.QuestionnaireAnswers"),
  @JsonSubTypes.Type(
      value = CorrectAnswerSubmitted.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.CorrectAnswerSubmitted"),
  @JsonSubTypes.Type(
      value = CorrectPasskeySubmitted.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.CorrectPasskeySubmitted"),
  @JsonSubTypes.Type(
      value = PhaseCompleted.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.PhaseCompleted"),
  @JsonSubTypes.Type(
      value = PhaseStarted.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.PhaseStarted"),
  @JsonSubTypes.Type(
      value = SolutionDisplayed.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.SolutionDisplayed"),
  @JsonSubTypes.Type(
      value = TrainingRunEnded.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.TrainingRunEnded"),
  @JsonSubTypes.Type(
      value = TrainingRunResumed.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.TrainingRunResumed"),
  @JsonSubTypes.Type(
      value = TrainingRunStarted.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.TrainingRunStarted"),
  @JsonSubTypes.Type(
      value = TrainingRunSurrendered.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.TrainingRunSurrendered"),
  @JsonSubTypes.Type(
      value = WrongAnswerSubmitted.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.WrongAnswerSubmitted"),
  @JsonSubTypes.Type(
      value = WrongPasskeySubmitted.class,
      name = "cz.cyberrange.platform.events.adaptive.trainings.WrongPasskeySubmitted")
})
@SuperBuilder
@Getter
public abstract class AbstractAuditAdaptivePOJO {

  @Schema(description = "Sandbox ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "sandbox_id", required = true)
  protected String sandboxId;

  @Schema(description = "Pool ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "pool_id", required = true)
  protected Long poolId;

  @Schema(description = "Training definition ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "training_definition_id", required = true)
  protected long trainingDefinitionId;

  @Schema(description = "Training instance ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "training_instance_id", required = true)
  protected long trainingInstanceId;

  @Schema(description = "Training run ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "training_run_id", required = true)
  protected long trainingRunId;

  @Schema(
      description = "The time in particular training run (in particular training).",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "training_time", required = true)
  protected long trainingTime;

  @Schema(description = "Training phase ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "phase_id", required = true)
  protected long phaseId;

  @Schema(description = "Training phase order.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "phase_order", required = true)
  protected long phaseOrder;

  @Schema(description = "Training task ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "task_id", required = true)
  protected Long taskId;

  @Schema(description = "Training task order.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "task_order", required = true)
  protected Integer taskOrder;

  @Schema(description = "Id of player in the training run")
  @JsonProperty("user_ref_id")
  protected long userRefId;

  @Schema(
      description = "The time at which the event occurred.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "timestamp", required = true)
  @Setter
  protected long timestamp;

  @Schema(description = "Type of event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "type", required = true)
  @Setter
  protected String type;

  /** Instantiates a new Abstract audit pojo. */
  protected AbstractAuditAdaptivePOJO() {}

  /**
   * Instantiates a new Abstract audit pojo.
   *
   * @param timestamp the timestamp
   * @param type the type
   */
  protected AbstractAuditAdaptivePOJO(long timestamp, String type) {
    this.timestamp = timestamp;
    this.type = type;
  }

  @Override
  public String toString() {
    return "AbstractAuditPOJO [timestamp=" + timestamp + ", type=" + type + "]";
  }
}

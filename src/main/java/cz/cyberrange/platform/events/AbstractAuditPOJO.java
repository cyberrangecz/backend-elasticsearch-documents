package cz.cyberrange.platform.events;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import cz.cyberrange.platform.events.trainings.AssessmentAnswers;
import cz.cyberrange.platform.events.trainings.CorrectAnswerSubmitted;
import cz.cyberrange.platform.events.trainings.CorrectPasskeySubmitted;
import cz.cyberrange.platform.events.trainings.HintTaken;
import cz.cyberrange.platform.events.trainings.LevelCompleted;
import cz.cyberrange.platform.events.trainings.LevelStarted;
import cz.cyberrange.platform.events.trainings.SolutionDisplayed;
import cz.cyberrange.platform.events.trainings.TrainingRunEnded;
import cz.cyberrange.platform.events.trainings.TrainingRunResumed;
import cz.cyberrange.platform.events.trainings.TrainingRunStarted;
import cz.cyberrange.platform.events.trainings.TrainingRunSurrendered;
import cz.cyberrange.platform.events.trainings.WrongAnswerSubmitted;
import cz.cyberrange.platform.events.trainings.WrongPasskeySubmitted;
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
      value = AssessmentAnswers.class,
      name = "cz.cyberrange.platform.events.trainings.AssessmentAnswers"),
  @JsonSubTypes.Type(
      value = CorrectAnswerSubmitted.class,
      name = "cz.cyberrange.platform.events.trainings.CorrectFlagSubmitted"),
  @JsonSubTypes.Type(
      value = CorrectAnswerSubmitted.class,
      name = "cz.cyberrange.platform.events.trainings.CorrectAnswerSubmitted"),
  @JsonSubTypes.Type(
      value = CorrectPasskeySubmitted.class,
      name = "cz.cyberrange.platform.events.trainings.CorrectPasskeySubmitted"),
  @JsonSubTypes.Type(
      value = HintTaken.class,
      name = "cz.cyberrange.platform.events.trainings.HintTaken"),
  @JsonSubTypes.Type(
      value = LevelCompleted.class,
      name = "cz.cyberrange.platform.events.trainings.LevelCompleted"),
  @JsonSubTypes.Type(
      value = LevelStarted.class,
      name = "cz.cyberrange.platform.events.trainings.LevelStarted"),
  @JsonSubTypes.Type(
      value = SolutionDisplayed.class,
      name = "cz.cyberrange.platform.events.trainings.SolutionDisplayed"),
  @JsonSubTypes.Type(
      value = TrainingRunEnded.class,
      name = "cz.cyberrange.platform.events.trainings.TrainingRunEnded"),
  @JsonSubTypes.Type(
      value = TrainingRunResumed.class,
      name = "cz.cyberrange.platform.events.trainings.TrainingRunResumed"),
  @JsonSubTypes.Type(
      value = TrainingRunStarted.class,
      name = "cz.cyberrange.platform.events.trainings.TrainingRunStarted"),
  @JsonSubTypes.Type(
      value = TrainingRunSurrendered.class,
      name = "cz.cyberrange.platform.events.trainings.TrainingRunSurrendered"),
  @JsonSubTypes.Type(
      value = WrongAnswerSubmitted.class,
      name = "cz.cyberrange.platform.events.trainings.WrongFlagSubmitted"),
  @JsonSubTypes.Type(
      value = WrongAnswerSubmitted.class,
      name = "cz.cyberrange.platform.events.trainings.WrongAnswerSubmitted"),
  @JsonSubTypes.Type(
      value = WrongPasskeySubmitted.class,
      name = "cz.cyberrange.platform.events.trainings.WrongPasskeySubmitted")
})
@SuperBuilder
@Getter
public abstract class AbstractAuditPOJO {

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
  @JsonAlias("game_time")
  protected long trainingTime;

  @Schema(
      description = "Actual score of the player in the level.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "actual_score_in_level", required = true)
  protected int actualScoreInLevel;

  @Schema(
      description =
          "ID for the training run level that is generated when the training definition with levels is created or uploaded.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "level", required = true)
  protected long level;

  @Schema(
      description = "Order of the level in the training definition.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "level_order", required = true)
  protected long levelOrder;

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

  @Schema(
      description = "Total score of the player achieved in the training levels.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "total_training_level_score", required = true)
  @JsonAlias("total_game_level_score")
  private int totalTrainingScore;

  @Schema(
      description = "Total score of the player achieved in the assessment levels.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "total_assessment_level_score", required = true)
  private int totalAssessmentScore;

  /** Instantiates a new Abstract audit pojo. */
  protected AbstractAuditPOJO() {}

  /**
   * Instantiates a new Abstract audit pojo.
   *
   * @param timestamp the timestamp
   * @param type the type
   */
  protected AbstractAuditPOJO(long timestamp, String type) {
    this.timestamp = timestamp;
    this.type = type;
  }

  @Override
  public String toString() {
    return "AbstractAuditPOJO [timestamp=" + timestamp + ", type=" + type + "]";
  }
}

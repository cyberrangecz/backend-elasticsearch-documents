package cz.muni.csirt.kypo.events;

import com.fasterxml.jackson.annotation.*;
import cz.muni.csirt.kypo.events.trainings.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * This class have to be extended when some event should be saved to Elasticsearch. It provides 2
 * member variables 'timestamp' and 'type': 'timestamp' is generated based on current time 'type' is
 * generated based on your pojoClass (name of package + class name)
 */
@ApiModel(value = "Parent class for all audit POJO classes",
        description = "This class have to be extended when some event should be saved to Elasticsearch."
                + " It provides 2 member variables 'timestamp' and 'type': 'timestamp' is generated based on current time 'type'"
                + " is generated based on your pojoClass (name of package + class name).")
@JsonPropertyOrder({"type", "timestamp"})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AssessmentAnswers.class, name = "cz.muni.csirt.kypo.events.trainings.AssessmentAnswers"),
        @JsonSubTypes.Type(value = CorrectAnswerSubmitted.class, name = "cz.muni.csirt.kypo.events.trainings.CorrectFlagSubmitted"),
        @JsonSubTypes.Type(value = CorrectAnswerSubmitted.class, name = "cz.muni.csirt.kypo.events.trainings.CorrectAnswerSubmitted"),
        @JsonSubTypes.Type(value = HintTaken.class, name = "cz.muni.csirt.kypo.events.trainings.HintTaken"),
        @JsonSubTypes.Type(value = LevelCompleted.class, name = "cz.muni.csirt.kypo.events.trainings.LevelCompleted"),
        @JsonSubTypes.Type(value = LevelStarted.class, name = "cz.muni.csirt.kypo.events.trainings.LevelStarted"),
        @JsonSubTypes.Type(value = SolutionDisplayed.class, name = "cz.muni.csirt.kypo.events.trainings.SolutionDisplayed"),
        @JsonSubTypes.Type(value = TrainingRunEnded.class, name = "cz.muni.csirt.kypo.events.trainings.TrainingRunEnded"),
        @JsonSubTypes.Type(value = TrainingRunResumed.class, name = "cz.muni.csirt.kypo.events.trainings.TrainingRunResumed"),
        @JsonSubTypes.Type(value = TrainingRunStarted.class, name = "cz.muni.csirt.kypo.events.trainings.TrainingRunStarted"),
        @JsonSubTypes.Type(value = TrainingRunSurrendered.class, name = "cz.muni.csirt.kypo.events.trainings.TrainingRunSurrendered"),
        @JsonSubTypes.Type(value = WrongAnswerSubmitted.class, name = "cz.muni.csirt.kypo.events.trainings.WrongFlagSubmitted"),
        @JsonSubTypes.Type(value = WrongAnswerSubmitted.class, name = "cz.muni.csirt.kypo.events.trainings.WrongAnswerSubmitted")
})
@SuperBuilder
@Getter
public abstract class AbstractAuditPOJO {

    @ApiModelProperty(value = "Sandbox ID.", required = true)
    @JsonProperty(value = "sandbox_id", required = true)
    protected Long sandboxId;
    @ApiModelProperty(value = "Pool ID.", required = true)
    @JsonProperty(value = "pool_id", required = true)
    protected Long poolId;
    @ApiModelProperty(value = "Training definition ID.", required = true)
    @JsonProperty(value = "training_definition_id", required = true)
    protected long trainingDefinitionId;
    @ApiModelProperty(value = "Training instance ID.", required = true)
    @JsonProperty(value = "training_instance_id", required = true)
    protected long trainingInstanceId;
    @ApiModelProperty(value = "Training run ID.", required = true)
    @JsonProperty(value = "training_run_id", required = true)
    protected long trainingRunId;
    @ApiModelProperty(value = "The time in particular training run (in particular training).", required = true)
    @JsonProperty(value = "training_time", required = true)
    @JsonAlias("game_time")
    protected long trainingTime;
    @ApiModelProperty(value = "Total score of the player achieved in the training levels.", required = true)
    @JsonProperty(value = "total_training_level_score", required = true)
    @JsonAlias("total_game_level_score")
    private int totalTrainingScore;
    @ApiModelProperty(value = "Total score of the player achieved in the assessment levels.", required = true)
    @JsonProperty(value = "total_assessment_level_score", required = true)
    private int totalAssessmentScore;
    @ApiModelProperty(value = "Actual score of the player in the level.", required = true)
    @JsonProperty(value = "actual_score_in_level", required = true)
    protected int actualScoreInLevel;
    @ApiModelProperty(value = "ID for the training run level that is generated when the training definition with levels is created or uploaded.", required = true)
    @JsonProperty(value = "level", required = true)
    protected long level;
    @ApiModelProperty(value = "Order of the level in the training definition.", required = true)
    @JsonProperty(value = "level_order", required = true)
    protected long levelOrder;
    @ApiModelProperty(value = "Id of player in the training run")
    @JsonProperty(value = "user_ref_id")
    protected long userRefId;
    @ApiModelProperty(value = "The time at which the event occurred.", required = true)
    @JsonProperty(value = "timestamp", required = true)
    @Setter
    protected long timestamp;
    @ApiModelProperty(value = "Type of event.", required = true)
    @JsonProperty(value = "type", required = true)
    @Setter
    protected String type;

    /**
     * Instantiates a new Abstract audit pojo.
     */
    public AbstractAuditPOJO() {
    }

    /**
     * Instantiates a new Abstract audit pojo.
     *
     * @param timestamp the timestamp
     * @param type      the type
     */
    public AbstractAuditPOJO(long timestamp, String type) {
        this.timestamp = timestamp;
        this.type = type;
    }

    @Override
    public String toString() {
        return "AbstractAuditPOJO [timestamp=" + timestamp + ", type=" + type + "]";
    }

}

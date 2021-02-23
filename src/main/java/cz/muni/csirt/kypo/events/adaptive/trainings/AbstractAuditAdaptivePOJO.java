package cz.muni.csirt.kypo.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
        @JsonSubTypes.Type(value = QuestionnaireAnswers.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.QuestionnaireAnswers"),
        @JsonSubTypes.Type(value = CorrectAnswerSubmitted.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.CorrectAnswerSubmitted"),
        @JsonSubTypes.Type(value = PhaseCompleted.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.PhaseCompleted"),
        @JsonSubTypes.Type(value = PhaseStarted.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.PhaseStarted"),
        @JsonSubTypes.Type(value = SolutionDisplayed.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.SolutionDisplayed"),
        @JsonSubTypes.Type(value = TrainingRunEnded.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.TrainingRunEnded"),
        @JsonSubTypes.Type(value = TrainingRunResumed.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.TrainingRunResumed"),
        @JsonSubTypes.Type(value = TrainingRunStarted.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.TrainingRunStarted"),
        @JsonSubTypes.Type(value = TrainingRunSurrendered.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.TrainingRunSurrendered"),
        @JsonSubTypes.Type(value = WrongAnswerSubmitted.class, name = "cz.muni.csirt.kypo.events.adaptive.trainings.WrongAnswerSubmitted")
})
@SuperBuilder
@Getter
public abstract class AbstractAuditAdaptivePOJO {

    @ApiModelProperty(value = "Sandbox ID.", required = true)
    @JsonProperty(value = "sandbox_id", required = true)
    protected long sandboxId;
    @ApiModelProperty(value = "Pool ID.", required = true)
    @JsonProperty(value = "pool_id", required = true)
    protected long poolId;
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
    protected long trainingTime;
    @ApiModelProperty(value = "Training phase ID.", required = true)
    @JsonProperty(value = "phase_id", required = true)
    protected long phaseId;
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
    public AbstractAuditAdaptivePOJO() {
    }

    /**
     * Instantiates a new Abstract audit pojo.
     *
     * @param timestamp the timestamp
     * @param type      the type
     */
    public AbstractAuditAdaptivePOJO(long timestamp, String type) {
        this.timestamp = timestamp;
        this.type = type;
    }

    @Override
    public String toString() {
        return "AbstractAuditPOJO [timestamp=" + timestamp + ", type=" + type + "]";
    }

}

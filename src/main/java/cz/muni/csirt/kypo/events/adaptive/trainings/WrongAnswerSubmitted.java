package cz.muni.csirt.kypo.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * The type Wrong answer submitted.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@ApiModel(value = "Wrong Answer Submitted", description = "Type of event from trainings.")
@JsonRootName(value = "event")
public class WrongAnswerSubmitted extends AbstractAuditAdaptivePOJO {

    @ApiModelProperty(value = "Training task ID.", required = true)
    @JsonProperty(value = "task_id", required = true)
    private Long taskId;
    @ApiModelProperty(value = "Answer content.", required = true)
    @JsonProperty(value = "answer_content", required = true)
    private String answerContent;
    @ApiModelProperty(value = "The number of wrong try (indicates the sequence number of the wrong answer).", required = true)
    @JsonProperty(value = "count", required = true)
    private int count;

}

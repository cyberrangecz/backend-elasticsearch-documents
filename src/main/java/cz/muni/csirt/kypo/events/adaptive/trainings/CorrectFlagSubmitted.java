package cz.muni.csirt.kypo.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


/**
 * The type Correct flag submitted.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@JsonRootName(value = "event")
public class CorrectFlagSubmitted extends AbstractAuditAdaptivePOJO {

    @ApiModelProperty(value = "Training task ID.", required = true)
    @JsonProperty(value = "task_id", required = true)
    private Long taskId;
    @ApiModelProperty(value = "Flag Content.", required = true)
    @JsonProperty(value = "flag_content", required = true)
    private String flagContent;
}

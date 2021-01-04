package cz.muni.csirt.kypo.events.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.AbstractAuditPOJO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


/**
 * The type Hint taken.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@ApiModel(value = "Hint Taken", description = "Type of event from trainings.")
@JsonRootName(value = "event")
public class HintTaken extends AbstractAuditPOJO {

    @ApiModelProperty(value = "Id of hint that is being taken", required = true)
    @JsonProperty(value = "hint_id", required = true)
    private long hintId;
    @ApiModelProperty(value = "Hint penalty points.", required = true)
    @JsonProperty(value = "hint_penalty_points", required = true)
    private int hintPenaltyPoints;
    @ApiModelProperty(value = "Hint title.", required = true)
    @JsonProperty(value = "hint_title", required = true)
    private String hintTitle;
}

package cz.muni.csirt.kypo.events.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.AbstractAuditPOJO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * The type Solution displayed.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@ApiModel(value = "Solution Displayed", description = "Type of event from trainings.")
@JsonRootName(value = "event")
public class SolutionDisplayed extends AbstractAuditPOJO {

    @ApiModelProperty(value = "Solution displayed penalty points.", required = true)
    @JsonProperty(value = "penalty_points", required = true)
    private int penaltyPoints;
}



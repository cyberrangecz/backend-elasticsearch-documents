package cz.muni.csirt.kypo.events.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.AbstractAuditPOJO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * The type Wrong flag submitted.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@ApiModel(value = "Wrong Flag Submitted", description = "Type of event from trainings.")
@JsonRootName(value = "event")
public class WrongFlagSubmitted extends AbstractAuditPOJO {

    @ApiModelProperty(value = "Flag content.", required = true)
    @JsonProperty(value = "flag_content", required = true)
    private String flagContent;
    @ApiModelProperty(value = "The number of wrong try (indicates the sequence number of the wrong flag).", required = true)
    @JsonProperty(value = "count", required = true)
    private int count;

}

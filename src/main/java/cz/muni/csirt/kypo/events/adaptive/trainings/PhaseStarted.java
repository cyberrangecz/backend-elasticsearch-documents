package cz.muni.csirt.kypo.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.adaptive.trainings.enums.PhaseType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


/**
 * The type Level started.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@ApiModel(value = "Phase Started", description = "Type of event from trainings (when phase is started).")
@JsonRootName(value = "event")
public class PhaseStarted extends AbstractAuditAdaptivePOJO {

    @ApiModelProperty(value = "Phase Type.", required = true)
    @JsonProperty(value = "phase_type", required = true)
    private PhaseType phaseType;
    @ApiModelProperty(value = "Level title.", required = true)
    @JsonProperty(value = "phase_title", required = true)
    private String phaseTitle;
}

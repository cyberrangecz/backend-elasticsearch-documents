package cz.muni.csirt.kypo.events.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.AbstractAuditPOJO;
import cz.muni.csirt.kypo.events.trainings.enums.LevelType;
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
@ApiModel(value = "Level Started", description = "Type of event from trainings (when level is started).")
@JsonRootName(value = "event")
public class LevelStarted extends AbstractAuditPOJO {

    @ApiModelProperty(value = "Level Type.", required = true)
    @JsonProperty(value = "level_type", required = true)
    private LevelType levelType;
    @ApiModelProperty(value = "Max Score.", required = true)
    @JsonProperty(value = "max_score", required = true)
    private int maxScore;
    @ApiModelProperty(value = "Level title.", required = true)
    @JsonProperty(value = "level_title", required = true)
    private String levelTitle;
}

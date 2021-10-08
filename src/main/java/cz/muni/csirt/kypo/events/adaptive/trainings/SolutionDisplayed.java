package cz.muni.csirt.kypo.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * The type Solution displayed.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@ApiModel(value = "Solution Displayed", description = "Type of event from trainings.")
@JsonRootName(value = "event")
public class SolutionDisplayed extends AbstractAuditAdaptivePOJO {

}



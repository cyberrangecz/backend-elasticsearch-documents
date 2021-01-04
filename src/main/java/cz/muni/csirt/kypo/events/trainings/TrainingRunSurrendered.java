package cz.muni.csirt.kypo.events.trainings;

import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.AbstractAuditPOJO;
import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * The type Training run surrendered.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@ApiModel(value = "Training Run Surrendered", description = "Type of event from trainings (when training run is surrendered).")
@JsonRootName(value = "event")
public class TrainingRunSurrendered extends AbstractAuditPOJO {
}

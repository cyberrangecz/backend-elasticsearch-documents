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
 * The type Training run started.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@ApiModel(value = "Training Run Started", description = "Type of event from trainings (when training run is started).")
@JsonRootName(value = "event")
public class TrainingRunStarted extends AbstractAuditPOJO {
}

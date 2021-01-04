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
 * The type Training run resumed.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@ApiModel(value = "Training Run Resumed", description = "Type of event from trainings.")
@JsonRootName(value = "event")
public class TrainingRunResumed extends AbstractAuditPOJO {
}

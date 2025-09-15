package cz.cyberrange.platform.events.trainings;

import com.fasterxml.jackson.annotation.JsonRootName;
import cz.cyberrange.platform.events.AbstractAuditPOJO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** The type Training run surrendered. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@Schema(
    name = "Training Run Surrendered",
    description = "Type of event from trainings (when training run is surrendered).")
@JsonRootName("event")
public class TrainingRunSurrendered extends AbstractAuditPOJO {}

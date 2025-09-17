package cz.cyberrange.platform.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** The type Training run resumed. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@Schema(name = "Training Run Resumed", description = "Type of event from trainings.")
@JsonRootName("event")
public class TrainingRunResumed extends AbstractAuditAdaptivePOJO {}

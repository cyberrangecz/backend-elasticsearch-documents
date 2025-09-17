package cz.cyberrange.platform.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** The type Training run started. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@Schema(
    name = "Training Run Started",
    description = "Type of event from trainings (when training run is started).")
@JsonRootName("event")
public class TrainingRunStarted extends AbstractAuditAdaptivePOJO {}

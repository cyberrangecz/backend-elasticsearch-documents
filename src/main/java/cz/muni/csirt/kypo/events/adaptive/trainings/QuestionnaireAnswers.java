package cz.muni.csirt.kypo.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


/**
 * The type Assessment answers.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@ApiModel(value = "Questionnaire Answers", description = "Type of event from trainings.")
@JsonRootName(value = "event")
public class QuestionnaireAnswers extends AbstractAuditAdaptivePOJO {

    @ApiModelProperty(value = "Only on assessment level type, data format is JSON.", required = false)
    @JsonProperty(value = "answers", required = false)
    private Object answers;
}
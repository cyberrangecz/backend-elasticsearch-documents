package cz.muni.csirt.kypo.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


/**
 * The type Correct answer submitted.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@JsonRootName(value = "event")
public class CorrectAnswerSubmitted extends AbstractAuditAdaptivePOJO {

    @ApiModelProperty(value = "Answer Content.", required = true)
    @JsonProperty(value = "answer_content", required = true)
    private String answerContent;
}

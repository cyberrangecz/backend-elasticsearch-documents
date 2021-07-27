package cz.muni.csirt.kypo.events.trainings;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.AbstractAuditPOJO;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


/**
 * The type Correct Answer Submitted.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@JsonRootName(value = "event")
public class CorrectAnswerSubmitted extends AbstractAuditPOJO {

    @ApiModelProperty(value = "Answer Content.", required = true)
    @JsonProperty(value = "answer_content", required = true)
    @JsonAlias("flag_content")
    private String answerContent;
}

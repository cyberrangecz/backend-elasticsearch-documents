package cz.muni.csirt.kypo.events.trainings;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.AbstractAuditPOJO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * The type Wrong Answer Submitted.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@ApiModel(value = "Wrong Answer Submitted", description = "Type of event from trainings.")
@JsonRootName(value = "event")
public class WrongAnswerSubmitted extends AbstractAuditPOJO {

    @ApiModelProperty(value = "Answer content.", required = true)
    @JsonProperty(value = "answer_content", required = true)
    @JsonAlias("flag_content")
    private String answerContent;
    @ApiModelProperty(value = "The number of wrong try (indicates the sequence number of the wrong answer).", required = true)
    @JsonProperty(value = "count", required = true)
    private int count;

}

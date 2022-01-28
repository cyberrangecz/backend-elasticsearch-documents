package cz.muni.csirt.kypo.events.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.AbstractAuditPOJO;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


/**
 * The type Correct Passkey Submitted.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@JsonRootName(value = "event")
public class CorrectPasskeySubmitted extends AbstractAuditPOJO {

    @ApiModelProperty(value = "Passkey Content.", required = true)
    @JsonProperty(value = "passkey_content", required = true)
    private String passkeyContent;
}

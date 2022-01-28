package cz.muni.csirt.kypo.events.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.muni.csirt.kypo.events.AbstractAuditPOJO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * The type Wrong Passkey Submitted.
 */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@ApiModel(value = "Wrong Passkey Submitted", description = "Type of event from trainings.")
@JsonRootName(value = "event")
public class WrongPasskeySubmitted extends AbstractAuditPOJO {

    @ApiModelProperty(value = "Passkey content.", required = true)
    @JsonProperty(value = "passkey_content", required = true)
    private String passkeyContent;
}

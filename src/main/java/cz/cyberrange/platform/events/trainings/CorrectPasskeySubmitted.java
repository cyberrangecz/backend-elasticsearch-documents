package cz.cyberrange.platform.events.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import cz.cyberrange.platform.events.AbstractAuditPOJO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** The type Correct Passkey Submitted. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@JsonRootName("event")
public class CorrectPasskeySubmitted extends AbstractAuditPOJO {

  @Schema(description = "Passkey Content.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "passkey_content", required = true)
  private String passkeyContent;
}

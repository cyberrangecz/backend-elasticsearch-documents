package cz.cyberrange.platform.events.adaptive.trainings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** The type Wrong Passkey submitted. */
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
@Schema(name = "Wrong Passkey Submitted", description = "Type of event from trainings.")
@JsonRootName("event")
public class WrongPasskeySubmitted extends AbstractAuditAdaptivePOJO {

  @Schema(description = "Passkey content.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty(value = "passkey_content", required = true)
  private String passkeyContent;
}

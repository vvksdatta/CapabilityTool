package se.bth.didd.wiptool.api;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.rkmk.annotations.ColumnName;

/**
 *Template for inserting a new development environment essential for a sprint.
 */

public class SprintDevelopmentEnvironment {
	@JsonProperty
	@NotNull
	@ColumnName("envId")
	public int envId;

	@JsonProperty
	@ColumnName("envName")
	public String envName;

	public SprintDevelopmentEnvironment() {

	}

	public SprintDevelopmentEnvironment(int envId, String envName) {
		super();
		this.envId = envId;
		this.envName = envName;
	}

	public int getEnvId() {
		return envId;
	}

	public String getEnvName() {
		return envName;
	}

	public void setEnvId(int envId) {
		this.envId = envId;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
	}
}

package se.bth.didd.wiptool.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *Template to get number of participants in a project.
 */

public class NumberOfRolesInProject extends Roles {
	@JsonProperty
	public Integer numberOfPeople;

	public NumberOfRolesInProject(Integer roleId, String roleName, Integer numberOfPeople) {
		super(roleId, roleName);
		this.numberOfPeople = numberOfPeople;
	}

	public NumberOfRolesInProject() {

	}

	public Integer getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(Integer numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

}

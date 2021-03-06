package se.bth.didd.wiptool.api;

import java.util.Date;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.rkmk.annotations.ColumnName;

/**
 *Template for fetching the proficiency details of a programming skill.
 */

public class SkillDetailsforGraphs {
	@JsonProperty
	@NotNull
	@ColumnName("skillName")
	public String skillName;
	
	@JsonProperty
	@ColumnName("proficiency")
	public String proficiency;
	
	@JsonProperty
	@ColumnName("updatedBy")
	public String updatedBy;
	
	@JsonProperty
	@ColumnName("lastUpdate")
	public Date lastUpdate;
	
	public SkillDetailsforGraphs(String skillName, String proficiency, String updatedBy, Date lastUpdate) {
		super();
		this.skillName = skillName;
		this.proficiency = proficiency;
		this.updatedBy = updatedBy;
		this.lastUpdate = lastUpdate;
	}

	public SkillDetailsforGraphs(){
		
	}

	
	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getProficiency() {
		return proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}

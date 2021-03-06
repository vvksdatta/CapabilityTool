package se.bth.didd.wiptool.api;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.rkmk.annotations.ColumnName;

/**
 *Template for fetching skills details for plotting a timeline graph of skills.
 */

public class SkillTimelineGraphs {
	
	@JsonProperty
	@ColumnName("proficiency")
	public String proficiency;
	
	@JsonProperty
	@ColumnName("lastUpdate")
	public Date lastUpdate;
	
	public SkillTimelineGraphs(String proficiency, Date lastUpdate) {
		super();
		this.proficiency = proficiency;
		this.lastUpdate = lastUpdate;
	}


	public SkillTimelineGraphs(){
		
	}


	public String getProficiency() {
		return proficiency;
	}


	public Date getLastUpdate() {
		return lastUpdate;
	}


	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}


	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}

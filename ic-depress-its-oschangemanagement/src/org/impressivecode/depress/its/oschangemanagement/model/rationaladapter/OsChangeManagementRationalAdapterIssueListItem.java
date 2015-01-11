package org.impressivecode.depress.its.oschangemanagement.model.rationaladapter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OsChangeManagementRationalAdapterIssueListItem {
	
	public OsChangeManagementRationalAdapterDetails getIssueType() {
		return issueType;
	}

	public void setIssueType(OsChangeManagementRationalAdapterDetails issueType) {
		this.issueType = issueType;
	}

	public OsChangeManagementRationalAdapterDetails getPriority() {
		return priority;
	}

	public void setPriority(OsChangeManagementRationalAdapterDetails priority) {
		this.priority = priority;
	}

	public String getShortTitle() {
		return shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public ArrayList<OsChangeManagementRationalAdapterDetails> getCreator() {
		return creator;
	}

	public void setCreator(
			ArrayList<OsChangeManagementRationalAdapterDetails> creator) {
		this.creator = creator;
	}

	public ArrayList<OsChangeManagementRationalAdapterDetails> getContributor() {
		return contributor;
	}
	
	public Set<String> getContributorAsSet() {
		Set<String> ret = new HashSet<String>();
		for(OsChangeManagementRationalAdapterDetails item : getContributor()){
			ret.add(getLastPathFragment(item.getAboutUrl()));
		}
 		return ret;
	}

	public void setContributor(
			ArrayList<OsChangeManagementRationalAdapterDetails> contributor) {
		this.contributor = contributor;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@JsonProperty("jira:issueType")
	private OsChangeManagementRationalAdapterDetails issueType;
	
	@JsonProperty("oslc_cmx:priority")
	private OsChangeManagementRationalAdapterDetails priority;	
	
	@JsonProperty("oslc:shortTitle")
	private String shortTitle;
	
	@JsonProperty("dcterms:title")
	private String title;	
	
	@JsonProperty("dcterms:identifier")
	private String identifier;
	
	@JsonProperty("dcterms:creator")
	private ArrayList<OsChangeManagementRationalAdapterDetails> creator;	
	
	@JsonProperty("dcterms:contributor")
	private ArrayList<OsChangeManagementRationalAdapterDetails> contributor;
	
	@JsonProperty("dcterms:created")
	private String created;
	
	@JsonProperty("dcterms:modified")
	private String modified;
	
	@JsonProperty("dcterms:type")
	private String type;
	
	@JsonProperty("oslc_cm:status")
	private String status;
	
	@JsonProperty("jira:resolution")
	private String resolution;
	
	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	private String getLastPathFragment(String path){
		return path.substring(path.lastIndexOf('/') + 1);
	}
	
	public String getFirstCreator(){
		return getLastPathFragment(getCreator().get(0).getAboutUrl());
	}

	public String getPriorityAsString() {
		return getLastPathFragment(getPriority().getAboutUrl());
	}
}

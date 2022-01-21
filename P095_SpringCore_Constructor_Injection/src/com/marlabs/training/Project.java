//create a project class projectid,projectname,project manager,location.

package com.marlabs.training;

public class Project {

	String projectId, projectName, projectManager, location;

	public Project(String projectId, String projectName, String projectManager, String location) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectManager = projectManager;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectManager=" + projectManager
				+ ", location=" + location + "]";
	}

}

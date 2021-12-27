//	how can I mention Time suppose today I have meeting from 2 to 6 and 7 to 8 another meeting how can i display.

package com.marlabs.training;

public class MeetingDetails {
	int empid, roomno;
	String name, Project, meetingstart, meetingend;

	public MeetingDetails(int empid, int roomno, String name, String project, String meetingstart, String meetingend) {
		super();
		this.empid = empid;
		this.roomno = roomno;
		this.name = name;
		Project = project;
		this.meetingstart = meetingstart;
		this.meetingend = meetingend;
	}

	@Override
	public String toString() {
		return "MeetingDetails of Madhusudhan [empid=" + empid + ", roomno=" + roomno + ", name=" + name + ", Project="
				+ Project + ", meetingstart=" + meetingstart + ", meetingend=" + meetingend + "]";
	}
}

package com.marlabs.training.entity;

import java.util.*;

public class Subject {

	private int subjectId;
	private String subjectTitle;
	private int subjectDuration;
	private Set<Book> ref=new HashSet<Book>();
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectTitle() {
		return subjectTitle;
	}
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	public int getSubjectDuration() {
		return subjectDuration;
	}
	public void setSubjectDuration(int subjectDuration) {
		this.subjectDuration = subjectDuration;
	}
	public Set<Book> getRef() {
		return ref;
	}
	public void setRef(Set<Book> ref) {
		this.ref = ref;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectTitle=" + subjectTitle + ", subjectDuration="
				+ subjectDuration + ", ref=" + ref + "]";
	}
	
}

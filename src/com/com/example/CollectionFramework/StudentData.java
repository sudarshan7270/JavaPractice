package com.com.example.CollectionFramework;

import java.util.Objects;

public class StudentData implements Comparable<StudentData> {
	
	int rollNo;
	String name;
	public StudentData(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentData [rollNo=" + rollNo + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentData other = (StudentData) obj;
		return rollNo == other.rollNo;
	}
	@Override
	public int compareTo(StudentData that) {
		return this.rollNo-that.rollNo;
	}
	
	

}

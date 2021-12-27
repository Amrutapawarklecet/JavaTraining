package com.marlabs.training;

import java.util.*;

enum meet {
	Meeting1, Meeting2, Meeting3, Meeting4
};

public class MeetingEnumMap {
	public static void main(String[] args) {
		EnumMap<meet, MeetingDetails> em = new EnumMap<meet, MeetingDetails>(meet.class);
		MeetingDetails ob1 = new MeetingDetails(101, 1, "Madhu", "WMCG", "2PM", "6PM");
		MeetingDetails ob2 = new MeetingDetails(101, 1, "Madhu", "Product Lunch", "6PM", "8PM");
		MeetingDetails ob3 = new MeetingDetails(101, 1, "Madhu", "FMCG", "8PM", "10PM");
		MeetingDetails ob4 = new MeetingDetails(101, 1, "Madhu", "Windows-11", "10PM", "11.30 PM");
		em.put(meet.Meeting1, ob1);
		em.put(meet.Meeting2, ob2);
		em.put(meet.Meeting3, ob3);
		em.put(meet.Meeting4, ob4);
		for (Map.Entry<meet, MeetingDetails> ab : em.entrySet()) {
			System.out.println(ab.getKey() + "    " + ab.getValue());
		}
	}
}

package com.interview.pbms.time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

class Meeting {
	
	int startTime;
	int endTime;
	public Meeting(int s, int e) {
	startTime = s;
	endTime = e;
	}
}
public class MeetinRoomSchedulePrgm {

	
	static int findMinimumMeetingsRequired(List<Meeting> meetings) {
		PriorityBlockingQueue<Integer> priorityQ = new PriorityBlockingQueue<>();
		priorityQ.offer(meetings.get(0).endTime);
		int count=1;
		for(int i=1;i<meetings.size();i++) {
			Meeting meet = meetings.get(i);
			System.out.println("priorityQ.peek():" + priorityQ.peek());
			if(meet.startTime < priorityQ.peek()) {
				count++;
			}else {
				priorityQ.poll();
			}
			priorityQ.offer(meet.endTime);
		}
		System.out.println("count:"+count);
		return count;
	}
	
	static int findMaximumMeetingsCanHappen(List<Meeting> meetings) {
		PriorityBlockingQueue<Integer> priorityQ = new PriorityBlockingQueue<>();
		priorityQ.offer(meetings.get(0).endTime);
		int count=1;
		for(int i=1;i<meetings.size();i++) {
			Meeting meet = meetings.get(i);
			System.out.println("priorityQ.peek():" + priorityQ.peek());
			if(meet.startTime >= priorityQ.peek()) {
				count++;
				priorityQ.poll();
				priorityQ.offer(meet.endTime);
			}
			
		}
		System.out.println("count:"+count);
		return count;
	}
	public static void main(String[] args) {

		Meeting m1 = new Meeting(9, 10);
		Meeting m2 = new Meeting(11, 12);
		Meeting m3 = new Meeting(12, 14);
		Meeting m4 = new Meeting(13, 16);
		Meeting m5 = new Meeting(15, 18);
		Meeting m6 = new Meeting(18, 20);
		
		List<Meeting> meetings = new ArrayList<>();

		meetings.add(m4);
		meetings.add(m5);
		meetings.add(m6);
		meetings.add(m1);
		meetings.add(m2);
		meetings.add(m3);
		
		Collections.sort(meetings,(i1,i2) -> {
			
			//return i1.startTime-i2.startTime;
			if(i1.endTime > i2.endTime) {
				return 1;
			}
			if(i1.endTime < i2.endTime) {
				return -1;
			}
			return 0;
		});
		
		for(Meeting meet: meetings) {
			System.out.println("meet start:"+ meet.startTime + " meet end:" + meet.endTime);
		}
		
		System.out.println(findMinimumMeetingsRequired(meetings));
		System.out.println(findMaximumMeetingsCanHappen(meetings));
		
	}

}

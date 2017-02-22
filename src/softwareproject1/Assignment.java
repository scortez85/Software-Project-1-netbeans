package edu.jsu.mcis;

import java.util.*;

public class Assignment{
	
	private ArrayList<Integer> studentIDs;
	private ArrayList<Integer> scores;
	
	public Assignment(){
		studentIDs = new ArrayList<>();
		scores = new ArrayList<>();
	}
	
	public void addStudentAndScore(int id, int score){
		if (scores.size() == 0){
			scores.add(score);
			studentIDs.add(id);
		}
		else{
			boolean added = false;
			for (int i = 0; i < scores.size() && !added; i++){
				if (scores.get(i) < score){
					scores.add(i, score);
					studentIDs.add(i, id);
					added = true;
				}
			}
			if (!added){
				scores.add(score);
				studentIDs.add(id);
			}
		}
	}
	
	public int getTopStudent(){
		if (studentIDs.size() > 0){
			return studentIDs.get(0);
		}
		return -1;
	}
	
	public int getTopScore(){
		if (scores.size() > 0){
			return scores.get(0);
		}
		return -1;
	}
	
}
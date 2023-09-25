package Demoalp;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{
	private String name;
	private double rating;
	
	
	
	int relDate;
	Movie(String name, double rating, int relDate){
		this.name = name;
		this.rating = rating;
		this.relDate = relDate;
	}
	
	public int compareTo(Movie m) {
		return this.relDate - m.relDate;
	}
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public int getDate() {
		return relDate;
	}

}
public class ObjectComparisionQ {
	
	public static void main(String[] args) {
		ArrayList<Movie> al = new ArrayList<>();
		al.add(new Movie("Batman",8.9,2010));
		al.add(new Movie("SuperMan",7.5,2022));
		al.add(new Movie("Flash",6.2,2004));
		
		Collections.sort(al);
		
		for(Movie m : al) {
			System.out.println("Movie released Date : "+m.getDate()+" "+m.getName());
		}
	}

}

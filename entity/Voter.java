package com.victor.spring_vote.entity;



public class Voter {
	private String candida;

	private String voter;
	
	private String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCandida() {
		return candida;
	}

	public void setCandida(String candida) {
		this.candida = candida;
	}

	public String getVoter() {
		return voter;
	}

	public void setVoter(String voter) {
		this.voter = voter;
	}


}

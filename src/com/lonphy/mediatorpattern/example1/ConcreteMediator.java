package com.lonphy.mediatorpattern.example1;

public class ConcreteMediator {
	private ColleagueA colleagueA;
	private ColleagueB colleagueB;
	private ColleagueC colleagueC;
	public void registerColleagueA(ColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}
	public void registerColleagueB(ColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}
	public void registerColleagueC(ColleagueC colleagueC) {
		this.colleagueC = colleagueC;
	}
	
	public void deliverMsg(Colleague colleague, String[] msg) {
		if(colleague==colleagueA) {
			if(msg.length>=2) {
				colleagueB.receiveMsg(colleague.getName()+msg[0]);
				colleagueC.receiveMsg(colleague.getName()+msg[1]);
			}
		}
		else if(colleague==colleagueB) {
			if(msg.length>=2) {
				colleagueA.receiveMsg(colleague.getName()+msg[0]);
				colleagueC.receiveMsg(colleague.getName()+msg[1]);
			}
		}
		else {
			if(msg.length>=2) {
				colleagueA.receiveMsg(colleague.getName()+msg[0]);
				colleagueB.receiveMsg(colleague.getName()+msg[1]);
			}
		}
	}
}

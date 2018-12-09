package com.MICHZM.game;

public class Posicion {
	private State yoU;
	
	public void SetState(State s){
		this.yoU = s;
	}
	public void ejecutarAccion(){
		yoU.ejecutarAccion();
	}

}

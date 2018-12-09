package com.MICHZM.game;

public abstract class Decorator implements Interumpir{
	
	private Interumpir util;
	
	public Decorator(Interumpir util){
		this.util = util;
	}
	
	protected Interumpir getUtil(){
		return util;
	}

}

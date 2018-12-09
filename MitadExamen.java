package com.MICHZM.game;

public class MitadExamen extends Decorator{

	public MitadExamen(Interumpir util) {
		super(util);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Bachillerato() {
		// TODO Auto-generated method stub
		System.out.println("Machado: Utedes vienen de bacillerato acostubrados hacer las cosas mecanicamente");
		getUtil().Bachillerato();
	}

	@Override
	public void Tecnologia() {
		// TODO Auto-generated method stub
		System.out.println("Machado: Para copiarse se usan los telefonos inteligentes");
		getUtil().Tecnologia();
	}

	@Override
	public void Cheo() {
		// TODO Auto-generated method stub
		System.out.println("Machado: Cheo y yo estabamos hablando de anular inecuaciones, eso se aprende en el bachillerato");
		getUtil().Cheo();
	}

}

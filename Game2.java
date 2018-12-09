package com.MICHZM.game;

import java.util.Scanner;

public class Game2 {
	
	Scanner myScanner= new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	int playerHP;
	int monsterHP;
	String playerWeapon;
	int choice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game2 dublin;
		dublin = new Game2();
		
		dublin.desgraciauru();
		
	}
	
	public void desgraciauru() {
		playerHP = 10000;
		monsterHP = 20;
		
		System.out.println("Eres un estudiante de nuevo ingreso en ingenieria, hoy es tu primer dia de clases y no sabes quienes son tus profesores");
		
		System.out.println("¿Deseas ir hoy a clasas?");
		
		System.out.println("1. Asistir a clase");
		System.out.println("2. No ir a clase");
		
		choice = myScanner.nextInt();
		
		        if(choice==1) {
		        	playerSetUp();
		        }
		        else if (choice==2) {
		        	playerHP = playerHP - 10000;
		        	System.out.println("Tu HP:" + playerHP);
		        	Singleton Sin = new Singleton();
		        	Sin.Estupido();
		        }
		        else {
		        	desgraciauru();
		        }
	}
	
	public void playerSetUp() {
		playerHP = 10000;
		
		playerWeapon = "Steven";
		
		System.out.println("Tu HP: " + playerHP);
		System.out.println("TU Weapon: " + playerWeapon);
		System.out.println("Hoy es tu primera clase de matematica y tu profesor se llama Jose Luis Machado");
		
		Interumpir pelea = new EntendiendoClase("perdertiempo");
		pelea.Bachillerato();
		
		System.out.println("¿Cual ha sido tu primera impresion de Machado?");
		System.out.println("1. Es divertido");
		System.out.println("2. Es ladilla");
		System.out.println("3. Es tierno");
		
		choice = myScanner.nextInt();
				
				if(choice==1) {
					
					playerHP = playerHP - 10000;
					System.out.println("Tu HP: " + playerHP);
					Singleton Sin = new Singleton();
							Sin.Estupido();
				}
				else if(choice==2){
					Really();
				}
				else if(choice==3){
					Posicion posicion = new Posicion();
					Engaño engaño = new Engaño();
					
					playerHP = playerHP + 500;
					System.out.println("Tu HP: " + playerHP);
					posicion.SetState(engaño);
					engaño.ejecutarAccion();
					enterScanner.nextLine();
					playerSetUp();					
				}else {
					playerSetUp();
				}
	}
	
	public void Really(){
		System.out.println("Las semanas han transcurrido e igual que el primer dia, machado es una ladilla.\nSe acerca el primer examen, ¿Que haras?");
		System.out.println("1. Estudiar");
		System.out.println("2. Copiarte");
		System.out.println("3. Abandonar");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			playerHP = playerHP + 500;
			System.out.println("Tu HP: " + playerHP);
			enterScanner.nextLine();
			Test();
		}
		else if(choice==2){
			Posicion posicion = new Posicion();
			Desilucion desilucion = new Desilucion();
			posicion.SetState(desilucion);
			desilucion.ejecutarAccion();
			Singleton Sin = new Singleton();
			Sin.Estupido();
		}
		else if(choice==3){
			System.out.println("Puedes intentarlo otra vez");
			enterScanner.nextLine();
			Really();
		}else{
			Really();
		}
		
	}
	
	public void Test(){
		Posicion posicion = new Posicion();
		Engaño engaño =  new Engaño();
		System.out.println("Hace mas de un mes presentaste el primer examen pero Machado no te ha dado la nota"
				+ "\nHoy es tu primera clase de limites y ya presentaste funciones, Machado tiene 20 minutos de retraso ¿Sabras tu nota de inecuaciones?");
		System.out.println("1. Si");
		System.out.println("2. No");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			posicion.SetState(engaño);
			engaño.ejecutarAccion();
			enterScanner.nextLine();
			desgraciauru();
		}
		else if(choice==2){
			Finally();
		}
		else {
			Test();
			}
	
	}
	
	public void Finally(){
		System.out.println("Machado no te ha entregado ninguna nota y Esparza a botado a Steven de URU. \nNo hay esperaza de pasar la materia, ¿Deseas continuar?");
		System.out.println("1. No quiero seguir");
		System.out.println("2. Me voy a cambiar a administracion");
		System.out.println("3. Continuare");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			playerHP = playerHP - 10000;
					System.out.println("Tu HP:" + playerHP);
					
					Posicion posicion = new Posicion();
					Desilucion desilucion = new Desilucion();
					
					posicion.SetState(desilucion);
					desilucion.ejecutarAccion();
					
					Singleton Sin = new Singleton();
					Sin.Estupido();
		}
		else if(choice==2){
			playerHP = playerHP + 52000;
			System.out.println("Tu HP: " + playerHP);
			Singleton Sin = new Singleton();
			Sin.Ending();
		}
		else if(choice==3){
			Continuo();
		}
		else {
			Finally();
		}
		
	}
	
	public void Continuo(){
		System.out.println("Esta presentando tu examen de limites y el chamo de atras te pide que le pases el telfono a la chama delante de ti");
		Interumpir pelea = new EntendiendoClase("pelear");
		pelea = new MitadExamen(pelea);
		pelea.Bachillerato();
		System.out.println("¿Seras catolico?");
		System.out.println("1. Se lo pasaras");
		System.out.println("2. Continuaras con tu examen");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			
			System.out.println("Machado te ha atrapado en el examen con el telefono");
			
			Interumpir pelea1 = new EntendiendoClase("tiempo");
			pelea1 = new MitadExamen(pelea1);
			pelea1.Tecnologia();
			
			Posicion posicion = new Posicion();
			Desilucion desilucion = new Desilucion();
			posicion.SetState(desilucion);
			posicion.ejecutarAccion();
			
			Singleton Sin = new Singleton();
			Sin.Estupido();
		}
		else if(choice==2){
			Nota();
		}
		else {
			Continuo();
		}
	}
	
	public void Nota(){
		System.out.println("Solo quedan tres semanas para que termine el trimestre. \nPero Machado trajo las notas, ¡DE LOS TRES EXAMENES!");
		System.out.println("1. Inecuaciones");
		System.out.println("2. Funciones");
		System.out.println("3. Limites");
		
		choice = myScanner.nextInt();
				
				if(choice==1){
					Posicion posicion = new Posicion();
					Desilucion desilucion = new Desilucion();
					posicion.SetState(desilucion);
					posicion.ejecutarAccion();
					enterScanner.nextLine();
					Nota();
				}
				else if(choice==2){
					Posicion posicion = new Posicion();
					Desilucion desilucion = new Desilucion();
					posicion.SetState(desilucion);
					posicion.ejecutarAccion();
					enterScanner.nextLine();
					Nota();
				}
				else if(choice==3){
					Posicion posicion = new Posicion();
					Posibilidad posibilidad = new Posibilidad();
					posicion.SetState(posibilidad);
					posicion.ejecutarAccion();
					enterScanner.nextLine();
					Derivadas();
				}
				else{
					Nota();
				}
	}
	
	public void Derivadas(){
		System.out.println("Esta es tu ultima esperanza de pasar la materia");
		System.out.println("Tu HP: " + playerHP);
		System.out.println("Monster HP: " + monsterHP);
		System.out.println("1. Presentaras Derivadas");
		System.out.println("2. Presentaras el recuperativo");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			Chances();
		}
		else if(choice==2){
			Posicion posicion = new Posicion();
			Desilucion desilucion = new Desilucion();
			posicion.SetState(desilucion);
			posicion.ejecutarAccion();
			
			Singleton Sin = new Singleton();
					Sin.Estupido();
		}
		else {
			Derivadas();
		}
	}
	public void Chances(){
		playerWeapon = "JulioProfe";
		int playerDamage = 0;
		
		if(playerWeapon.equals("Steven")) {
			playerDamage = new java.util.Random().nextInt(5);
		} 
		else if(playerWeapon.equals("JulioProfe")) {
			playerDamage = new java.util.Random().nextInt(8);
		}
		System.out.println("Estas resolviendo todo el examen " + playerDamage + "¡Estas teniendo exito!");
		
		monsterHP = monsterHP - playerDamage;
		
		System.out.println("Monstruo HP: " + monsterHP);
		
		if(monsterHP<1) {
			Posicion posicion = new Posicion();
			Posibilidad posibilidad = new Posibilidad();
			posicion.SetState(posibilidad);
			posicion.ejecutarAccion();
			
			Singleton Sin = new Singleton();
			Sin.Ending();
		}
		else if (monsterHP>0) {
			int monsterDamage = 0;
			
			monsterDamage = new java.util.Random().nextInt(4);
			
			System.out.println("El monstruo te ataco y te dio " + monsterDamage + "daño");
			
			playerHP = playerHP - monsterDamage;
			
			System.out.println("Jugador HP: " + playerHP);
			
			if (playerHP<1) {
				Posicion posicion = new Posicion();
				Desilucion desilucion = new Desilucion();
				posicion.SetState(desilucion);
				posicion.ejecutarAccion();
				
				Singleton Sin = new Singleton();
				Sin.Estupido();
			}
			else if(playerHP>0) {
				Derivadas();
			}			
		}
	}	
}

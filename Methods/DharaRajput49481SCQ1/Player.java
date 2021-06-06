
package DharaRajput49481SCQ1;

import java.util.Random;


 
public interface Player {
	     public void playerName();
 
   
    public void fire(int x);
 
 
   public void display(int y);


}

  class Hunter implements Player {
	  

	 public void playerName() {
	        System.out.println("Hunter");
	    }
		

	@Override
	public void fire(int x) {
		System.out.println("Fire: " + x );		
	}

	@Override
	public void display(int y) {
	
		
	}
	 
}
 
 
class Racer implements Player {

	 public void playerName() {
	        System.out.println("Racer");
	    }
	@Override
	public void fire(int x) {
		System.out.println("Fire: " + x );		
	}
	@Override
	public void display(int y) {
	
		
	}
	 
   
}
 
 class Astronaut implements Player {

	 public void playerName() {
	        System.out.println("Astronaut");
	    }
	 
		@Override
		public void fire(int x) {
			System.out.println("Fire: " + x );		
		}

		@Override
		public void display(int y) {
		
			
		}
		 
	   
	}
 
class PoliceMan implements Player {

	 public void playerName() {
	        System.out.println("PoiceMan");
	    }
	 
		@Override
		public void fire(int x) {
			System.out.println("Fire: " + x );		
		}

		@Override
		public void display(int y) {
		
			
		}
		 
	   
	}
 
 class BatMan implements Player {

	 public void playerName() {
	        System.out.println("BatMan");
	    }
		@Override
		public void fire(int x) {
			System.out.println("Fire: " + x );		
		}
		@Override
		public void display(int y) {
		
			
		}
	   
	}





 class MainClass {
	 
    public static void main(String[] args) {
;
 
        Hunter hunter = new Hunter();
        Racer racer = new Racer();
        Astronaut astronaut = new Astronaut();
        PoliceMan police= new PoliceMan();
        BatMan batman=new BatMan();
 
        hunter.playerName();
        racer.playerName();
        astronaut.playerName();
        police.playerName();
        batman.playerName();
 

    }
}
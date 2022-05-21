package shu;

public class Studentmarks {
int steelstructure;
int mechanics;
int geotech;

  public Studentmarks(int steelstructure ,int mechanics,int geotech) {
	  this.steelstructure=steelstructure;
			  this.mechanics=mechanics;
			  this.geotech=geotech;
  }
  public void m1(){
	  System.out.println("steelstructure:"+ steelstructure);
	  System.out.println("mechanics:"+ mechanics);
	  System.out.println("geotech:"+ geotech);
  }
  public static void main(String[]args) {
	  Studentmarks bahubali =new Studentmarks(75,75,75);
	  
	  Studentmarks kattapa =new Studentmarks(80,80,85);
	  
	  Studentmarks devsena =new Studentmarks(60,60,65);
	  
	  System.out.println("marks of bahubali   :");
	  bahubali.m1();
	  
	  
	  System.out.println("marks of kattapa  : ");
	  kattapa.m1();
	  
	  
	  System.out.println("marks of devsena  :" );
	  devsena.m1();
  }
}

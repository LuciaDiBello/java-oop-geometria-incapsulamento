package org.lessons.java.geometria.incapsulamento;

//Classe Rettangolo
//La classe è composta da due campi, un costruttore, i metodi getter e setter, due metodi per il calcolo 
//dell'area e del perimetro della figura geometrica e un metodo per disegnare il rettangolo in console
public class Rettangolo {
	  //Campi
	  private int base;  
	  private int altezza;
	  
	  //Costruttore 
	  public Rettangolo(int base, int altezza) {
		   this.base=base;
		   this.altezza=altezza;
	  }
	  
	  //Metodi getter e setter
	  public int getBase() {
		   return base;
		} 
	  
	  public void setBase (int base) {
		  this.base = base;
		 }
	  
	  public int getAltezza() {
		    return altezza;
		} 
	  
	  public void setAltezza (int altezza) {
		  this.altezza = altezza;
		 }
	  
	  //Metodi 
	  //Il metodo calcolaArea restituisce l'area della figura
	  public int calcolaArea() {
		  int area = this.base*this.altezza;
		  return area;
	  }
	//Il metodo calcolaPerimetro restituisce il perimetro della figura	  
	  public int calcolaPerimetro() {
		  int perimetro = 2*(this.base + this.altezza);
		  return perimetro;
	  }
	 //BONUS
	 //Metodo disegna
	 //Il metodo disegna permette di visualizzare in console il rettangolo 
	  public void disegna() {
		  //indici: contatori del for annidati
		  int i, j;
		  //n = numero di righe da stampare in console, (corrisponde all'altezza del rettangolo)
		  //m = numero di colonne da stampare in console, (corrisponde alla base del rettangolo)
		  int n = this.altezza;
		  int m = this.base;
		    // for annidati
		    for (i = 0; i<n; i++)  //for esterno: scorre il rettangolo lungo la direzione verticale
		     {  for(j = 0; j<m; j++) //for interno: scorre il rettangolo lungo la direzione orizzontale
		            if(i==0 || i==(n-1)) //bordi orizzontali del rettangolo
		            	System.out.print("0");
		            else if(j==0 || j==(m-1))  //bordi verticali del rettangolo
		                	System.out.print("0");
		                 else System.out.print(" ");
		       System.out.println(" ");
		     }
		   
	  }
}

package Modelo;

public class Numero 
{
 private static int i,j,t,m;	 				/*Declaracion de variables para los metodos de ordenamiento*/

 public int[] OrdenarAscendente(int Numeros[])  /*Metodo que retorna un array de numeros ordenados ascendentemente*/
 {
  for(j = 0; j < Numeros.length; j++)	  	  /*Ciclo que itera el array ingresado por parametro*/
  {
   for (i = 0; i < Numeros.length-j-1; i++)   /*Ciclo que itera el array hasta la posicion del primer ciclo menos 2 posiciones*/
   {
    if(Numeros[i] > Numeros[i+1])   /*Pregunta si el numero de la posicion actual es mayor a la siguiente posicion*/
    {
     t = Numeros[i+1]; 				/*Asignacion del numero de la siguiente posicion en una variable*/
     Numeros[i+1] = Numeros[i]; 	/*Asignacion del valor la posicion actual a la siguiente posicion*/
     Numeros[i] = t; 				/*Asignacion del valor de la siguiente posicion a la posicion actual*/
    }
   }
  }
  return Numeros;					/*Retorno de array ordenado]*/
 }
 
 public int[] OrdenarDescendente(int Numeros[])  /*Metodo que retorna un array de numeros ordenados descendentemente*/
 {
  for(j = 0; j < Numeros.length; j++)	  	  /*Ciclo que itera el array ingresado por parametro*/
  {
   for (i = 0; i < Numeros.length-j-1; i++)   /*Ciclo que itera el array hasta la posicion del primer ciclo menos 2 posiciones*/
   {
    if(Numeros[i] < Numeros[i+1])   /*Pregunta si el numero de la posicion actual es menor a la siguiente posicion*/
    {
     t = Numeros[i+1]; 				/*Asignacion del numero de la siguiente posicion en una variable*/
     Numeros[i+1] = Numeros[i]; 	/*Asignacion del valor la posicion actual a la siguiente posicion*/
     Numeros[i] = t; 				/*Asignacion del valor de la siguiente posicion a la posicion actual*/
    }
   }
  }
  return Numeros;					/*Retorno de array ordenado]*/
 }
 
}

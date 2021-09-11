package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JOptionPane;

import Controlador.Main;
import Vista.Index;

public class Archivo 
{
 private static String Array[] = null;		/*Declaracion de variables para el proceso*/
 private static int Array1[] = null;
 
 public int [] LeerArchivo(String Ruta)		/*Metodo que realiza la lectura del archivo plano y retorna los datos en un array*/
 {
  try(BufferedReader in = new BufferedReader(new FileReader(Ruta)))   /*Lectura de data del archivo de la ruta parametrica*/
  {
   String str;
   while ((str = in.readLine()) != null)			/*Ciclo que realiza la lectura de las lineas del archivo*/
   {
	Array= str.split(",");							/*Guardado de valores del archivo en un array*/
   }
      
   Array1 = new int[Array.length];
   
   for(int i = 0; i < Array.length; i++) 							
   {
    Array1[i]= Integer.parseInt(Array[i]);  	    /*Asignacion de los valores del array a un array tipo entero*/
   }
  }
  catch (IOException e) 							/*Control de excepciones*/
  {
   JOptionPane.showMessageDialog(null,"Error al leer el archivo, verifique la ruta");
  }
  return Array1;	/*Retorno de los valores del archivo en un array*/
 }
 
 
 public int GenerarArchivo(int Array[],String Ruta)	   /*Metodo que realiza la creacion del archivo plano con los datos ordenados*/
 {
  FileWriter fichero = null;	/*Declaracion de objeto para escritura de archivo*/
  int val;
  try 
  {
   fichero = new FileWriter(Ruta);	    /*Asignacion de ruta y nombre de archivo a generar*/

   for(int x=0; x<Array.length; x++)    /*Ciclo que itera el array ordenado y realiza la escritura de los valores en el archivo*/
   {
	if(x<(Array.length-1))
	{
	 fichero.write(Array[x] + ",");		/*Escritura en el archivo*/
	}
	else
	{
	 fichero.write(Array[x] + "");		/*Escritura en el archivo*/
	}
   }
   
   fichero.close();
   JOptionPane.showMessageDialog(null,"Archivo generado correctamente");
   val = 1;
  } 
  catch (Exception ex) 			/*Control de excepciones*/
  {
   JOptionPane.showMessageDialog(null,"Error al generar el archivo, verifique la ruta");
   val = 0;
  }
  return val;
 }
 
}

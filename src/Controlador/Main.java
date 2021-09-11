package Controlador;

import java.util.Iterator;

import javax.swing.JOptionPane;

import Modelo.Archivo;
import Modelo.Numero;
import Vista.Index;

public class Main 
{
 public static int [] Array1;	/*Declaracion de variables para el proceso*/
 public static int [] Array2;

 /*Proceso que se encarga de realizar los llamados a los metodos de ordenamiento y/o lectura y escritura segun las interaciones en la interfa*/
 public int GuardarArchivo(Boolean ResRuta, Boolean ResOpcion,String Tipo,String RutaE,String RutaS)
 {
  int res=0;
  Archivo A = new Archivo();   /*Declaracion de objeto de la clase archivo*/
  Numero N = new Numero();	   /*Declaracion de objeto de la clase numero*/
  
  if(ResRuta==true && ResOpcion==true)	 /*Validacicon de datos enviados en la interfaz de usuario*/
  {
   Array1= A.LeerArchivo(RutaE);		 /*Llamado a metodo para lectura del archivo*/

   if(Array1!=null)					    /*Validacion de contenido del archivo*/		
   {
	if(Tipo.contains("A"))
	{
     Array2 = N.OrdenarAscendente(Array1);		/*Llamado a metodo para ordenamiento ascendente*/
	}
	else
	{
	 Array2 = N.OrdenarDescendente(Array1);		/*Llamado a metodo para ordenamiento descendente*/
	}
	res=A.GenerarArchivo(Array2,RutaS);			/*Llamado a metodo para generacion de archivo*/
   }
  }
  else
  {
   if(ResRuta==false)
   {
	JOptionPane.showMessageDialog(null,"Ingrese las rutas del archivo inicial y final");
   }
   else if (ResOpcion==false)
   {
	JOptionPane.showMessageDialog(null,"Seleccione una opcion de ordenamiento");
   }
  }
  return res;
 }
 
 public static void main(String[] args)	
 { 
  Index I = new Index();		/*Ejecucion de interfaz de usuario*/
  I.setVisible(true);
 }

}

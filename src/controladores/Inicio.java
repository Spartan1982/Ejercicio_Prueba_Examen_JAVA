package controladores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dtos.Vehiculo;

public class Inicio {

	public static <Propietario> void main(String[] args) throws FileNotFoundException {

		/**
		 * comentar todo
		*minimo 3 servicios
		*-Menu ciclico,  interfaz e implementacion, -Operativa fichero, -Resto
		*
		*
		*Realiza una carga inicial de datos, de vehiculos y propietarios desde un fichero. Se crea el fichero con el nombre "vehiculosYpropietarios.txt"
		*
		*con 2 dtos. Vehiculo y propietario
		*
		*vehiculo: id, matricula, fecha matriculacion, campo controlar vehiculo es historico o no
		*propietario: id, dni, fecha compra, matricula
		*
		*
		*estructura fichero: campos separados ; 
		* matricula  (formato 1111xxx), 
		* fecha matriculacion(dd-MM-yyyy), 
		* dni (11111111X)
		* fecha compra 
		* 
		* 
		* 
		* fichero: abrir fichero, bucle(linea no nula) lectura en array, guardar en lista string,
		*  bucle (lista/array string), split (caracter), new DTO, lista.add()
		*  
		* **/
		
		
		String rutaFichero= "C:\\Users\\Jaime\\eclipse-workspace\\Ejercicio_Practica_Examen\\vehiculosYpropietarios.txt";
		
		List<Propietario> propietarios = new ArrayList<>();
		List<Vehiculo> vehiculos = new ArrayList<>();
		try {
		FileReader carga = new FileReader (rutaFichero);
		BufferedReader carga1 = new BufferedReader(carga);
		
		String linea;
		while ((linea = carga1.readLine()) !=null) {
			
			System.out.println(linea);
			
		}
		
		
			
		}catch(IOException e) {
			System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
		}
		
	}

}

Algoritmo sin_titulo
	
		// Variables generales
		Definir limite, suma, multiplo Como Entero
		Definir arboles, i, totalNaranjas Como Entero
		Definir numero, copia, digito, invertido, cantidadDigitos Como Entero
		Definir clave, pares, impares, j Como Entero
		
		// === Estacion 1 ===
		Escribir "===== ESTACION 1 ====="
		Escribir "Digite un numero limite:"
		Leer limite
		
		suma <- 0
		Para multiplo <- 5 Hasta limite Con Paso 5 Hacer
			suma <- suma + multiplo
		FinPara
		
		Escribir "La suma de los multiplos de 5 hasta ", limite, " es: ", suma
		Si suma > 100 Entonces
			Escribir "Ganaste un pase especial."
		SiNo
			Escribir "No alcanzaste el puntaje necesario."
		FinSi
		
		
		// === Estacion 2 ===
		Escribir "===== ESTACION 2 ====="
		Escribir "Cuantos arboles hay en la fila?"
		Leer arboles
		
		totalNaranjas <- 0
		Para i <- 1 Hasta arboles Hacer
			Si i MOD 2 = 0 Entonces
				totalNaranjas <- totalNaranjas + 2
			SiNo
				totalNaranjas <- totalNaranjas + 1
			FinSi
		FinPara
		
		Escribir "Pepito obtuvo un total de ", totalNaranjas, " naranjas."
		
		
		// === Estacion 3 ===
		Escribir "===== ESTACION 3 ====="
		Escribir "Ingrese un numero para invertirlo:"
		Leer numero
		
		invertido <- 0
		copia <- numero
		cantidadDigitos <- 0
		
		// Contar cantidad de digitos
		temp <- numero
		Para j <- 1 Hasta 20 Hacer
			Si temp > 0 Entonces
				cantidadDigitos <- cantidadDigitos + 1
				temp <- (temp - (temp MOD 10)) / 10
			FinSi
		FinPara
		
		// Invertir usando Para
		Para j <- 1 Hasta cantidadDigitos Hacer
			digito <- copia MOD 10
			invertido <- invertido * 10 + digito
			copia <- (copia - (copia MOD 10)) / 10
		FinPara
		
		Escribir "El numero invertido es: ", invertido
		
		
		// === Estacion 4 ===
		Escribir "===== ESTACION 4 ====="
		Escribir "Ultima prueba, ingrese un numero para el codigo secreto:"
		Leer clave
		
		pares <- 0
		impares <- 0
		cantidadDigitos <- 0
		temp <- clave
		
		// Contar digitos
		Para j <- 1 Hasta 20 Hacer
			Si temp > 0 Entonces
				cantidadDigitos <- cantidadDigitos + 1
				temp <- (temp - (temp MOD 10)) / 10
			FinSi
		FinPara
		
		// Revisar cada digito
		Para j <- 1 Hasta cantidadDigitos Hacer
			digito <- clave MOD 10
			Si digito MOD 2 = 0 Entonces
				pares <- pares + 1
			SiNo
				impares <- impares + 1
			FinSi
			clave <- (clave - (clave MOD 10)) / 10
		FinPara
		
		Escribir "Digitos pares: ", pares
		Escribir "Digitos impares: ", impares
		
		Si pares > impares Entonces
			Escribir "Acceso concedido"
			Escribir "Pepito logro salir de la feria!"
		SiNo
			Escribir "Acceso denegado"
			Escribir "Pepito quedo atrapado para siempre..."
		FinSi
	FinAlgoritmo

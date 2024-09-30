package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {
		int numValor = 5;

		int[] arrayInt = createAndInitializeArray(numValor);

		showInlineArray(arrayInt);

	}

	// Método createAndInitializeArray
	public static int[] createAndInitializeArray(int valor){
		int[] arrayInt = new int[valor];
		for (int i = 0; i < valor; i++){
			arrayInt[i] = i+1;
			//System.out.println("Valor: " + i);
		}
		return arrayInt;

	}
	public static void showInlineArray(int[] arrayInt){
		StringBuilder strArray = new StringBuilder();

		for (int i = 0; i < arrayInt.length; i++ ){
			strArray.append("Numero" + arrayInt[i]);
			if (i < (arrayInt.length - 1)) {
				strArray.append(" ");
			}
		}
		System.out.println(strArray.toString());
	}

}

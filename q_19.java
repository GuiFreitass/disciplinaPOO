package br.edu.principal;

import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
/* Sabe-se que para iluminar de maneira correta os cómodos de uma casa, para cada m²,
* deve-se usar 18 W de potência. Faça um programa que receba as duas dimensões de um cômodo (em metros), calcule
* e mostre a sua área (em m²) e a potència de iluminação que deverá ser utilizada. */


Scanner sc =  new Scanner (System.in);
System.out.println("Digite a altura do seu cômodo: ");
double altura = sc.nextDouble();
System.out.println("Digite o comprimento do seu cômodo: ");
double comprimento = sc.nextDouble();
double area = altura * comprimento;
double potencia  = 18 * area;

System.out.println("A área do seu cômodo é  " + area + "m², para isso você precisará de uma iluminação de " + potencia + "kHw.");
}
}
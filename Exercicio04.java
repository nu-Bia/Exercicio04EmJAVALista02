//4) O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e 
//dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor seja de 28% e os 
//impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro, calcular e escrever o custo 
//final ao consumidor. 
import java.util.Scanner;

public class Exercicio04 {
	
public static void main (String[]args) {
	
double imposto = 45, imposto1, imposto2,impostofinal,novo,fabricacao;

double distribuidor = 0.28; 

Scanner sc = new Scanner(System.in);

System.out.println ("Digite o custo de fabrica��o");

fabricacao = sc.nextInt();

imposto1 = fabricacao * imposto;
imposto2 = fabricacao * distribuidor;
impostofinal = imposto1 + imposto2;
novo = impostofinal + fabricacao;

System.out.println(" O custo final ao consumidor ser� de :  " + novo);


}}
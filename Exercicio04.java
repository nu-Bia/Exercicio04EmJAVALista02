//4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e 
//dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os 
//impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo 
//final ao consumidor. 
import java.util.Scanner;

public class Exercicio04 {
	
public static void main (String[]args) {
	
double imposto = 45, imposto1, imposto2,impostofinal,novo,fabricacao;

double distribuidor = 0.28; 

Scanner sc = new Scanner(System.in);

System.out.println ("Digite o custo de fabricação");

fabricacao = sc.nextInt();

imposto1 = fabricacao * imposto;
imposto2 = fabricacao * distribuidor;
impostofinal = imposto1 + imposto2;
novo = impostofinal + fabricacao;

System.out.println(" O custo final ao consumidor será de :  " + novo);


}}
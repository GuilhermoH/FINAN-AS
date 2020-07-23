package entities;

import java.util.Scanner;

import Types.Farm;
import Types.Food;
import Types.Health;
import Types.Services;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		///objetos
		Food countFood=new Food();
		Farm countFarm=new Farm();
		Health countHealth=new Health();
		Services countServices=new Services();
		///variaveis
		int i=0;
		double countTotal=0;
		while(i<1) {
		
		System.out.println("Digite o opção que você adicionar as sua contagem, ao selecionar informe todos os gastos dela!");
		System.out.println("C= COMIDA E SUPER     F= FAZENDA  H=SAÚDE   S= SERVIÇOS T=TOTAL  ");
		String op=sc.nextLine(); 
		
		switch (op){
		case "c":
			int a=0;
			while(a<1) {
			System.out.println("COMIDA E SUPER");
			System.out.println("VALOR:");
			double value=sc.nextDouble();
			if(value==0) {
				a++;	
			}
			else{
				countFood.addFood(value);
				countTotal=countTotal+value;
				System.out.println("Registrado");
			}	
		}
		case "f":
			int b=0;
			while(b<1) {
				System.out.println("GASTOS FAZENDA");
				System.out.print("VALOR:");
				double value1=sc.nextDouble();
				if(value1==0) {
					b++;
				}
				else {
					countFarm.addFarm(value1);
					countTotal=countTotal+value1;
					System.out.println("REGISTRADO");
				}	
			}
		case "h":
			int c=0;
			while(c<1) {
			System.out.println("GASTOS SAÚDE");
			System.out.println("VALOR:");
			double value2=sc.nextDouble();
			if (value2==0) {
				c++;
			}
			else {
				countHealth.addHealth(value2);;
				countTotal=countTotal+value2;
				System.out.println("REGISTRADO");
			}
			
		}
		case "s":
			int d=0;
			while(d<1) {
				System.out.println("GASTOS SERVIÇOS GERAIS");
				System.out.println("VALOR:");
				 double value3=sc.nextDouble();
				 if (value3==0) {
					 d++;
				 }
				 else {
					 countServices.addServices(value3);
					 countTotal=countTotal+value3;
					 System.out.println("REGISTRADO");
				 }
			}
		
			
		case "t":
			System.out.println("COMIDA E SUPER = "+countFood.getFood());
			System.out.println("FAZENDA = "+countFarm.getFarm());
			System.out.println("SAÚDE = "+countHealth.getHealth());
			System.out.println("SERVIÇOS GERAIS = "+ countServices.getServices());
			System.out.println("TOTAL = "+countTotal);
			i++;
		}		
}
}
}

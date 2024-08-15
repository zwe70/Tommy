package day_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainApp {
	static BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		ArrayList<Animal> animals = new ArrayList<>();
		int animalCount = 0;
		String flag = "";
		do {
			System.out.println("Enter animal name : ");
			String name = br.readLine();
			System.out.println("Enter animal age : ");
			int age = Integer.parseInt(br.readLine());
			System.out.println("Enter species : ");
			String species = br.readLine();
			
			Animal animal = new Animal();
			animal.name = name;
			animal.age = age;
			animal.species = species;
			animals.add(animal);
			animalCount++;
			
			System.out.println("Do you want to add more animals : 'Yes' / 'No' : ");
			flag = br.readLine();
		}
		while(flag.equalsIgnoreCase("yes"));
		
		System.out.println("Total number of animals : " + animalCount);
		for(int i = 0;i < animalCount;i++) {
			 System.out.println("Animal "+(i+1)+ " :");
			 animals.get(i).display();
		}
		
		

	}

}

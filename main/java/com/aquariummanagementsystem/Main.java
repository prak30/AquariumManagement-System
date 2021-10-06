package com.aquariummanagementsystem;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome To Aquarium Management System");

		Fish fighterFish = new FighterFish();
		fighterFish.length = 2;
		fighterFish.colour = Fish.Colour.WHITE;
		fighterFish.price = 200;
		fighterFish.id = "ff001";

		Fish goldFish = new GoldFish();
		goldFish.length = 3;
		goldFish.colour = Fish.Colour.GOLD;
		goldFish.price = 100;
		goldFish.id = "gf001";

		Fish shark = new Shark();
		shark.length = 8;
		shark.colour = Fish.Colour.BLACK;
		shark.price = 500;
		shark.id = "s001";

		Fish suckerFish = new SuckerFish();
		suckerFish.length = 5;
		suckerFish.colour = Fish.Colour.SILVER;
		suckerFish.price = 150;
		suckerFish.id = "sf001";

		Fish tigerFish = new TigerFish();
		tigerFish.length = 4;
		tigerFish.colour = Fish.Colour.RED;
		tigerFish.price = 300;
		tigerFish.id = "tf001";

		Fish tiger1 = new TigerFish();
		tiger1.length = 5;
		tiger1.colour = Fish.Colour.BLUE;
		tiger1.price = 320;
		tiger1.id = "tf001";

		FishStore fishStore = new FishStore();

		fishStore.add(fighterFish);
		fishStore.add(goldFish);
		fishStore.add(shark);
		fishStore.add(suckerFish);
		fishStore.add(tigerFish);
		fishStore.add(tiger1);

//		String object = new String("abc");

		UserInterface userInterface = new UserInterface();
		userInterface.print(fishStore.getFishList());

		fishStore.remove(suckerFish);
		System.out.println("After Deletion");
		userInterface.print(fishStore.getFishList());
	}
}

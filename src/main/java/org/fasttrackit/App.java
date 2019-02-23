package org.fasttrackit;

import java.util.Date;


public class App {

    public static void main( String[] args ) {
        Rescuer rescuer = new Rescuer();
        rescuer.name = "Josh";
        rescuer.money = 500;
        rescuer.workProgram = 8;
        rescuer.occupation = "Mechanic";
        rescuer.typeHouse = "Apartment";

        Animal animal = new Animal();
        animal.name = "Maya";
        animal.age = 2.5;
        animal.gender = "Female";
        animal.color ="White";
        animal.size = "Medium";
        animal.race = "Bichon";
        animal.healthLevel = 10;
        animal.happinessLevel = 10;
        animal.hungerLevel = 5;
        animal.favoriteActivityName = "Running";
        animal.favoriteFoodName = "Breed";

        EntertaimentActivity activity = new EntertaimentActivity();
        activity.name = "Running";
        activity.location = "Park";
        activity.time = 1;
        activity.toys = "ball";

        Food food = new Food();
        food.name = "DogFood";
        food.quantity = 10;
        food.price = 79.99;
        food.inStock = true;
        food.expiryDate = new Date(2018);
        food.manufacturer = "DogFood";
        food.substance ="Protein";
        food.type ="Dry";

        MedicalStaff medic = new MedicalStaff();
        medic.name = "Dr. Dany";
        medic.specialization = "General Medicine";
        medic.experience = true;
        medic.location = "City";
        medic.services = "General";

        Hygiene hygiene = new Hygiene();
        hygiene.products = "Shampoo";
        hygiene.method = "Wash";

        Devices devices = new Devices();
        devices.name ="Chip";
        devices.type = "Follow";
        devices.manufacturer ="Tractive";

        Necessity necessity = new Necessity();
        necessity.type = "Attention";
        necessity.documentation ="Books";

        Game game = new Game();
        game.rescuer = rescuer;
        game.animal = animal;
        game.medic = medic;
    }
}

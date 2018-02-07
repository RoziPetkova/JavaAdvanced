package petClinics.logic;

import java.util.HashMap;
import java.util.Map;

import petClinics.Clinic;
import petClinics.Pet;

public class CommandInterpreture {

    private Map<String, Clinic> clinics;
    private Map<String, Pet> pets;

    public CommandInterpreture() {
        this.clinics = new HashMap<>();
        this.pets = new HashMap<>();
    }

    public void readCommand(String line) {
        String[] args = line.split("\\s+");
        String cmd = args[0];

        switch (cmd) {
            case "Create":
                this.execCreate(args);
                break;
            case "Add":
                this.execAdd(args);
                break;
            case "Release":
                this.execRelease(args);
                break;
            case "HasEmptyRooms":
                this.execHasEmptyRooms(args);
                break;
            case "Print":
                this.execPrint(args);
                break;
        }
    }

    private void execPrint(String[] args) {
        String clinicName = args[1];

        switch (args.length) {
            case 2:
                this.clinics.get(clinicName).print();
                break;
            case 3:
                int roomNumber = Integer.parseInt(args[2]) - 1;
                this.clinics.get(clinicName).print(roomNumber);
                break;
        }
    }

    private void execHasEmptyRooms(String[] args) {
        String clinicName = args[1];

        if (! this.clinics.containsKey(clinicName)) {
            System.out.println(Boolean.FALSE);
        } else {
            boolean result = this.clinics.get(clinicName).hasEmptyRooms();
            System.out.println(result);
        }
    }

    private void execRelease(String[] args) {
        String clinicName = args[1];

        boolean result = this.clinics.get(clinicName).release();
        System.out.println(result);
    }

    private void execAdd(String[] args) {
        String petName = args[1];
        String clinicName = args[2];

        Pet pet = this.pets.remove(petName);
        boolean result = this.clinics.get(clinicName).add(pet);

        System.out.println(result);
    }

    private void execCreate(String[] args) {
        String type = args[1];

        switch (type) {
            case "Clinic":
                this.execCreateClinic(args);
                break;
            case "Pet":
                this.execCreatePet(args);
                break;
        }
    }

    private void execCreatePet(String[] args) {
        String name = args[2];
        int age = Integer.parseInt(args[3]);
        String kind = args[4];

        Pet pet = new Pet(name, age, kind);
        this.pets.put(name, pet);
    }

    private void execCreateClinic(String[] args) {
        String name = args[2];
        int rooms = Integer.parseInt(args[3]);

        try {
            Clinic clinic = new Clinic(name, rooms);
            this.clinics.put(name, clinic);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

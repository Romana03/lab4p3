public class Main {
    public static void main(String[] args) {
        // Creare două instanțe ale clasei Dog folosind constructorul
        Dog dog1 = new Dog("Max", "Labrador");
        Dog dog2 = new Dog("Bella", "Poodle");

        // Afisare informatii initiale
        System.out.println("Informatii initiale:");
        displayDogInfo(dog1);
        displayDogInfo(dog2);

        // Modificare proprietăți folosind setter-ele
        dog1.setName("Rocky");
        dog2.setBreed("Golden Retriever");

        // Afisare informatii actualizate
        System.out.println("\nInformatii actualizate:");
        displayDogInfo(dog1);
        displayDogInfo(dog2);
    }

    // Metoda pentru afișarea informațiilor despre un câine
    public static void displayDogInfo(Dog dog) {
        System.out.println("Name: " + dog.getName());
        System.out.println("Breed: " + dog.getBreed());
        System.out.println();
    }
}
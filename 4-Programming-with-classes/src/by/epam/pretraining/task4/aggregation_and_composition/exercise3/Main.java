package by.epam.pretraining.task4.aggregation_and_composition.exercise3;

/**
 * Создать объект класса Государство, используя Область, Район, Город. Методы: вывести на консоль столицу, количество
 * областей, площадь, областные центры.
 */

public class Main {
    public static void main(String[] args) {

        City capital = new City("Minsk", 1_992_685, 348.84);
        City city1 = new City("Molodechno", 95_011, 33.33);
        City city2 = new City("Grodno", 373_547, 142.11);
        City city3 = new City("Vitebsk", 378_459, 134.64);
        City city4 = new City("Slutsk", 50_320, 25.96);
        City city5 = new City("Brest", 350_616, 146.12);

        District district1 = new District("Molodechnenskij", city1, 136_835, 1392.10);
        District district2 = new District("Grodnenskij", city2, 450_512, 2594.05);
        District district3 = new District("Vitebskij", city3, 410_510, 2737.85);
        District district4 = new District("Slutskij", city4, 91_059, 1821.06);

        Region region1 = new Region("Minskaja", capital);
        region1.addDistrict(district1);
        region1.addDistrict(district4);

        Region region2 = new Region("Vitebskii", city3);
        region2.addDistrict(district3);

        Region region3 = new Region("Grodnenskaja", city2);
        region3.addDistrict(district2);

        State state = new State("Belarus", capital);

        state.addRegion(region1);
        state.addRegion(region2);

        System.out.println("The capital: " + state.getCapital());

        System.out.println("The number of regions = " + state.getRegionNumber());

        System.out.println("The square = " + state.getSquare());

        System.out.println("Regional centers: " + capital.toString() + ", " +
                city2.toString() + ", " + city3.toString() + ", " + city5.toString());
    }
}

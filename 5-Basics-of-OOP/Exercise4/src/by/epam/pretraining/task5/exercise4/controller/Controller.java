package by.epam.pretraining.task5.exercise4.controller;

import by.epam.pretraining.task5.exercise4.entity.Cavern;
import by.epam.pretraining.task5.exercise4.entity.Gold;

import java.util.ArrayList;

public class Controller {
    private Cavern cavern = Cavern.getInstance();
    private ArrayList<Gold> goldArrayList = cavern.getGoldInCave();

    public int getMostExpensiveGold(){
        int maxCost = 0;
        int maxNumber = 0;
        for (Gold gold : goldArrayList){
            if (maxCost < gold.getCost()){
                maxCost = gold.getCost();
                maxNumber = gold.getNumber();
            }
        }
        System.out.println("The most expensive gold number: " + maxNumber + " with cost: " + maxCost + " \n");
        return maxNumber;
    }

    public void sortByCost(){
        goldArrayList.sort(Gold::compareTo);
    }

    public ArrayList<Gold> getGoldBySum(int sum) {
        ArrayList<Gold> goldBySum = new ArrayList<>();
        sortByCost();
        int currentSum = 0;
        int counter = 1;
        for (int i = 0; i < goldArrayList.size(); i++){
            currentSum += goldArrayList.get(i).getCost();
            goldBySum.add(goldArrayList.get(i));
            if (currentSum - sum < 10 && currentSum - sum > 0 || currentSum == sum){
                System.out.println("Most suitable gold: " + currentSum + "\n");
                return goldBySum;
            }else if (currentSum - sum >= 10){
                currentSum = 0;
                i = counter;
                counter++;
            }
        }
        System.out.println("Most suitable gold: " + currentSum + "\n");
        return  goldBySum;
    }

    public void printGold(){
        for (Gold gold : goldArrayList){
            System.out.println(gold);
        }
    }
}

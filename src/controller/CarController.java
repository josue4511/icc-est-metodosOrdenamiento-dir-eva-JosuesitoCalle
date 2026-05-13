package controller;

import models.Car;

public class CarController {

    public void sortByName(Car[] cars) {
        if (cars == null || cars.length <= 1) {
            return;
        }

        for (int i = 1; i < cars.length; i++) {
            Car key = cars[i];
            
       
            if (key == null) continue;

            int j = i - 1;

            
            while (j >= 0 && cars[j] != null && 
                   cars[j].getName().compareToIgnoreCase(key.getName()) > 0) {
                
                cars[j + 1] = cars[j];
                j--;
            }
           
            cars[j + 1] = key;
        }
    }
}
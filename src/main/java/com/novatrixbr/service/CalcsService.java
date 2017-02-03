package com.novatrixbr.service;

import com.novatrixbr.model.MacroData;
import org.springframework.stereotype.Service;

/**
 * Created by bruno on 2/2/17.
 */

@Service
public class CalcsService {

    public double getImc(double weight, double height) {
        double squaredHeight = height*height;
        return weight / squaredHeight;
    }

    public int getEnergyIngestion(double weight, int coeficient) {
        return (int) (weight * coeficient);
    }

    public MacroData getBalancedMacroDistribution(
            double energy, double consumedCarbs, double consumedLips, double consumedPtr) {

        double carbsInGrams = (energy * 0.65) / 4;
        double lipsInGrams = (energy * 0.2) / 9;
        double proteinInGrams = (energy * 0.15) / 4;

        double carbsInPercentage = macroInPercentage(consumedCarbs, carbsInGrams);
        double lipsInPercentage = macroInPercentage(consumedLips, lipsInGrams);
        double ptrInPercentage = macroInPercentage(consumedPtr, proteinInGrams);

        MacroData data = new MacroData();
        data.setCarbs(carbsInPercentage);
        data.setLips(lipsInPercentage);
        data.setProteins(ptrInPercentage);

        return data;
    }

    public MacroData getLowCarbMacroDistribution(
            double energy, double consumedCarbs, double consumedLips, double consumedPtr) {

        double carbsInGrams = (energy * 0.15) / 4;
        double lipsInGrams = (energy * 0.6) / 9;
        double proteinInGrams = (energy * 0.25) / 4;

        double carbsInPercentage = macroInPercentage(consumedCarbs, carbsInGrams);
        double lipsInPercentage = macroInPercentage(consumedLips, lipsInGrams);
        double ptrInPercentage = macroInPercentage(consumedPtr, proteinInGrams);

        MacroData data = new MacroData();
        data.setCarbs(carbsInPercentage);
        data.setLips(lipsInPercentage);
        data.setProteins(ptrInPercentage);

        return data;

    }

    public void getCustomMacroDistribution() {
        //TODO
    }

    private double macroInPercentage(double consumed, double dailyTotal) {
        return (consumed * 100) / dailyTotal;
    }

}

package com.pluralsight.cardealership;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ContractFileManager {
    public void saveContract(Contract contract) {
        try {
            FileWriter writer = new FileWriter("src/main/resources/contracts.csv", true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("\n" + contract.formatContract(contract, contract.getVehicle()));
            buffer.close();

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

package ua.lviv.iot.ClothingStore.manager.impl;

import ua.lviv.iot.ClothingStore.manager.IStoreWriter;
import ua.lviv.iot.ClothingStore.model.Clothes;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class StoreWriter implements IStoreWriter {
    @Override
    public void writeCSV(List<Clothes> solmar) {
        String writerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "ClothingStore//src//main//resources", File.separator, "result.csv");
        try (FileWriter writer = new FileWriter(writerResPath)) {
            String lastClassName = "";
            for (var clothes : solmar) {
                if (!clothes.getClass().getSimpleName().equals(lastClassName)) {
                    writer.write(clothes.getHeaders());
                    writer.write("\n");
                    lastClassName = clothes.getClass().getSimpleName();
                }
                writer.write(clothes.toCSV());
                writer.write("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


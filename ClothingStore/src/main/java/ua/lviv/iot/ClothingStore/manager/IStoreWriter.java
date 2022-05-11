package ua.lviv.iot.ClothingStore.manager;

import ua.lviv.iot.ClothingStore.model.Clothes;

import java.util.List;

public interface IStoreWriter {
    void writeCSV(List<Clothes> solmar);
}

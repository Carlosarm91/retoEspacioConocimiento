package utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExtraerData {
    public static List<Map<String, String>> deExcel(){
        List<Map<String, String>> data;
        try {
            data = LecturaArchivoExcel.leerDatosHojaExcel("src/main/resources/data/data.xlsx","numeros");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}

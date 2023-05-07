package org.example;

import com.opencsv.CSVReader;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

//https://www.geeksforgeeks.org/mapping-csv-to-javabeans-using-opencsv/
public class CsvToBean {
    public List<Class<?>> csvToBean(String filePath, Class TestDataClass, Map<String,String> map_columns) {

        HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
        strategy.setType(TestDataClass);
        strategy.setColumnMapping(map_columns);

        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        com.opencsv.bean.CsvToBean csvToBean = new com.opencsv.bean.CsvToBean();
        List<Class<?>> list= csvToBean.parse(strategy,csvReader);

        return  list;
    }

}

package org.example.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

@Data
public class TestData  {
    @CsvBindByPosition(position = 1)
    String testdata1;
    @CsvBindByPosition(position = 2)
    String testdata2;
    @CsvBindByPosition(position = 3)
    String testdata3;
    @CsvBindByPosition(position = 4)
    String testdata4;

    @Override
    public String toString() {
        return "TestData{" +
                "testdata1='" + testdata1 + '\'' +
                ", testdata2='" + testdata2 + '\'' +
                ", testdata3='" + testdata3 + '\'' +
                ", testdata4='" + testdata4 + '\'' +
                '}';
    }
}

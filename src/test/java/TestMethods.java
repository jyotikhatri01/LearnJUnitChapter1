import org.example.CsvToBean;
import org.example.model.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(Parameterized.class)
public class TestMethods {

    @Parameterized.Parameter(0)
    public TestData testdata;

    @Test
    public void TestMethod(){
       System.out.println(testdata.getTestdata1()+" "+testdata.getTestdata2()+" "+
               testdata.getTestdata3()+" "+testdata.getTestdata4());
   }

   @Parameterized.Parameters
    public static Object[][] data() {
        Map<String, String> mapping = new HashMap<String, String>();
        mapping.put("testdata1","testdata1");
        mapping.put("testdata2","testdata2");
        mapping.put("testdata3","testdata3");
        mapping.put("testdata4","testdata4");
        CsvToBean csvToBean= new CsvToBean();
        List<Class<?>> list= csvToBean.csvToBean("src/main/resources/testdata - testdata.csv", TestData.class,mapping);
        return new Object[][] {{ list.get(0)}, {list.get(1)},{list.get(2)}};
    }

}

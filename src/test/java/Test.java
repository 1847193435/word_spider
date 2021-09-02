import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {

    @org.junit.Test
    public void test1(){
        try{
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            // 指定配置文件，这里最好是使用绝对路径
            File configFile = new File("D:\\Coding\\IntellijProjects\\spider\\src\\main\\resources\\mbg.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

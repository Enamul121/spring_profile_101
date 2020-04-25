package com.app.dstest;

import com.app.config.DataSourceConfig;
import com.app.ds.DummyDataSources;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataSourceConfig.class)
@WebAppConfiguration
@ActiveProfiles("qa")
public class DataSourcesTest {


    @Autowired
    private DummyDataSources dataSources;

    @Test
    public void testDataSource() {
        System.out.println( dataSources.getConnection());
    }
}

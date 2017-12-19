package com.test.api.common;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public abstract class BusinessLayerTestBase {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

}
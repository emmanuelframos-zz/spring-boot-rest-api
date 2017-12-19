package com.test.api.web.rest.v1;

import com.api.domain.ApplicationUser;
import com.api.parser.ApplicationUserParser;
import com.api.service.ApplicationUserService;
import com.api.web.rest.v1.controller.ApplicationUserRestController;
import com.test.api.common.WebLayerTestBase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ApplicationUserControllerTest extends WebLayerTestBase {

    @InjectMocks
    private ApplicationUserRestController applicationUserRestController;

    @Mock
    private ApplicationUserService applicationUserServiceMock;

    @SpyBean
    private ApplicationUserParser applicationUserServiceParserSpy;

    @Mock
    private Authentication authentication;

    @Mock
    private SecurityContext securityContext;

    @Before
    public void setUp(){
        super.setUp(applicationUserRestController);
    }

    @Test
    public void testAllFieldsAssembling() throws Exception {

        ApplicationUser dummy = new ApplicationUser();
        dummy.setUsername("dummy username");
        dummy.setPassword("dummy password");

        when(applicationUserServiceMock.getAllUsers()).thenReturn(Arrays.asList(dummy));

        when(securityContext.getAuthentication()).thenReturn(authentication);
        when(authentication.getPrincipal()).thenReturn(dummy);

        SecurityContextHolder.setContext(securityContext);

        mockMvc.perform(get("/api/v1/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("[0].username", is(dummy.getUsername())))
                .andExpect(jsonPath("[0].password", is(dummy.getPassword())));
    }
}

package camt.se234.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import camt.se234.project.dao.UserDao;
import camt.se234.project.entity.User;
import camt.se234.project.service.AuthenticationService;
import camt.se234.project.service.AuthenticationServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthenticationServiceTestsXls {

	@Autowired
	AuthenticationService authSrv;

	@Test
	public void testAuth() {  //test authentication with the data from xlsx file.
		assertThat(authSrv, is(notNullValue()));
		User admin = authSrv.authenticate("admin", "admin");
		assertThat(admin, is(notNullValue()));
		assertThat(admin.getRole(), is("admin"));
		User fail = authSrv.authenticate("user", "wrongPass");
		assertThat(fail, is(nullValue()));
	}

}

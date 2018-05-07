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
public class AuthenticationServiceTests {

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

	@Test
	public void testAuthMock() { //test authentication with mock data.
		UserDao userDao = mock(UserDao.class);
		((AuthenticationServiceImpl) authSrv).setUserDao(userDao);
		assertThat(userDao, is(notNullValue()));

		when(userDao.getUser("mockadmin", "adminpass")).thenReturn(new User("mockadmin", "adminpass", "admin"));
		when(userDao.getUser("mockuser", "userpass")).thenReturn(new User("mockuser", "userpass", "user"));
		when(userDao.getUser("mockhello", "hellopass")).thenReturn(new User("mockhello", "hellopass", "user"));

		User admin = authSrv.authenticate("mockadmin", "adminpass");
		assertThat(admin, is(notNullValue()));
		assertThat(admin.getRole(), is("admin"));
		User fail = authSrv.authenticate("mockuser", "wrongPass");
		assertThat(fail, is(nullValue()));
	}
}

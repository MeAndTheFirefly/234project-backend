package camt.se234.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import camt.se234.project.dao.UserDao;
import camt.se234.project.entity.User;
import camt.se234.project.service.AuthenticationService;
import camt.se234.project.service.AuthenticationServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthenticationServiceTestsMock {

	// @Autowired
	AuthenticationService authSrv;
	
	@Mock
	UserDao userDao;

	@Test
	public void testAuthMock() { //test authentication with mock data.
		userDao = mock(UserDao.class);
		authSrv = new AuthenticationServiceImpl();
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

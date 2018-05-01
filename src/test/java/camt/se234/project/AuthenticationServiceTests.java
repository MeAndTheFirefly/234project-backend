package camt.se234.project;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsNull.notNullValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import camt.se234.project.dao.UserDao;
import camt.se234.project.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthenticationServiceTests {
	@Autowired
	UserDao userdao;

	@Test
	public void testAuthentication() {
		assertThat(userdao, is(notNullValue()));
		User u1 = userdao.getUser("admin", "admin");
		assertThat(u1, is(notNullValue()));
		assertThat(u1.getRole(), is("admin"));
		User u2 = userdao.getUser("user", "xxx");
		assertThat(u2, is(nullValue()));
	}
}

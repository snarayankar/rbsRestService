package javaAPI.java.test;

import javax.persistence.EntityManager;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
public abstract class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
package minipj.sh.mapper;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {

	@Autowired
	private DataSource dataSouce;
	
	// 데이터연결test
	@Test
	public void testConnection() {
		try(Connection conn=dataSouce.getConnection()) {
			log.info(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

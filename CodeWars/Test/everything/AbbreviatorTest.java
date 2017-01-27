package everything;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AbbreviatorTest {
	
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAbbreviate() {
		String result = "i18r";
		
		equals(result.equals(Abbreviator.abbreviate("internationalization")));
	}

}

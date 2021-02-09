package whitlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import whitoutlist.DefaultUser;

public class DefaultUserTest {
	
	@Test
	public void shouldIncrementIdFOrEachNewUser() {
		assertEquals(1, new DefaultUser().getId());
		assertEquals(2, new DefaultUser().getId());
	}

}

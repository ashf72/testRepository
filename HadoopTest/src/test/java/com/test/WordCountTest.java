package com.test;

import org.junit.Test;

public class WordCountTest {

	@Test
	public void test() throws Exception {
		WordCount.execute("var/input.txt", "var/out");
	}

}

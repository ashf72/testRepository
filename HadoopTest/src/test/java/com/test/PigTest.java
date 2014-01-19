package com.test;

import java.util.Iterator;

import org.apache.pig.ExecType;
import org.apache.pig.PigServer;
import org.apache.pig.data.Tuple;
import org.junit.Test;

public class PigTest {

	@Test
	public void test() throws Exception {
		PigServer pigServer = new PigServer(ExecType.LOCAL);
		pigServer.registerScript("src/main/pig/WordCount.pig");
		Iterator<Tuple> iterator = pigServer.openIterator("out");
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		pigServer.shutdown();
	}

}

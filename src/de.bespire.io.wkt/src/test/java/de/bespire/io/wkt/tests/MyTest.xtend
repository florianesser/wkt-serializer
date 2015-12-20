package de.bespire.io.wkt.tests

import com.google.inject.Inject
import de.bespire.io.wkt.wkt.WKT
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(WellKnownTextInjectorProvider)
public class MyTest
{
	@Inject
	ParseHelper<WKT> parseHelper;
	
	@Test 
	def void testParse() {
		val result = parseHelper.parse('''
			GEODCRS /* Blah */ [ "" ]
		''')
		Assert.assertNotNull(result)
	}

	@Test 
	def void shouldFail() {
		val result = parseHelper.parse('''
			INVALIDCRS /* Blah */ [ "" ]
		''')
		Assert.assertNotNull(result)
	}

	@Test 
	def void mustFail() {
		Assert.fail()
	}
	
}
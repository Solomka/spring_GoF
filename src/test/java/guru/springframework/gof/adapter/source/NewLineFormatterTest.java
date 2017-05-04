package guru.springframework.gof.adapter.source;

import org.junit.Test;

import guru.springframework.gof.adapter.adaptee.CsvFormattable;
import guru.springframework.gof.adapter.adaptee.CsvFormatter;
import guru.springframework.gof.adapter.csvadapter.CsvAdapterImpl;

public class NewLineFormatterTest {
	@Test
	public void testFormatText() throws Exception {

		String testString = " Formatting line 1. Formatting line 2. Formatting line 3.";
		
		TextFormattable newLineFormatter = new NewLineFormatter();
		String resultString = newLineFormatter.formatText(testString);
		System.out.println(resultString);

		CsvFormattable csvFormatter = new CsvFormatter();
		//adapter usage
		TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
		
		System.out.println(testString);
		String resultCsvString = csvAdapter.formatText(testString);
		System.out.println(resultCsvString);
	}
}
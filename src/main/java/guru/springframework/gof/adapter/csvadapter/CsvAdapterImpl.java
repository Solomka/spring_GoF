package guru.springframework.gof.adapter.csvadapter;

import guru.springframework.gof.adapter.adaptee.CsvFormattable;
import guru.springframework.gof.adapter.source.TextFormattable;

/*
 * encapsulates relationship with external API
 * if API will be changed, we will change just this class 
 * NOT other parts of our app that uses this API 
 */
public class CsvAdapterImpl implements TextFormattable {
	CsvFormattable csvFormatter;

	public CsvAdapterImpl(CsvFormattable csvFormatter) {
		this.csvFormatter = csvFormatter;
	}

	@Override
	public String formatText(String text) {
		String formattedText = csvFormatter.formatCsvText(text);
		return formattedText;
	}
}

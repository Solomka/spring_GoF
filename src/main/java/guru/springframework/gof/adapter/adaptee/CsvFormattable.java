package guru.springframework.gof.adapter.adaptee;

/* real object interface */
// Transmitter API
public interface CsvFormattable {

	String formatCsvText(String text);
}

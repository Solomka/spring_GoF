package guru.springframework.gof.iterator;

/*
 * general working manner of Iterator independently from the Aggregate
 * визначає спосіб перебору елементів колекції
 */
public interface PatternIterator {
	
	DesignPattern nextPattern();

	boolean isLastPattern();
}

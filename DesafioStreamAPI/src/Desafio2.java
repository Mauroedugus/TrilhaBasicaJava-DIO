import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio2 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> pares = n -> n % 2 == 0;
		
		BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;
		
		List<Integer> numerosPares = numeros.stream()
				.filter(pares)
				.collect(Collectors.toList());
		
		int resultado = numerosPares.stream()
			.reduce(0, soma);
		
		System.out.print(resultado);
	}
}

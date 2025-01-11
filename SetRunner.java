package collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A','C','B','A','Z','F');
		Set<Character> treeSet =new TreeSet<Character>(characters);
		Set<Character> linkedTreeSet=new LinkedHashSet<>(characters);
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("treeSet"+treeSet);
		System.out.println("linkedTreeSet "+linkedTreeSet);
		System.out.println("hashSet" + hashSet);

	}

}

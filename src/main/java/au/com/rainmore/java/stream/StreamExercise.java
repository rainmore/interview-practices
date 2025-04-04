package au.com.rainmore.java.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExercise {

    public record IntPair(Integer a, String b) {}

    public int[] intSorted(int[] data) {
        return Arrays.stream(data).sorted().toArray();
    }

    public int[] intReversedSorted(int[] data) {
        IntStream intStream = Arrays.stream(data);

        return intStream.boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
    }

    public List<IntPair> intReversedSorted(List<IntPair> data) {
//        return data.stream().sorted((left, right) -> {
//            if (left.b.equals(right.b)) {
//                return 0;
//            }
//            else if (left.b.compareTo(right.b) < 0) {
//                return 1;
//            }
//            else {
//                return -1;
//            }
//        }).toList();

        return data.stream().sorted((left, right) -> left.b.compareToIgnoreCase(right.b)).toList();
    }

    public void flatMap(IntPair[] data) {}

    public Map<Integer, String> streamToMap(int[] data) {
        IntStream intStream = Arrays.stream(data);
        return intStream.boxed()
                .map(integer ->
                        new IntPair(integer, String.format("%d", integer))
                    )
                .collect(Collectors.toUnmodifiableMap(IntPair::a, IntPair::b));
    }

    public Map<Integer, String> streamToLinkedMap(int[] data) {
        IntStream intStream = Arrays.stream(data);
        return intStream.boxed()
                .map(integer ->
                        new IntPair(integer, String.format("%d", integer))
                    )
                .collect(Collectors.toMap(
                        IntPair::a,
                        IntPair::b,
                        (o1, o2) -> o1,
                        LinkedHashMap::new));
    }
}

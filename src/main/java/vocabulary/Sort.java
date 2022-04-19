package vocabulary;
@FunctionalInterface
public interface Sort <T,N> {
    N sort(T t);
}

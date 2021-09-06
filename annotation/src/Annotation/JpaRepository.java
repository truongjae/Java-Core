package Annotation;

public interface JpaRepository<T> {
    void save(T t);
}

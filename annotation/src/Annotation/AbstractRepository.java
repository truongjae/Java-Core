package Annotation;

public class AbstractRepository<T> implements JpaRepository<T>{
    @Override
    public void save(T t) {

    }
}

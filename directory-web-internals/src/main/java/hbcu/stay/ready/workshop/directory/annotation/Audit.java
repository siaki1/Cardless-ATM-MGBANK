package hbcu.stay.ready.workshop.directory.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)

@Retention(RetentionPolicy.RUNTIME)


public class Audit {
    Auditor value()default Auditor.NOTHING;

}
public enum Auditor {
    BEFORE, AFTER, BEFORE_AND_AFTER, NOTHING
}




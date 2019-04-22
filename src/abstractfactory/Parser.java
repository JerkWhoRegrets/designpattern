package abstractfactory;

import java.io.File;
import java.util.List;

public interface Parser {
    List<Record> parse(File file);
}

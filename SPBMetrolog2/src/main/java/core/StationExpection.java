package core;

import java.util.IllegalFormatException;

public class StationExpection extends IllegalArgumentException {
    public StationExpection(String message) {
        super(message);
    }
}

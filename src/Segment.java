
import java.time.*;
        import java.time.format.DateTimeFormatter;
        import java.util.Objects;

public class Segment {
    private final LocalDateTime departureDate;

    private final LocalDateTime arrivalDate;

    private final Integer id;

    Segment(final LocalDateTime dep, final LocalDateTime arr, Integer id) {
        departureDate = Objects.requireNonNull(dep);
        arrivalDate = Objects.requireNonNull(arr);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    LocalDateTime getDepartureDate() {
        return departureDate;
    }

    LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        return '[' + departureDate.format(fmt) + '|' + arrivalDate.format(fmt)
                + ']';
    }
}



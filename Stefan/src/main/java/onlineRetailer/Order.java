package onlineRetailer;

import java.time.LocalDate;
import java.util.List;

public interface Order {
    long sum(AbstractOrder abstractOrder);

    int count(List<AbstractOrder> userOrders);

    LocalDate getDate();
}

package directdronedelivery.drone.management.communication;

import java.util.Collections;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class DeliveryRoute {
    
    @Getter List<Checkpoint> checkpoints;
    
    private DeliveryRoute() {
    }
    
    public static DeliveryRoute newDeliveryRoute(List<Checkpoint> checkpoints) {
        DeliveryRoute route = new DeliveryRoute();
        route.checkpoints = Collections.unmodifiableList(checkpoints);
        
        return route;
    }
    
    public static DeliveryRoute noDeliveryRouteUploaded() {
        DeliveryRoute route = new DeliveryRoute();
        route.checkpoints = Collections.emptyList();
        
        return route;
    }
    
}

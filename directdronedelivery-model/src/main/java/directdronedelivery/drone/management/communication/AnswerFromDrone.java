package directdronedelivery.drone.management.communication;

import java.util.List;

import directdronedelivery.drone.DroneAggregate;
import directdronedelivery.warehouse.Problem;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class AnswerFromDrone {
    
    @Getter protected DroneAggregate drone;
    @Getter protected List<Problem> problems;
    
    private AnswerFromDrone() {
    }
    
    public static AnswerFromDrone newAnswer(DroneAggregate drone, List<Problem> problems) {
        AnswerFromDrone answerFromDrone = new AnswerFromDrone();
        answerFromDrone.drone = drone;
        answerFromDrone.problems = problems;
        
        return answerFromDrone;
    }
    
}

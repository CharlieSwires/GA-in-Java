package chapter5;

import java.util.HashMap;
import java.util.Map;

public class Availability extends HashMap {

    private Map<Integer,Timeslot> slots= new HashMap<Integer,Timeslot>();

    public Availability(Map<Integer, Timeslot> slots) {
        super();
        this.slots = slots;
    }
    public Map<Integer, Timeslot> getSlots() {
        return slots;
    }
    public void setSlots(Map<Integer, Timeslot> slots) {
        this.slots = slots;
    }
    
    
}

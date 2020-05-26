package chapter5;

import java.util.HashMap;
import java.util.Map;

public class Availability extends HashMap {

    private Map<Integer,Timeslot> slots= new HashMap<Integer,Timeslot>();

    public Availability(Map<Integer, Timeslot> slots) {
        super();
        for (Integer k : slots.keySet()) {
            this.slots.put(k,slots.get(k));
        }
    }
    public Map<Integer, Timeslot> getSlots() {
        return slots;
    }
    public void setSlots(Map<Integer, Timeslot> slots) {
        this.slots = slots;
    }
    
    
}

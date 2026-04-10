package Logistics;

public class CheckpointDetails {
    String checkpointId;
    String locationName;
    int distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getDistanceFromLast() {
        return distanceFromLast;
    }

    public void setDistanceFromLast(int distanceFromLast) {
        this.distanceFromLast = distanceFromLast;
    }

    public int getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(int expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public int getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(int actualDuration) {
        this.actualDuration = actualDuration;
    }
}

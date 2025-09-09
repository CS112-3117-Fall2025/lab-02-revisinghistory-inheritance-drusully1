public class HistoricalEvent {
    /********** INSTANCE VARIABLES **********/
    private String description;
    private Date eventDate;


    /********** CONSTRUCTORS **********/
    public HistoricalEvent() {
        description = "";
        eventDate = new Date();
    }

    public HistoricalEvent(String description, Date eventDate) {
        this.description = description;
        this.eventDate = eventDate;
    }

    /********** SETTERS / MUTATORS **********/
    public void setDescription(String description) {
        this.description = description;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    public Date getEventDate() {
        return eventDate;
    }

    /********** OTHER REQUIRED METHODS **********/
    @Override
    public String toString()
    {
        return "On " + eventDate + ": " + description;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        HistoricalEvent that = (HistoricalEvent) other;
        return description.equals(that.description) && eventDate.equals(that.eventDate);
    }
}

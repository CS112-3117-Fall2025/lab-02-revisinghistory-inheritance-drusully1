public class RevisedHistoricalEvent extends HistoricalEvent {
    /********** INSTANCE VARIABLES **********/
    private String revisedDescription;
    private String citation;

    /********** CONSTRUCTORS **********/
    public RevisedHistoricalEvent(String description, Date eventDate, String revisedDescription, String citation) {
        super(description, eventDate);
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    /********** SETTERS / MUTATORS **********/
    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public String getRevisedDescription() {
        return revisedDescription;
    }

    public String getCitation() {
        return citation;
    }

    /********** OTHER REQUIRED METHODS **********/
    public void teach()
    {
        System.out.println("The following \"history\" was told for many years:");
        System.out.println("\nOn " + getEventDate() + ": " + getDescription());
        System.out.println("\nBy correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.\nHere is the revised history:\n" + getRevisedDescription());
        System.out.println("\nSource: " + getCitation());
    }

    @Override
    public String toString() {
        return "On " + getEventDate() + ": " + getDescription() + "\n\n" + revisedDescription + "\n\n" + citation;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        RevisedHistoricalEvent that = (RevisedHistoricalEvent) other;

        if (!getDescription().equals(that.getDescription())) return false;

        return this.getEventDate().equals(that.getEventDate()) && getCitation().equals(that.getCitation()) && getRevisedDescription().equals(that.getRevisedDescription()) && super.equals(other);
    }
}

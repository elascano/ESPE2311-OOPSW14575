public clas Event{
  private int id;
  private Schedule startTime;
  private Schedule endTime;
  private Artist artist;
  private float estimatedCost;
  private Staff[] staff;
  private Equipment[] equipment;
  private EventPlace place;

  public void addStaff(Staff staff);
  public void setEventPlace(EventPlace eventPlace);
  public void setArtistForEvent(Artist artist);
  public void addEquipment(Equipment equipment);
  public void setStartTime (Schedule startTime);
  public void setEndTime (Schedule endTime);
}


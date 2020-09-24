package generics;

abstract class Media {
    String title;
    boolean available;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString(){
        return "\n" + "Title: " + title + ". Available: " + available;
    }
}

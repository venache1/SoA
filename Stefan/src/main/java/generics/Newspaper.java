package generics;

 class Newspaper extends Media{
    String language;

    public Newspaper(String title, String language, boolean available) {
        this.title = title;
        this.language = language;
        this.available = available;
    }

     public String getLanguage() {
         return language;
     }

     public void setLanguage(String language) {
         this.language = language;
     }
 }

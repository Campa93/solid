package exercise.srp;

public class Post {

    private final String author;
    private final String title;
    private final String body;

    public Post(
            String author,
            String title,
            String body) {
        this.author = author;
        this.title = title;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void printPost(){
        System.out.println(this.getAuthor() + "\n" + this.getTitle() + "\n"+ this.getBody());
    }

    public String jsonFormat(){
        return "{\n" +
                "\t\"author\" : \"" + this.getAuthor() + "\",\n" +
                "\t" + "\"title\" : \"" + this.getTitle() + "\",\n" +
                "\t" + "\"body\" : \"" + this.getBody() + "\"\n" +
                "}";
    }



}

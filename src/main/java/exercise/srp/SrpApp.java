package exercise.srp;

public class SrpApp {

    public static void main(String[] args) {
        //TODO Try to print a post to console
        Post post = new Post ("Mattia", "Chi è Mattia?", "Questo post parla di Mattia");
        post.printPost();
        System.out.print("\n\nFormatting in JSon");
        System.out.print(post.jsonFormat());
    }
}

package exercise.finalex.model;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ReportTest {

    @Test
    public void repoCount() {
        List<String> commitsList1 = Arrays.asList("messaggio1", "messaggio2", "messaggio3");
        List<String> commitsList2 = Arrays.asList("messaggio4", "messaggio5", "messaggio6");
        List<String> commitsList3 = Arrays.asList("messaggio7", "messaggio8", "messaggio9");

        List<Repo> repoList = Arrays.asList(
                new Repo(3, "name1", "description1", commitsList1),
                new Repo(5, "name2", "description2", commitsList2),
                new Repo(1, "name3", "description3", commitsList3)
        );
        Report report = new Report("username", repoList);

        assert report.repoCount() == 3;

    }

    @Test
    public void repoCountWithEmptyRepos() {

        List<Repo> repoList = Collections.emptyList();
        Report report = new Report("username", repoList);

        assert report.repoCount() == 0;

    }

    @Test
    public void mostStarredRepoWithEmptyStars() {

        List<Repo> repoList = Collections.emptyList();
        Report report = new Report("username", repoList);

        Repo repoMostStarred = new Repo(0, "repoTest", "repoTest", new ArrayList<>());

//        assertThat(report.mostStarredRepo(), is(Optional.empty()));



    }

    @Test
    public void mostStarredRepo() {

        List<String> commitsList1 = Arrays.asList("messaggio1", "messaggio2", "messaggio3");
        List<String> commitsList2 = Arrays.asList("messaggio4", "messaggio5", "messaggio6");
        List<String> commitsList3 = Arrays.asList("messaggio7", "messaggio8", "messaggio9");

        List<Repo> repoList = Arrays.asList(
                new Repo(3, "name1", "description1", commitsList1),
                new Repo(5, "name2", "description2", commitsList2),
                new Repo(1, "name3", "description3", commitsList3)
        );
        Report report = new Report("username", repoList);

//        assertThat(report.mostStarredRepo().isPresent());

    }
}
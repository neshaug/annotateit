import models.User;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

@OnApplicationStart
public class Bootstrap extends Job {

    @Override
    public void doJob() {
        Fixtures.deleteDatabase();
        Fixtures.loadModels("fixtures.yml");
    }
}

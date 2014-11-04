package home;

import CnnCommon.Page;
import org.testng.annotations.Test;

/**
 * Created by ismailosmanjan on 4/9/14.
 */
public class NewsPage extends Page {

    @Test
    public void newsPage() {
        goToEntertainment();
        goToHealth();
        goToJustice();
    }

}

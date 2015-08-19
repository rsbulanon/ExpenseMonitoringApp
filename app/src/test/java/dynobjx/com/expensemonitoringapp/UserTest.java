package dynobjx.com.expensemonitoringapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import dynobjx.com.expensemonitoringapp.models.User;

/**
 * Created by rsbulanon on 8/19/15.
 */
@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class UserTest {

    @Test
    public void UserNameTest() {
        User u = new User();
        u.setName("foo");
        Assert.assertEquals("foo", u.getName());
    }
}

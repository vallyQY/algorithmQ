package algorithmTestMain;

import com.qy.User;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionSpecial {

    @Test
    public void testCreate(){
        Optional<Object> optional = Optional.empty();

        Optional<Object> optional1 = Optional.of("hello");
        assertEquals(optional1.get(),"hello");

        User qy = new User("qy",25,"male");
        Optional<User> optional2 = Optional.ofNullable(qy);

        User q = null;
        User userCompare = Optional.ofNullable(q).orElse(qy);
        assertEquals(userCompare,qy);

        User user = new User("john@gmail.com","1234");
        User user2 = new User("anna@gmail.com", "1234");
        User userOrElseGet = Optional.ofNullable(user).orElseGet(()->user2);
        assertEquals(userOrElseGet.getEmail(),user.getEmail());
    }

    private User createNewUser() {
        return new User("extra@gmail.com", "1234");
    }
}

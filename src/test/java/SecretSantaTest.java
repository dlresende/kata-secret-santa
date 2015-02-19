import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SecretSantaTest {
    @Test
    public void pair_people() {
        List<String> names = new ArrayList<String>();
        names.add("Diego Lemos");
        names.add("Aymen Jouini");
        names.add("John Smith");

        Map<String, String> pairs =  shake(names);

        assertThat(names.contains(pairs.get("Diego Lemos")), is(true));
        assertThat(names.contains(pairs.get("Aymen Jouini")), is(true));
        assertThat(names.contains(pairs.get("John Smith")), is(true));
    }


    @Test
    public void people() {
        List<String> names = new ArrayList<String>();
        names.add("Diego Lemos");
        names.add("Aymen Jouini");
        names.add("John Smith");

        Map<String, String> pairs =  shake(names);

        assertThat(names.contains(pairs.get("Diego Lemos")), is(true));
        assertThat(names.contains(pairs.get("Aymen Jouini")), is(true));
        assertThat(names.contains(pairs.get("John Smith")), is(true));
    }




    private Map<String, String> shake(List<String> names) {
            Map<String, String> pairs = new HashMap<String,String>();

        for(String item:names){
            pairs.put(item,item);
        }

        return pairs;
    }
}

package jp.co.biglobe.lib.sample.component.en;

import jp.co.biglobe.lib.sample.plugins.Greeting;
import lombok.Data;

@Data
public class GreetingImpl implements Greeting {

    private final String name;

    @Override
    public String whatYourName() {
        return "Hello, " + name;
    }
}

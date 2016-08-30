package ut.com.happiestminds.devops.plugins;

import org.junit.Test;
import com.happiestminds.devops.plugins.api.MyPluginComponent;
import com.happiestminds.devops.plugins.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
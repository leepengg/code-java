package la.niub.finagle.thrift;

import com.twitter.util.Future;
import la.niub.thriftjava.Hello;

/**
 * Created by peng on 14-12-29.
 */
public class HelloImpl implements Hello.ServiceIface {

    @Override
    public Future<String> hi() {
        System.out.println("hi called");
        return Future.value("hello finagle!");
    }
}

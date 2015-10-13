package la.niub.finagle.thrift;

import la.niub.thriftjava.Hello;
import org.apache.thrift.protocol.TProtocolFactory;

/**
 * Created by peng on 14-12-29.
 */
public class HelloService extends Hello.Service {

    public HelloService(Hello.ServiceIface iface, TProtocolFactory protocolFactory) {
        super(iface, protocolFactory);
    }
}

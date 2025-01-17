package me.sheimi.sgit.ssh;

import org.eclipse.jgit.api.TransportConfigCallback;
import org.eclipse.jgit.transport.SshTransport;
import org.eclipse.jgit.transport.Transport;
import org.eclipse.jgit.transport.SshSessionFactory;

/**
 * Created by sheimi on 8/22/13.
 */
public class SgitTransportCallback implements TransportConfigCallback {

    @Override
    public void configure(Transport tn) {
        if (tn instanceof SshTransport) {
            ((SshTransport) tn).setSshSessionFactory(SshSessionFactory.getInstance());
        }
    }
}

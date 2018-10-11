package net.alexsk.lobster;


import javax.enterprise.inject.spi.InjectionPoint;
import javax.ws.rs.Produces;
import java.util.logging.Logger;

/**
 * Created by alexsk on 11.10.18.
 */

public class LoggingProducer {
    @Produces
    private Logger createLogger (InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }

}
